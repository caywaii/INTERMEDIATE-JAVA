import java.awt.Color;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JPanel;

public class CustomerInformationSystem {
	
	//Class
	RefactorCodes other = new RefactorCodes();
	// Frame
	private JFrame frmCustomerInformationSystem;

	// JTextField
	JTextField tfDateofLive;
	JTextField tfFullName;
	JTextField tfCustomerCode;
	JTextField tfContactNumber;
	JTextField tfCountry;
	JTextField tfStreet;
	JTextField tfTown;
	JTextField tfCity;
	JTextField tfProvince;
	JTextField tfPriceofMined;
	JTextField tfSearch;
	
	// JLabel
	JLabel lblMineDitse;
	JLabel lblCustomerInformation;
	JLabel lblCheckConnection;
	JLabel lblDateofLive;
	JLabel lblFullName;
	JLabel lblContactNumber;
	JLabel lblStreetNo;
	JLabel lblTown;
	JLabel lblCity;
	JLabel lblProvince;
	JLabel lblCountry;
	JLabel lblDateOfLive;
	JLabel lblCustomerCode;
	JLabel lblPriceOfMined;

	// JButton
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

	// Integer
	int addEdit = 0;
	int cancelAddEdit = 0;

	// String
	String x = String.valueOf(addEdit);
	String y = String.valueOf(cancelAddEdit);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInformationSystem window = new CustomerInformationSystem();
					window.frmCustomerInformationSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Database
	String connection = "jdbc:mysql://localhost:3306/mineditse";
	String username = "root";
	String password = "";

	Connection conn;
	PreparedStatement preparedS;
	ResultSet resultSet;
	String query;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;

	public void DataImport() {
		try {
			conn = DriverManager.getConnection(connection, username, password);
			query = "SELECT * FROM tblmineditse";

			preparedS = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			resultSet = preparedS.executeQuery();
			if (resultSet.next()) {
				btnDataFunction();
			}

			lblCheckConnection.setText("Set Off! Connected");
			lblCheckConnection.setForeground(Color.YELLOW);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			lblCheckConnection.setText("Down! Failed");
			lblCheckConnection.setForeground(Color.red);
			System.out.println(e.toString());
		}
	}

