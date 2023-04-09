import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;

public class AraViewRecords {

	private JFrame frame;
	private JTable tableList;
	private JButton btnReload;
	private JButton btnSearch;
	private JTextField tfSearch;
	JScrollPane s;
	private ResultSetMetaData resultMeta;
	//DATABASE
	String connection = "jdbc:mysql://localhost:3306/aradatabase";
	String username = "root";
	String password = "";

	Connection c;
	PreparedStatement pS;
	ResultSet rs;
	String query;
	private JLabel SlblStudentList;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AraViewRecords window = new AraViewRecords();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AraViewRecords() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 0));
		frame.getContentPane().setForeground(new Color(255, 204, 0));
		frame.setBounds(100, 100, 1081, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tableList = new JTable();
		s = new JScrollPane(tableList);
		s.setBounds(338, 58, 716, 204);
		frame.getContentPane().add(s);
		
		btnReload = new JButton("Reload");
		btnReload.setBackground(new Color(204, 204, 204));
		btnReload.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				try {
					tableList.setModel(new DefaultTableModel());
					c = DriverManager.getConnection(connection, username, password);
					query = "SELECT * FROM tblschoolsystem";
					pS = c.prepareStatement(query);
					rs = pS.executeQuery();
					resultMeta = (ResultSetMetaData) rs.getMetaData();
					
					String titles [] = {"First Name", "Middle Name", "Surname", "Age", "Birthday", "Email Address" , "Contact", "Address", "School Year", "Student Id"};
					ResultSetMetaData resMeta = (ResultSetMetaData) rs.getMetaData();
					DefaultTableModel tblmdl = (DefaultTableModel) tableList.getModel();
					tblmdl.setColumnIdentifiers(titles);
					
					String ONo, CustomerName, Barangay, Town, State, PhoneNum , EmailAdd, Product, Note, Date;
					while(rs.next()) {
						ONo = rs.getString(1); 
						CustomerName = rs.getString(2);
						Barangay = rs.getString(3);
						Town = rs.getString(4);
						State = rs.getString(5); 
						PhoneNum = rs.getString(6);
						EmailAdd = rs.getString(7);
						Product = rs.getString(8);
						Note = rs.getString(9); 
						Date = rs.getString(10);
						String [] tbls = {ONo, CustomerName, Barangay, Town, State, PhoneNum , EmailAdd, Product, Note, Date };
						tblmdl.addRow(tbls);
						}
					pS.close();
					c.close();
						}catch (Exception e1) {
					System.out.println(e1);	
				}
			}
		});
		btnReload.setBounds(61, 86, 192, 43);
		frame.getContentPane().add(btnReload);
		
		btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(204, 204, 204));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tblSearch = tfSearch.getText();
				
				DefaultTableModel dtm = (DefaultTableModel) tableList.getModel();
				TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
				tableList.setRowSorter(sorter);
				sorter.setRowFilter(RowFilter.regexFilter(tblSearch.trim()));
			}
		});
		btnSearch.setBounds(61, 194, 192, 43);
		frame.getContentPane().add(btnSearch);
		
		tfSearch = new JTextField();
		tfSearch.setBackground(new Color(153, 153, 153));
		tfSearch.setBounds(64, 163, 189, 20);
		frame.getContentPane().add(tfSearch);
		tfSearch.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 0, 1065, 54);
		frame.getContentPane().add(panel);
		
		SlblStudentList = new JLabel("Student List");
		panel.add(SlblStudentList);
		SlblStudentList.setForeground(new Color(255, 255, 255));
		SlblStudentList.setFont(new Font("Tahoma", Font.PLAIN, 30));
	}
}
