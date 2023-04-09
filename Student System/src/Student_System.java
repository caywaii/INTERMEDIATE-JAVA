import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_System {

	//Variables
	
	//Frame
	JFrame frmStudentSystem;
	
	//JTextField
	JTextField tfStudNumber;
	JTextField tfFullName;
	JTextField tfBarangay;
	JTextField tfTown;
	JTextField tfSearch;
	
	//JLabel
	JLabel lblStudentNum;
	JLabel lblStudentName;
	JLabel lblBarangay;
	JLabel lblTown;
	JLabel lblSearch;
	JLabel lblConnection;
	
	//JButton
	JButton btnSearch;
	JButton btnHardLeft;
	JButton btnLeft;
	JButton btnRight;
	JButton btnHardRight;
	JButton btnAdd;
	JButton btnEdit;
	JButton btnSave;
	JButton btnCancel;
	JButton btnDelete;
	JButton btnReload;
	JButton btnViewRecords;
	
	//Database
	
	String connection = "jdbc:mysql://localhost:3306/studentsystem";
	String username = "root";
	String password = "";
	
	Connection conn;
	PreparedStatement preparedS;
	ResultSet rs;
	String query;
	
	//Database Import
	
	private void DataImport() {
		try {
			conn = DriverManager.getConnection(connection, username, password);
			query = "SELECT * FROM studentstable";
					
			preparedS = conn.prepareStatement(query);
			rs = preparedS.executeQuery();
			conn.close();
			
			lblConnection.setText("Set Off! Connected");
			lblConnection.setForeground(Color.GREEN);
					
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			lblConnection.setText("Down! Failed");
			lblConnection.setForeground(Color.red);
		}
	}
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_System window = new Student_System();
					window.frmStudentSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_System() {
		initialize();
		DataImport();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentSystem = new JFrame();
		frmStudentSystem.setTitle("Student System");
		frmStudentSystem.setFont(new Font("Impact", Font.PLAIN, 12));
		frmStudentSystem.setBounds(100, 100, 814, 1001);
		frmStudentSystem.setLocationRelativeTo(null);
		frmStudentSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentSystem.getContentPane().setLayout(null);
		
		lblStudentNum = new JLabel("Student Number (SNo)");
		lblStudentNum.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblStudentNum.setBounds(28, 29, 175, 39);
		frmStudentSystem.getContentPane().add(lblStudentNum);
		
		lblStudentName = new JLabel("Student Full Name (SName)");
		lblStudentName.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblStudentName.setBounds(28, 79, 217, 39);
		frmStudentSystem.getContentPane().add(lblStudentName);
		
		lblBarangay = new JLabel("Barangay");
		lblBarangay.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblBarangay.setBounds(28, 129, 92, 39);
		frmStudentSystem.getContentPane().add(lblBarangay);
		
		lblTown = new JLabel("Town");
		lblTown.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblTown.setBounds(28, 179, 64, 39);
		frmStudentSystem.getContentPane().add(lblTown);
		
		lblSearch = new JLabel("Search using SNo or SName");
		lblSearch.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblSearch.setBounds(28, 297, 225, 39);
		frmStudentSystem.getContentPane().add(lblSearch);
		
		tfStudNumber = new JTextField();
		tfStudNumber.setBounds(267, 36, 217, 30);
		frmStudentSystem.getContentPane().add(tfStudNumber);
		tfStudNumber.setColumns(10);
		
		tfFullName = new JTextField();
		tfFullName.setColumns(10);
		tfFullName.setBounds(267, 86, 356, 32);
		frmStudentSystem.getContentPane().add(tfFullName);
		
		tfBarangay = new JTextField();
		tfBarangay.setColumns(10);
		tfBarangay.setBounds(267, 141, 356, 30);
		frmStudentSystem.getContentPane().add(tfBarangay);
		
		tfTown = new JTextField();
		tfTown.setColumns(10);
		tfTown.setBounds(267, 191, 356, 30);
		frmStudentSystem.getContentPane().add(tfTown);
		
		tfSearch = new JTextField();
		tfSearch.setColumns(10);
		tfSearch.setBounds(243, 304, 340, 30);
		frmStudentSystem.getContentPane().add(tfSearch);
		
		btnSearch = new JButton("Search");
		btnSearch.setBounds(597, 304, 117, 30);
		frmStudentSystem.getContentPane().add(btnSearch);
		
		btnHardLeft = new JButton("|<");
		btnHardLeft.setBounds(103, 795, 117, 30);
		frmStudentSystem.getContentPane().add(btnHardLeft);
		
		btnLeft = new JButton("<");
		btnLeft.setBounds(251, 795, 117, 30);
		frmStudentSystem.getContentPane().add(btnLeft);
		
		btnRight = new JButton(">");
		btnRight.setBounds(412, 795, 117, 30);
		frmStudentSystem.getContentPane().add(btnRight);
		
		btnHardRight = new JButton(">|");
		btnHardRight.setBounds(567, 795, 117, 30);
		frmStudentSystem.getContentPane().add(btnHardRight);
		
		btnAdd = new JButton("Add");
		btnAdd.setName("");
		btnAdd.setBounds(28, 836, 117, 30);
		frmStudentSystem.getContentPane().add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.setBounds(186, 836, 117, 30);
		frmStudentSystem.getContentPane().add(btnEdit);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(341, 836, 117, 30);
		frmStudentSystem.getContentPane().add(btnSave);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(493, 836, 117, 30);
		frmStudentSystem.getContentPane().add(btnCancel);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(654, 836, 117, 30);
		frmStudentSystem.getContentPane().add(btnDelete);
		
		btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataImport();
			}
		});
		btnReload.setBounds(38, 877, 356, 30);
		frmStudentSystem.getContentPane().add(btnReload);
		
		btnViewRecords = new JButton("View All Records");
		btnViewRecords.setBounds(412, 877, 356, 30);
		frmStudentSystem.getContentPane().add(btnViewRecords);
		
		lblConnection = new JLabel("Check Connection");
		lblConnection.setBounds(48, 926, 155, 22);
		frmStudentSystem.getContentPane().add(lblConnection);
	}
}