	public void btnDataFunction() {
		try {
			tfDateofLive.setText(resultSet.getString(1));
			tfFullName.setText(resultSet.getString(2));
			tfCustomerCode.setText(resultSet.getString(3));
			tfContactNumber.setText(resultSet.getString(4));
			tfCountry.setText(resultSet.getString(5));
			tfStreet.setText(resultSet.getString(6));
			tfTown.setText(resultSet.getString(7));
			tfCity.setText(resultSet.getString(8));
			tfProvince.setText(resultSet.getString(9));
			tfPriceofMined.setText(resultSet.getString(10));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	
	public CustomerInformationSystem() {
		initialize();
		DataImport();

	}

	public void initialize() {

		// BOUNDS
		frmCustomerInformationSystem = new JFrame();
		frmCustomerInformationSystem.setTitle("Customer Information System");
		frmCustomerInformationSystem.getContentPane().setBackground(new Color(211, 211, 211));
		frmCustomerInformationSystem.setBackground(new Color(0, 0, 0));
		frmCustomerInformationSystem.setBounds(100, 100, 1147, 547);
		frmCustomerInformationSystem.setLocationRelativeTo(null);
		frmCustomerInformationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomerInformationSystem.getContentPane().setLayout(null);
		frmCustomerInformationSystem.setVisible(true);

		lblCustomerInformation = new JLabel("Customer Information");
		lblCustomerInformation.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblCustomerInformation.setBounds(538, 14, 250, 46);
		frmCustomerInformationSystem.getContentPane().add(lblCustomerInformation);

		lblMineDitse = new JLabel("Mine Ditse");
		lblMineDitse.setFont(new Font("Sitka Small", Font.BOLD, 30));
		lblMineDitse.setBounds(350, 11, 198, 51);
		frmCustomerInformationSystem.getContentPane().add(lblMineDitse);

		lblFullName = new JLabel("Full Name:");
		lblFullName.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblFullName.setBounds(20, 106, 114, 46);
		frmCustomerInformationSystem.getContentPane().add(lblFullName);

		lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblContactNumber.setBounds(20, 145, 150, 46);
		frmCustomerInformationSystem.getContentPane().add(lblContactNumber);

		lblStreetNo = new JLabel("Street:");
		lblStreetNo.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblStreetNo.setBounds(20, 233, 150, 46);
		frmCustomerInformationSystem.getContentPane().add(lblStreetNo);

		lblTown = new JLabel("Barangay:");
		lblTown.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblTown.setBounds(20, 280, 150, 46);
		frmCustomerInformationSystem.getContentPane().add(lblTown);

		lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblCity.setBounds(20, 324, 150, 46);
		frmCustomerInformationSystem.getContentPane().add(lblCity);

		lblProvince = new JLabel("Province:");
		lblProvince.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblProvince.setBounds(20, 370, 150, 46);
		frmCustomerInformationSystem.getContentPane().add(lblProvince);

		lblCountry = new JLabel("Country:");
		lblCountry.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblCountry.setBounds(20, 189, 150, 46);
		frmCustomerInformationSystem.getContentPane().add(lblCountry);

		lblDateOfLive = new JLabel("Date of Live Selling:");
		lblDateOfLive.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblDateOfLive.setBounds(20, 61, 198, 46);
		frmCustomerInformationSystem.getContentPane().add(lblDateOfLive);

		lblCustomerCode = new JLabel("Customer Code:");
		lblCustomerCode.setFont(new Font("Sitka Small", Font.BOLD, 25));
		lblCustomerCode.setBounds(587, 61, 245, 46);
		frmCustomerInformationSystem.getContentPane().add(lblCustomerCode);

		lblPriceOfMined = new JLabel("Price of Mined Clothes:");
		lblPriceOfMined.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblPriceOfMined.setBounds(20, 418, 198, 46);
		frmCustomerInformationSystem.getContentPane().add(lblPriceOfMined);

		tfDateofLive = new JTextField();
		tfDateofLive.setBackground(new Color(255, 240, 245));
		tfDateofLive.setEnabled(false);
		tfDateofLive.setBounds(228, 72, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfDateofLive);
		tfDateofLive.setColumns(10);

		tfFullName = new JTextField();
		tfFullName.setBackground(new Color(255, 240, 245));
		tfFullName.setEnabled(false);
		tfFullName.setColumns(10);
		tfFullName.setBounds(228, 117, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfFullName);

		tfCustomerCode = new JTextField();
		tfCustomerCode.setBackground(new Color(255, 240, 245));
		tfCustomerCode.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		tfCustomerCode.setEnabled(false);
		tfCustomerCode.setColumns(10);
		tfCustomerCode.setBounds(743, 106, 318, 31);
		frmCustomerInformationSystem.getContentPane().add(tfCustomerCode);

		tfContactNumber = new JTextField();
		tfContactNumber.setBackground(new Color(255, 240, 245));
		tfContactNumber.setEnabled(false);
		tfContactNumber.setColumns(10);
		tfContactNumber.setBounds(228, 156, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfContactNumber);

		tfCountry = new JTextField();
		tfCountry.setBackground(new Color(255, 240, 245));
		tfCountry.setEnabled(false);
		tfCountry.setColumns(10);
		tfCountry.setBounds(228, 200, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfCountry);

		tfStreet = new JTextField();
		tfStreet.setBackground(new Color(255, 240, 245));
		tfStreet.setEnabled(false);
		tfStreet.setColumns(10);
		tfStreet.setBounds(228, 244, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfStreet);

		tfTown = new JTextField();
		tfTown.setBackground(new Color(255, 240, 245));
		tfTown.setEnabled(false);
		tfTown.setColumns(10);
		tfTown.setBounds(228, 291, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfTown);

		tfCity = new JTextField();
		tfCity.setBackground(new Color(255, 240, 245));
		tfCity.setEnabled(false);
		tfCity.setColumns(10);
		tfCity.setBounds(228, 335, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfCity);

		tfProvince = new JTextField();
		tfProvince.setBackground(new Color(255, 240, 245));
		tfProvince.setEnabled(false);
		tfProvince.setColumns(10);
		tfProvince.setBounds(228, 381, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfProvince);

		tfPriceofMined = new JTextField();
		tfPriceofMined.setBackground(new Color(255, 240, 245));
		tfPriceofMined.setEnabled(false);
		tfPriceofMined.setColumns(10);
		tfPriceofMined.setBounds(228, 429, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfPriceofMined);

		tfSearch = new JTextField();
		tfSearch.setForeground(new Color(0, 0, 0));
		tfSearch.setBackground(new Color(255, 240, 245));
		tfSearch.setColumns(10);
		tfSearch.setBounds(639, 189, 305, 20);
		frmCustomerInformationSystem.getContentPane().add(tfSearch);

		// START ACTION PERFORMED
		btnSearch = new JButton("Search");
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setBackground(new Color(165, 42, 42));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnSearch();
				btnBothRightEnabled();
				btnBothLeftDisabled();
				
				tfSearch.setText("");
			
				
				
			}
		});
		btnSearch.setBounds(972, 189, 89, 22);
		frmCustomerInformationSystem.getContentPane().add(btnSearch);

