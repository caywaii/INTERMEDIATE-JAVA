
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.desktop.AboutEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.*;
import java.awt.*;

public class frmStudents {

	DbModel model =  new DbModel();
	JMenuBar menubar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenuItem exit = new JMenuItem ("Exit");
	ExitOption close = new ExitOption();
	
	
	protected static final String DefaultTableModel = null;
	public frmStudents() {
		//NAME OF THE HEADER
		super("STUDENTS INFORMATION SYSTEM");
		setLayout(null);
		setJMenuBar(menubar);
		
		//PANEL TO SET COLOR BG
		JPanel bg = new JPanel();
		setContentPane(bg);
		bg.setLayout(null);
		bg.setBackground(new Color(247, 208, 244));
		
		JLabel lblheader = new JLabel("STUDENT RECORD");
		lblheader.setBounds(230, 10, 200, 30);
		add(lblheader);
		//EXIT MENU BAR
		file.setMnemonic('F');
		menubar.add(file);
		exit.setMnemonic('x');
		file.add(exit);
		exit.addActionListener(close);
		menubar.setBackground(Color.DARK_GRAY);
		file.setForeground(Color.pink);
		
		
		//TABLE VARIABLE
		JTable tblStd = new JTable();
		
		//STUDENT NUBMER OF ID SECTION
		JLabel lblStudId = new JLabel("Student ID");
		lblStudId.setBounds(100, 50, 200, 30);
		add(lblStudId);
		
		JTextField txtStudId = new JTextField(8);
		txtStudId.setBounds(220, 50, 200, 30);
		add(txtStudId);

		//STUDENT NAME SECTION
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(100, 85, 200, 30);
		add(lblName);
		
		JTextField txtName = new JTextField(15);
		txtName.setBounds(220, 85, 200, 30);
		add(txtName);
		
		//SEARCH BOX
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(100,155,200,30);
		add(lblSearch);

		JTextField txtSearch = new JTextField(15);
		txtSearch.setBounds(220,155,200,30);
		add(txtSearch);
		txtSearch.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent args) {

				model.SearchBox(tblStd, txtSearch.getText());
			}
		});
		
		//GENDER 
		JLabel lblGender = new JLabel("Sex");
		lblGender.setBounds(100, 120, 200, 30);
		add(lblGender);
		
		String[] valCbb= {"Male", "Female"};
		JComboBox cbbGender = new JComboBox(valCbb);
		cbbGender.setBounds(220, 120, 200, 30);
		add(cbbGender);
		
		//TABLE FUNCTIONS
		DefaultTableModel dtm = (DefaultTableModel) tblStd.getModel();
		Object[] header = {"ID", "NAME", "SEX"};
		final Object[] row = new Object[4];
		dtm.setColumnIdentifiers(header);
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(tblStd);
		tblStd.setModel(dtm);
		sp.setBounds(100, 205, 350, 280);
		setSize(200, 200);
		setVisible(true);
		add(sp);
		tblStd.setBackground(Color.pink);
		
			
		//SAVE BUTTON
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(50, 500, 100, 30);
		add(btnSave);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtStudId.getText().equals("") || txtName.getText().equals("") || 
						cbbGender.getSelectedItem().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Complete Information");
				}else {
					
					model.SaveButton(tblStd,txtStudId.getText(),
					          txtName.getText(),
					          cbbGender.getSelectedItem().toString());	
				}
				
				txtStudId.setText("");
				txtName.setText("");
				cbbGender.setSelectedIndex(0);
				txtStudId.requestFocus();
				txtStudId.requestFocusInWindow(null);

			}
			
		});
		
		//UPDATE BUTTON
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(170, 500, 100, 30);
		add(btnUpdate);
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				if(txtStudId.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null,  "Missing Student ID");
				}else {
					
					//====
					model.UpdateButton(tblStd, txtStudId.getText(),
					          txtName.getText(),
					          cbbGender.getSelectedItem().toString());
					
				}
	
				txtStudId.setText("");
				txtName.setText("");
				cbbGender.setSelectedIndex(0);
				txtStudId.requestFocus();
				txtStudId.requestFocusInWindow(null);
			}
		});
		
		//VIEW LIST
		JButton btnPopulate = new JButton("View List");
		btnPopulate.setBounds(290, 500, 100, 30);
		add(btnPopulate);
		btnPopulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
							
				//====
				model.ViewTable(tblStd);
				
			}
		});
		

		//DELETE BUTTON 
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(410, 500, 100, 30);
		add(btnDelete);
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtStudId.getText().equals("")) {
	
					JOptionPane.showMessageDialog(null,  "Missing Student ID");
				}else {
					
					//====
					model.DeleteButton(tblStd,txtStudId.getText());
				}
				
				txtStudId.setText("");
				txtName.setText("");
				cbbGender.setSelectedIndex(0);
				txtStudId.requestFocus();
				txtStudId.requestFocusInWindow(null);
			}
			
		});
			
		//HOVER BUTTON
		//save button
		  btnSave.addMouseListener(new MouseAdapter() 
	      {
	         public void mouseEntered(MouseEvent evt) 
	         {
	            btnSave.setBackground(new Color(255, 99, 239));
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	            btnSave.setBackground(null);
	         }
	      });
		  
		//view list Button
		  btnPopulate.addMouseListener(new MouseAdapter() 
		      {
		         public void mouseEntered(MouseEvent evt) 
		         {
		            btnPopulate.setBackground(new Color(255, 99, 239));
		         }
		         public void mouseExited(MouseEvent evt) 
		         {
		            btnPopulate.setBackground(null);
		         }
		      });
		  
		  //update button
		  btnUpdate.addMouseListener(new MouseAdapter() 
	      {
	         public void mouseEntered(MouseEvent evt) 
	         {
	            btnUpdate.setBackground(new Color(255, 99, 239));
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	            btnUpdate.setBackground(null);
	         }
	      });
		  
		  //delete button
		  btnDelete.addMouseListener(new MouseAdapter() 
	      {
	         public void mouseEntered(MouseEvent evt) 
	         {
	            btnDelete.setBackground(new Color(255, 99, 239));
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	            btnDelete.setBackground(null);
	         }
	      });
		}
	
	//EXIT FUNCTION
	public class ExitOption implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String messageBox = "Are you sure you want to close the application?";
			int ans = JOptionPane.showConfirmDialog(null, messageBox, "Exit", JOptionPane.YES_NO_OPTION);
			if(ans==JOptionPane.YES_OPTION) {
				System.exit(0);
		}
			
		}
		
	}
	
}
