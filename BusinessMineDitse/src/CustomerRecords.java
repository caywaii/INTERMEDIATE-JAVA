import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPanel;

public class CustomerRecords {
	
	//FRAME
	JFrame frmCustomerInformationSystem;
	JButton btnBack;
	JScrollBar scrollBar;
	JTable customerTable;
	JScrollPane scroll;
	JButton btnDisplay;
	JButton btnSearch;
	
	String connection = "jdbc:mysql://localhost:3306/mineditse";
	String username = "root";
	String password = "";

	Connection conn;
	PreparedStatement preparedS;
	ResultSet resultSet;
	ResultSetMetaData resultMeta;
	String query;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRecords window = new CustomerRecords();
					window.frmCustomerInformationSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private JTextField tfSearch;
	
	public void btnDataFunction() {
		try {
			resultSet.getString(1);
			resultSet.getString(2);
			resultSet.getString(3);
			resultSet.getString(4);
			resultSet.getString(5);
			resultSet.getString(6);
			resultSet.getString(7);
			resultSet.getString(8);
			resultSet.getString(9);
			resultSet.getString(10);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public CustomerRecords() {
		initialize();
	}
	
	public void initialize() {
		frmCustomerInformationSystem = new JFrame();
		frmCustomerInformationSystem.setTitle("Customer Information System");
		frmCustomerInformationSystem.getContentPane().setBackground(new Color(211, 211, 211));
		frmCustomerInformationSystem.setBounds(100, 100, 1027, 501);
		frmCustomerInformationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomerInformationSystem.getContentPane().setLayout(null);
		frmCustomerInformationSystem .setVisible(true);


		customerTable = new JTable();
		scroll = new JScrollPane(customerTable);
		scroll .setBounds(97, 150, 809, 274);
		frmCustomerInformationSystem.getContentPane().add(scroll);
		
		btnDisplay = new JButton("Reload");
		btnDisplay.setBackground(new Color(255, 182, 193));
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerList();
				
			}
		});
		btnDisplay.setBounds(26, 82, 277, 51);
		frmCustomerInformationSystem.getContentPane().add(btnDisplay);
		
		btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(255, 182, 193));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSearch();
				tfSearch.setText("");
			}
		});
		btnSearch.setBounds(792, 102, 184, 31);
		frmCustomerInformationSystem.getContentPane().add(btnSearch);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(792, 71, 184, 20);
		frmCustomerInformationSystem.getContentPane().add(tfSearch);
		tfSearch.setColumns(10);
		
		JLabel lblMineDitse = new JLabel("Mine Ditse");
		lblMineDitse.setFont(new Font("Sitka Small", Font.BOLD, 30));
		lblMineDitse.setBounds(332, 11, 198, 51);
		frmCustomerInformationSystem.getContentPane().add(lblMineDitse);
		
		JLabel lblCustomertable = new JLabel("Customer Table");
		lblCustomertable.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblCustomertable.setBounds(525, 14, 250, 46);
		frmCustomerInformationSystem.getContentPane().add(lblCustomertable);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 60, 1152, 2);
		frmCustomerInformationSystem.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(0, 0, 1011, 60);
		frmCustomerInformationSystem.getContentPane().add(panel);
		customerTable.setVisible(true);
		
	}
	
	public void CustomerList() {
		try {
			
			conn = DriverManager.getConnection(connection, username, password);
			query = "SELECT * FROM tblmineditse";
			preparedS = conn.prepareStatement(query);
			resultSet = preparedS.executeQuery();
			resultMeta = (ResultSetMetaData) resultSet.getMetaData();
			
			String[] headers = {"Date of Live", "Name", "Code", "Contact", "Country", "Street", "Barangay", "City", "Province", "Mine Price"};
			DefaultTableModel dtm = new DefaultTableModel(headers, 0);
			
			String date, name, code, contact, country, street, barangay, city, province, mine;
			while(resultSet.next()) {
				date = resultSet.getString(1);
				name = resultSet.getString(2);
				code = resultSet.getString(3);
				contact = resultSet.getString(4);
				country = resultSet.getString(5);
				street = resultSet.getString(6);
				barangay = resultSet.getString(7);
				city = resultSet.getString(8);
				province = resultSet.getString(9);
				mine = resultSet.getString(10);
				
				String[] row = {date, name, code, contact, country, street, barangay, city, province, mine};
				dtm.addRow(row);
			}
			customerTable.setModel(dtm);
			conn.close();
			
		
		}catch(Exception e) {System.out.println(e);}
	}
	public void btnSearch() {
		String search = tfSearch.getText();
		
		DefaultTableModel dtm = (DefaultTableModel) customerTable.getModel();
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
		customerTable.setRowSorter(sorter);
		sorter.setRowFilter(RowFilter.regexFilter(search.trim()));
	}
	}