		btnHardLeft = new JButton("|<");
		btnHardLeft.setForeground(new Color(0, 0, 0));
		btnHardLeft.setBackground(new Color(255, 250, 240));
		btnHardLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
					resultSet.first();
					btnDataFunction();
					
					btnBothLeftDisabled();
					btnBothRightEnabled();
					
					tfSearch.setText("");
					if (resultSet.first()) {
						JOptionPane.showMessageDialog(null, "This is the First Customer!");
					}

				} catch (Exception g) {
					// System.out.println(g.toString());
				}
			}
		});
		btnHardLeft.setBounds(604, 243, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnHardLeft);
		
		btnLeft = new JButton("<");
		btnLeft.setForeground(new Color(0, 0, 0));
		btnLeft.setBackground(new Color(255, 250, 240));
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					tfSearch.setText("");
					btnBothRightEnabled();

					if (resultSet.previous()) {
						btnDataFunction();
						if (resultSet.previous() == false) {
							// PREVIOUS TO FIRST THEN DISABLED
							resultSet.first();
							btnBothLeftDisabled();
							JOptionPane.showMessageDialog(null, "This is the First Customer!");

						}else {
							resultSet.next();
						}

					}

				} catch (Exception g) {
					// System.out.println(g.toString());
				}
			}
		});
		btnLeft.setBounds(743, 243, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnLeft);
		
		btnRight = new JButton(">");
		btnRight.setForeground(new Color(0, 0, 0));
		btnRight.setBackground(new Color(255, 250, 240));
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					
					tfSearch.setText("");
					btnBothLeftEnabled();
					
					if (resultSet.next()) {
						btnDataFunction();
						if (resultSet.next() == false) {
							// NEXT TO LAST THEN DISABLED
							resultSet.last();
							btnBothRightDisabled();
							JOptionPane.showMessageDialog(null, "This is the Last Customer!");
						}else {
							resultSet.previous();
						}
					}
				} catch (Exception g) {
					// System.out.println(g.toString());
				}
			}
		});
		btnRight.setBounds(890, 243, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnRight);
		
		btnHardRight = new JButton(">|");
		btnHardRight.setForeground(new Color(0, 0, 0));
		btnHardRight.setBackground(new Color(255, 250, 240));
		btnHardRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			
					resultSet.last();
					btnDataFunction();	
					
					btnBothRightDisabled();
					btnBothLeftEnabled();
				
					tfSearch.setText("");
					if (resultSet.last()) {
						JOptionPane.showMessageDialog(null, "This is the Last Customer!");
					}

				} catch (Exception g) {
					// System.out.println(g.toString());
				}
			}
		});
		btnHardRight.setBounds(1017, 243, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnHardRight);

	
		btnAdd = new JButton("Add");
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setBackground(new Color(255, 250, 240));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//DISABLED
				btnNavigationDisabled();
				btnViewReloadDisabled();
				btnAddEditDeleteSearchDisabled();
				
				//ENABLED
				btnSaveCancelEnabled();
				textFieldEnabled();
				textFieldNull();
				
				showIncrementID();
				
				//INITIALIZED
				x = "Add";
				y = "Add";

			}
		});
		btnAdd.setBounds(677, 303, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnAdd);
	
		btnEdit = new JButton("Edit");
		btnEdit.setForeground(new Color(0, 0, 0));
		btnEdit.setBackground(new Color(255, 250, 240));
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//DISABLED
				btnNavigationDisabled();
				btnViewReloadDisabled();
				btnAddEditDeleteSearchDisabled();				
				
				//ENABLED
				btnSaveCancelEnabled();
				textFieldEnabled();
				
				// INITIALIZED
				x = "Edit";
				y = "Edit";
			}
		});
		btnEdit.setBounds(826, 303, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnEdit);

		btnSave = new JButton("Save");
		btnSave.setForeground(new Color(0, 0, 0));
		btnSave.setBackground(new Color(255, 250, 240));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (x == "Add") {
					SaveInformation();
					textFieldDisabled();
				} else if (x == "Edit") {
					EditInformation();
				}

			}
		});
		btnSave.setEnabled(false);
		btnSave.setBounds(959, 303, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnSave);

		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.setBackground(new Color(255, 250, 240));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//ENABLED
				btnNavigationEnabled();
				btnAddEditDeleteReloadSearchRecordsEnabled(); 
				
				//DISABLED
				btnSaveCancelDisabled();
				textFieldDisabled();

				btnDataFunction();
				if (y == "Add") {
					AddCancel();
				} else if (y == "Edit") {
					EditCancel();
					try {
						resultSet.next();
					} catch (SQLException e1) {
						//e1.printStackTrace();
					}
				}



			}
		});
		btnCancel.setEnabled(false);
		btnCancel.setBounds(743, 358, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnCancel);

		btnDelete = new JButton("Delete");
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.setBackground(new Color(255, 250, 240));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int confirmation = JOptionPane.showConfirmDialog(null, "Do you really want to Delete?", "Delete", JOptionPane.YES_NO_OPTION);
				
				if(confirmation == 0) {
					DeleteInformation();
					textFieldEnabled();
				}else {
					textFieldDisabled();
				}
				

			}
		});
		btnDelete.setBounds(890, 358, 89, 23);
		frmCustomerInformationSystem.getContentPane().add(btnDelete);

		btnReload = new JButton("Reload");
		btnReload.setForeground(new Color(0, 0, 0));
		btnReload.setBackground(new Color(255, 250, 240));
		btnReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataImport();
			}
		});
		btnReload.setBounds(620, 418, 212, 23);
		frmCustomerInformationSystem.getContentPane().add(btnReload);

		btnViewRecords = new JButton("View Records");
		btnViewRecords.setForeground(new Color(0, 0, 0));
		btnViewRecords.setBackground(new Color(255, 250, 240));
		btnViewRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnViewRecords) {
					CustomerRecords records = new CustomerRecords();
				}
			}
		});
		btnViewRecords.setBounds(890, 418, 216, 23);
		frmCustomerInformationSystem.getContentPane().add(btnViewRecords);

		lblCheckConnection = new JLabel("Check Connection");
		lblCheckConnection.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblCheckConnection.setBounds(505, 462, 171, 46);
		frmCustomerInformationSystem.getContentPane().add(lblCheckConnection);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(211, 211, 211));
		separator.setBackground(new Color(211, 211, 211));
		separator.setBounds(0, 48, 1131, 2);
		frmCustomerInformationSystem.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(211, 211, 211));
		separator_1.setForeground(new Color(211, 211, 211));
		separator_1.setBounds(0, 460, 1131, 5);
		frmCustomerInformationSystem.getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(0, 0, 1131, 50);
		frmCustomerInformationSystem.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(216, 191, 216));
		panel_1.setBounds(0, 459, 1131, 51);
		frmCustomerInformationSystem.getContentPane().add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 182, 193));
		panel_2.setBounds(0, 55, 579, 409);
		frmCustomerInformationSystem.getContentPane().add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 182, 193));
		panel_3.setBounds(577, 55, 554, 97);
		frmCustomerInformationSystem.getContentPane().add(panel_3);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 182, 193));
		panel_4.setBounds(577, 150, 554, 311);
		frmCustomerInformationSystem.getContentPane().add(panel_4);
	}

	public void SaveInformation() {
		String dateOfLive = tfDateofLive.getText();
		String fullName = tfFullName.getText();
		String Code = tfCustomerCode.getText();
		String contact = tfContactNumber.getText();
		String street = tfStreet.getText();
		String town = tfTown.getText();
		String city = tfCity.getText();
		String province = tfProvince.getText();
		String country = tfCountry.getText();
		String price = tfPriceofMined.getText();

		if (dateOfLive.equals("") || fullName.equals("") || contact.equals("") || country.equals("")
				|| street.equals("") || town.equals("") || city.equals("") || province.equals("") || price.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Complete all Fields");
		} else {
			try {
				conn = DriverManager.getConnection(connection, username, password);
				query = "INSERT INTO tblmineditse(dateLive, customerName, customerContact, customerCountry, customerStreet, customerTown, customerCity, customerProvince, customerPriceofMined) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

				preparedS = conn.prepareStatement(query);

				preparedS.setString(1, dateOfLive);
				preparedS.setString(2, fullName);
				preparedS.setString(3, contact);
				preparedS.setString(4, country);
				preparedS.setString(5, street);
				preparedS.setString(6, town);
				preparedS.setString(7, city);
				preparedS.setString(8, province);
				preparedS.setString(9, price);

				preparedS.execute();
				JOptionPane.showMessageDialog(null, "The information is saved succesfully");

			} catch (Exception j) {
				// System.out.println(j.toString());
			}
		}

	}

	public void AddCancel() {

		try {
			resultSet.first();
			btnDataFunction();

			if (resultSet.first()) {
				JOptionPane.showMessageDialog(null, "This is the First Customer!");
			}

		} catch (Exception g) {
			System.out.println(g.toString());
		}

	}

	public void EditCancel() {
		btnDataFunction();
		String dateOfLive = tfDateofLive.getText();
		String fullName = tfFullName.getText();
		String Code = tfCustomerCode.getText();
		String contact = tfContactNumber.getText();
		String street = tfStreet.getText();
		String town = tfTown.getText();
		String city = tfCity.getText();
		String province = tfProvince.getText();
		String country = tfCountry.getText();
		String price = tfPriceofMined.getText();

		try {
			conn = DriverManager.getConnection(connection, username, password);
			query = "SELECT * FROM tblmineditse";

			preparedS = conn.prepareStatement(query);
			preparedS.setString(1, Code);
			resultSet = preparedS.executeQuery();

			while(resultSet.next()) {
				if(resultSet.getString(3).equals(Code)) {
					btnDataFunction();
					break;
				}
			}

			preparedS.execute();

			JOptionPane.showMessageDialog(null, "Cancelled!");

		} catch (SQLException e) {
			// e.printStackTrace();
			// System.out.println(e.toString());
		}

	}

	public void DeleteInformation() {

		String Code = tfCustomerCode.getText();

		try {
			conn = DriverManager.getConnection(connection, username, password);
			query = "DELETE FROM tblmineditse WHERE customerCode = ?";

			preparedS = conn.prepareStatement(query);

			preparedS.setString(1, Code);

			preparedS.execute();

			JOptionPane.showMessageDialog(null, "The information is deleted succesfully");
			textFieldNull();

		} catch (SQLException e) {
			// e.printStackTrace();
			// System.out.println(e.toString());
		}
	}

	public void EditInformation() {
		String dateOfLive = tfDateofLive.getText();
		String fullName = tfFullName.getText();
		String Code = tfCustomerCode.getText();
		String contact = tfContactNumber.getText();
		String street = tfStreet.getText();
		String town = tfTown.getText();
		String city = tfCity.getText();
		String province = tfProvince.getText();
		String country = tfCountry.getText();
		String price = tfPriceofMined.getText();

		if (dateOfLive.equals("") || fullName.equals("") || contact.equals("") || country.equals("")
				|| street.equals("") || town.equals("") || city.equals("") || province.equals("") || price.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Complete all Fields");
		} else {
			try {
				conn = DriverManager.getConnection(connection, username, password);
				query = "UPDATE tblmineditse SET dateLive = ?, customerName = ?, customerContact = ?, customerCountry = ?, customerStreet = ?, customerTown = ?, customerCity = ?, customerProvince = ?, customerPriceofMined = ? WHERE customerCode = ?";

				preparedS = conn.prepareStatement(query);

				preparedS.setString(1, dateOfLive);
				preparedS.setString(2, fullName);
				preparedS.setString(3, contact);
				preparedS.setString(4, country);
				preparedS.setString(5, street);
				preparedS.setString(6, town);
				preparedS.setString(7, city);
				preparedS.setString(8, province);
				preparedS.setString(9, price);
				preparedS.setString(10, Code);

				preparedS.execute();
				JOptionPane.showMessageDialog(null, "The information is updated succesfully");

			} catch (SQLException e) {
				// e.printStackTrace();
				// System.out.println(e.toString());
			}
		}

	}

	public void showIncrementID() {

		try {

			conn = DriverManager.getConnection(connection, username, password);
			String query = "SELECT * FROM tblmineditse";

			preparedS = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			resultSet = preparedS.executeQuery();

			resultSet.last();
			tfCustomerCode.setText(String.valueOf((Integer.parseInt(resultSet.getString(3)) + 1)));
			
		

		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

	public void btnSearch() {

		String searchBar = tfSearch.getText();

		try {
			conn = DriverManager.getConnection(connection, username, password);
			query ="SELECT * FROM tblmineditse WHERE customerCode LIKE '%" + searchBar + "%'" + " OR customerName LIKE '%" + searchBar + "%'" +" OR dateLive LIKE '%" + searchBar +
					 "%'" + " OR customerContact LIKE '%" + searchBar +  "%'" + " OR customerCountry LIKE '%" + searchBar + "%'" + " OR customerStreet LIKE '%" + searchBar + 
					 "%'" + " OR customerTown LIKE '%" + searchBar + "%'" + " OR customerCity LIKE '%" + searchBar + "%'" + " OR customerProvince LIKE '%" + searchBar +
					 "%'" + " OR customerPriceofMined LIKE '%" + searchBar +  "%'";

			preparedS = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			resultSet = preparedS.executeQuery();
			
			if (resultSet.next()) {
				btnDataFunction();
				if (resultSet.next() == false) {
					btnHardLeft.setEnabled(false);

				}
				resultSet.previous();
			}else {
				JOptionPane.showMessageDialog(null, "Customer not Found");
				textFieldNull();
				btnNavigationEnabled();
				
			}

		} catch (SQLException e) {
			// e.printStackTrace();
		// System.out.println(e.toString());
		}
	}
	
	public void textFieldEnabled() {
		tfDateofLive.setEnabled(true);
		tfFullName.setEnabled(true);
		tfContactNumber.setEnabled(true);
		tfCountry.setEnabled(true);
		tfStreet.setEnabled(true);
		tfTown.setEnabled(true);
		tfCity.setEnabled(true);
		tfProvince.setEnabled(true);
		tfPriceofMined.setEnabled(true);
	}

	public void textFieldDisabled() {
		tfDateofLive.setEnabled(false);
		tfFullName.setEnabled(false);
		tfContactNumber.setEnabled(false);
		tfCountry.setEnabled(false);
		tfStreet.setEnabled(false);
		tfTown.setEnabled(false);
		tfCity.setEnabled(false);
		tfProvince.setEnabled(false);
		tfPriceofMined.setEnabled(false);
	}

	public void textFieldNull() {
		tfDateofLive.setText("");
		tfFullName.setText("");
		tfContactNumber.setText("");
		tfCustomerCode.setText("");
		tfCountry.setText("");
		tfStreet.setText("");
		tfTown.setText("");
		tfCity.setText("");
		tfProvince.setText("");
		tfPriceofMined.setText("");
		tfSearch.setText("");
	}

	public void btnNavigationDisabled() {
		btnHardLeft.setEnabled(false);
		btnLeft.setEnabled(false);
		btnHardRight.setEnabled(false);
		btnRight.setEnabled(false);
	}

	public void btnNavigationEnabled() {
		btnHardLeft.setEnabled(true);
		btnLeft.setEnabled(true);
		btnHardRight.setEnabled(true);
		btnRight.setEnabled(true);
	}
	
	public void btnBothRightEnabled() {
		btnRight.setEnabled(true);
		btnHardRight.setEnabled(true);
	}
	
	public void btnBothLeftEnabled() {
		btnLeft.setEnabled(true);
		btnHardLeft.setEnabled(true);
	}
	
	public void btnBothRightDisabled() {
		btnRight.setEnabled(false);
		btnHardRight.setEnabled(false);
	}
	
	public void btnBothLeftDisabled() {
		btnLeft.setEnabled(false);
		btnHardLeft.setEnabled(false);
	}
	public void btnViewReloadDisabled() {
		btnViewRecords.setEnabled(false);
		btnReload.setEnabled(false);
	}
	
	public void btnAddEditDeleteReloadSearchRecordsEnabled() {
		btnAdd.setEnabled(true);
		btnEdit.setEnabled(true);
		btnDelete.setEnabled(true);
		btnReload.setEnabled(true);
		btnSearch.setEnabled(true);
		btnViewRecords.setEnabled(true);
	}

	public void btnSaveCancelDisabled() {
		btnSave.setEnabled(false);
		btnCancel.setEnabled(false);
	}
	
	public void btnSaveCancelEnabled() {
		btnSave.setEnabled(true);
		btnCancel.setEnabled(true);
	}
	
	public void btnAddEditDeleteSearchDisabled() {
		btnAdd.setEnabled(false);
		btnEdit.setEnabled(false);
		btnDelete.setEnabled(false);
		btnSearch.setEnabled(false);
	}
}
