import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class AraInfoSystem {

	private JFrame frmAraEnrollmentSystem;
	private JTextField tfSchoolId;
	private JTextField tfEmail;
	private JTextField tfSY;
	private JTextField tfAddress;
	private JTextField tfContactNumber;
	private JTextField tfMiddleName;
	private JTextField tfSurname;
	private JLabel lblNewLabel;
	private JLabel lblContactNumber;
	private JLabel lblSchoolId;
	private JLabel lblEmail;
	private JLabel lblFirstName;
	private JLabel lblAddress;
	private JLabel lblSY;
	private JLabel lblSurname;
	private JLabel lblAge;
	private JTextField tfAge;
	private JLabel lblBirthday;
	private JTextField tfBirthday;
	private JTextField tfFirstName;
	private JLabel lblMiddleName;
	private JButton btnFirstPrevious;
	private JButton btnPrevious;
	private JButton btnNext;
	private JButton btnLastNext;
	private JButton btnAdd;
	private JButton btnCancel;
	private JButton btnSave;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnReload;
	private JButton btnViewRec;
	String saveAddEdit = "Save";
	String cancelAddEdit = "Cancel";
	//DATABASE
	String connection = "jdbc:mysql://localhost:3306/aradatabase";
	String username = "root";
	String password = "";

	Connection c;
	PreparedStatement pS;
	ResultSet rs;
	String query;
	private JLabel lblconnection;
	private JTextField tfSearch;
	private JButton btnSearch;
	private JPanel panel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AraInfoSystem window = new AraInfoSystem();
					window.frmAraEnrollmentSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AraInfoSystem() {
		initialize();
		DatabaseConnection();
	}
	private void initialize() {
		frmAraEnrollmentSystem = new JFrame();
		frmAraEnrollmentSystem.getContentPane().setBackground(new Color(255, 215, 0));
		frmAraEnrollmentSystem.setTitle("Ara Enrollment System");
		frmAraEnrollmentSystem.setBounds(100, 100, 799, 542);
		frmAraEnrollmentSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAraEnrollmentSystem.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("ENROLLMENT");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(10, 0, 216, 58);
		frmAraEnrollmentSystem.getContentPane().add(lblNewLabel);
		
		tfFirstName = new JTextField();
		tfFirstName.setEnabled(false);
		tfFirstName.setBounds(121, 95, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfFirstName);
		tfFirstName.setColumns(10);
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFirstName.setBounds(10, 95, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblFirstName);
		
		lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMiddleName.setBounds(10, 133, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblMiddleName);
		
		lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSurname.setBounds(10, 171, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblSurname);
		
		lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAge.setBounds(10, 215, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblAge);
		
		lblBirthday = new JLabel("Birthday");
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBirthday.setBounds(10, 263, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblBirthday);
		
		tfMiddleName = new JTextField();
		tfMiddleName.setEnabled(false);
		tfMiddleName.setColumns(10);
		tfMiddleName.setBounds(121, 133, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfMiddleName);
		
		tfSurname = new JTextField();
		tfSurname.setEnabled(false);
		tfSurname.setColumns(10);
		tfSurname.setBounds(121, 171, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfSurname);
		
		tfAge = new JTextField();
		tfAge.setEnabled(false);
		tfAge.setColumns(10);
		tfAge.setBounds(121, 215, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfAge);
		
		tfBirthday = new JTextField();
		tfBirthday.setEnabled(false);
		tfBirthday.setColumns(10);
		tfBirthday.setBounds(121, 263, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfBirthday);
		
		lblSchoolId = new JLabel("Student No");
		lblSchoolId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSchoolId.setBounds(404, 263, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblSchoolId);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(404, 95, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblEmail);
		
		lblContactNumber = new JLabel("Contact No.");
		lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContactNumber.setBounds(404, 133, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblContactNumber);
		
		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddress.setBounds(404, 171, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblAddress);
		
		lblSY = new JLabel("School Year");
		lblSY.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSY.setBounds(404, 215, 93, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblSY);
		
		tfSchoolId = new JTextField();
		tfSchoolId.setEnabled(false);
		tfSchoolId.setColumns(10);
		tfSchoolId.setBounds(507, 263, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfSchoolId);
		
		tfEmail = new JTextField();
		tfEmail.setEnabled(false);
		tfEmail.setColumns(10);
		tfEmail.setBounds(507, 95, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfEmail);
		
		tfSY = new JTextField();
		tfSY.setEnabled(false);
		tfSY.setColumns(10);
		tfSY.setBounds(507, 215, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfSY);
		
		tfAddress = new JTextField();
		tfAddress.setEnabled(false);
		tfAddress.setColumns(10);
		tfAddress.setBounds(507, 171, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfAddress);
		
		tfContactNumber = new JTextField();
		tfContactNumber.setEnabled(false);
		tfContactNumber.setColumns(10);
		tfContactNumber.setBounds(507, 133, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfContactNumber);
		
		btnFirstPrevious = new JButton("|<");
		btnFirstPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
					rs.first();
					tfFirstName.setText(rs.getString(1));
					tfMiddleName.setText(rs.getString(2));
					tfSurname.setText(rs.getString(3));
					tfAge.setText(rs.getString(4));
					tfBirthday.setText(rs.getString(5));
					tfEmail.setText(rs.getString(6));
					tfContactNumber.setText(rs.getString(7));
					tfAddress.setText(rs.getString(8));
					tfSY.setText(rs.getString(9));
					tfSchoolId.setText(rs.getString(10));
					
					btnFirstPrevious.setEnabled(false);
					btnPrevious.setEnabled(false);
					btnLastNext.setEnabled(true);
					btnNext.setEnabled(true);
					
					tfSearch.setText("");
					if (rs.first()) {
						JOptionPane.showMessageDialog(null, "First Student");
					}

				} catch (Exception g) {
					 
				}
			}
		});
			
	
		btnFirstPrevious.setBounds(67, 332, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnFirstPrevious);
		
		btnPrevious = new JButton("<");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfSearch.setText(null);
				try {
					btnLastNext.setEnabled(false);
					btnNext.setEnabled(false);
					if (rs.previous()) {
						tfFirstName.setText(rs.getString(1));
						tfMiddleName.setText(rs.getString(2));
						tfSurname.setText(rs.getString(3));
						tfAge.setText(rs.getString(4));
						tfBirthday.setText(rs.getString(5));
						tfEmail.setText(rs.getString(6));
						tfContactNumber.setText(rs.getString(7));
						tfAddress.setText(rs.getString(8));
						tfSY.setText(rs.getString(9));
						tfSchoolId.setText(rs.getString(10));
						if (rs.previous() == false) {
							rs.first();
							btnFirstPrevious.setEnabled(false);
							btnPrevious.setEnabled(false);
							JOptionPane.showMessageDialog(null, "First Student!");
						}else {
							rs.next();
						}
					}
				} catch (Exception g) {
				}
			}
		});
		btnPrevious.setBounds(248, 332, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnPrevious);
		
		btnNext = new JButton(">");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfSearch.setText(null);
				try {
					btnFirstPrevious.setEnabled(false);
					btnPrevious.setEnabled(false);
					if (rs.next()) {
						tfFirstName.setText(rs.getString(1));
						tfMiddleName.setText(rs.getString(2));
						tfSurname.setText(rs.getString(3));
						tfAge.setText(rs.getString(4));
						tfBirthday.setText(rs.getString(5));
						tfEmail.setText(rs.getString(6));
						tfContactNumber.setText(rs.getString(7));
						tfAddress.setText(rs.getString(8));
						tfSY.setText(rs.getString(9));
						tfSchoolId.setText(rs.getString(10));
						if (rs.next() == false) {
							rs.last();
							btnFirstPrevious.setEnabled(false);
							btnPrevious.setEnabled(false);
							JOptionPane.showMessageDialog(null, "First Student!");
						}else {
							rs.previous();
						}
					}
				} catch (Exception g) {
				}
			}
		});
		btnNext.setBounds(408, 332, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnNext);
		
		btnLastNext = new JButton(">|");
		btnLastNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
					rs.last();
					tfFirstName.setText(rs.getString(1));
					tfMiddleName.setText(rs.getString(2));
					tfSurname.setText(rs.getString(3));
					tfAge.setText(rs.getString(4));
					tfBirthday.setText(rs.getString(5));
					tfEmail.setText(rs.getString(6));
					tfContactNumber.setText(rs.getString(7));
					tfAddress.setText(rs.getString(8));
					tfSY.setText(rs.getString(9));
					tfSchoolId.setText(rs.getString(10));
					
					btnFirstPrevious.setEnabled(true);
					btnPrevious.setEnabled(true);
					btnLastNext.setEnabled(false);
					btnNext.setEnabled(false);
					
					tfSearch.setText("");
					if (rs.first()) {
						JOptionPane.showMessageDialog(null, "Last Student");
					}

				} catch (Exception g) {
					 
				}
			}
		});
		btnLastNext.setBounds(571, 332, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnLastNext);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//NAVIGATION
				btnFirstPrevious.setEnabled(false);
				btnPrevious.setEnabled(false);
				btnLastNext.setEnabled(false);
				btnNext.setEnabled(false);
				
				//RELOAD VIEW AND CRUD
				btnReload.setEnabled(false);
				btnViewRec.setEnabled(false);
				btnAdd.setEnabled(false);
				btnEdit.setEnabled(false);
				btnDelete.setEnabled(false);
				btnSearch.setEnabled(false);
				btnSave.setEnabled(true);
				btnCancel.setEnabled(true);
				
				//NULL
				tfFirstName.setText("");
				tfMiddleName.setText("");
				tfSurname.setText("");
				tfAge.setText("");
				tfBirthday.setText("");
				tfEmail.setText("");
				tfContactNumber.setText("");
				tfAddress.setText("");
				tfSY.setText("");
				tfSearch.setText("");
				
				//TEXTFIELD ENABLED
				tfFirstName.setEnabled(true);
				tfMiddleName.setEnabled(true);
				tfSurname.setEnabled(true);
				tfAge.setEnabled(true);
				tfBirthday.setEnabled(true);
				tfEmail.setEnabled(true);
				tfContactNumber.setEnabled(true);
				tfAddress.setEnabled(true);
				tfSY.setEnabled(true);
				
				//VARIABLE
				saveAddEdit = "Add";
				cancelAddEdit = "Add";
			}
		});
		btnAdd.setBounds(10, 387, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnAdd);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//NAVIGATION
				btnFirstPrevious.setEnabled(true);
				btnPrevious.setEnabled(true);
				btnLastNext.setEnabled(true);
				btnNext.setEnabled(true);
				
				//SAVE RELOAD CRUD
				btnReload.setEnabled(true);
				btnViewRec.setEnabled(true);
				btnAdd.setEnabled(true);
				btnEdit.setEnabled(true);
				btnDelete.setEnabled(true);
				btnSearch.setEnabled(true);
				btnSave.setEnabled(false);
				btnCancel.setEnabled(false);
				
				//TEXTFIELD DISABLED
				tfFirstName.setEnabled(false);
				tfMiddleName.setEnabled(false);
				tfSurname.setEnabled(false);
				tfAge.setEnabled(false);
				tfBirthday.setEnabled(false);
				tfEmail.setEnabled(false);
				tfContactNumber.setEnabled(false);
				tfAddress.setEnabled(false);
				tfSY.setEnabled(false);
				
				String id = tfSchoolId.getText();
				if(cancelAddEdit.equals("Add")) {
					try {
						rs.first();
						tfFirstName.setText(rs.getString(1));
						tfMiddleName.setText(rs.getString(2));
						tfSurname.setText(rs.getString(3));
						tfAge.setText(rs.getString(4));
						tfBirthday.setText(rs.getString(5));
						tfEmail.setText(rs.getString(6));
						tfContactNumber.setText(rs.getString(7));
						tfAddress.setText(rs.getString(8));
						tfSY.setText(rs.getString(9));
						tfSchoolId.setText(rs.getString(10));
						if (rs.first()) {
							JOptionPane.showMessageDialog(null, "First Student!");
						}
					} catch (Exception g) {
						System.out.println(g.toString());
					}
				}else if(cancelAddEdit.equals("Edit")) {
					try {
						c = DriverManager.getConnection(connection, username, password);
						query = "SELECT * FROM tblschoolsystem";
						pS = c.prepareStatement(query);
						rs = pS.executeQuery();

						while(rs.next()) {
							if(rs.getString(10).equals(id)) {
								tfFirstName.setText(rs.getString(1));
								tfMiddleName.setText(rs.getString(2));
								tfSurname.setText(rs.getString(3));
								tfAge.setText(rs.getString(4));
								tfBirthday.setText(rs.getString(5));
								tfEmail.setText(rs.getString(6));
								tfContactNumber.setText(rs.getString(7));
								tfAddress.setText(rs.getString(8));
								tfSY.setText(rs.getString(9));
								tfSchoolId.setText(rs.getString(10));
								break;
							}
						}
						pS.execute();
						JOptionPane.showMessageDialog(null, "Cancelled!");
					} catch (SQLException a) {
					}
					try {
						rs.next();
					} catch (SQLException b) {
						
					}
				}
			}
		});
		btnCancel.setEnabled(false);
		btnCancel.setBounds(160, 387, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnCancel);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//RELOAD VIEW AND CRUD
				btnReload.setEnabled(false);
				btnViewRec.setEnabled(false);
				btnAdd.setEnabled(false);
				btnEdit.setEnabled(false);
				btnDelete.setEnabled(false);
				btnSearch.setEnabled(false);
				btnSave.setEnabled(true);
				btnCancel.setEnabled(true);
				
				//TEXTFIELD ENABLED
				tfFirstName.setEnabled(true);
				tfMiddleName.setEnabled(true);
				tfSurname.setEnabled(true);
				tfAge.setEnabled(true);
				tfBirthday.setEnabled(true);
				tfEmail.setEnabled(true);
				tfContactNumber.setEnabled(true);
				tfAddress.setEnabled(true);
				tfSY.setEnabled(true);
				
				//VARIABLE
				saveAddEdit = "Edit";
				cancelAddEdit = "Edit";
			}
		});
		btnEdit.setBounds(332, 387, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnEdit);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fName = tfFirstName.getText();
				String mName = tfMiddleName.getText();
				String sName = tfSurname.getText();
				String age = tfAge.getText();
				String bDay = tfBirthday.getText();
				String email = tfEmail.getText();
				String contact = tfContactNumber.getText();
				String address = tfAddress.getText();
				String schoolyear = tfSY.getText();
				String id = tfSchoolId.getText();
				
				if (saveAddEdit.equals("Add")) {
					if (fName.equals("") || mName.equals("") || sName.equals("") || age.equals("") || bDay.equals("") || email.equals("") || contact.equals("") || address.equals("") || schoolyear.equals("")) {
						JOptionPane.showMessageDialog(null, "Please Complete all Fields");
					} else {
						try {
							c = DriverManager.getConnection(connection, username, password);
							query = "INSERT INTO tblschoolsystem(firstname, middlename, surname, age, birthday, email, contact, address, schoolyear) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

							pS = c.prepareStatement(query);

							pS.setString(1, fName);
							pS.setString(2, mName);
							pS.setString(3, sName);
							pS.setString(4, age);
							pS.setString(5, bDay);
							pS.setString(6, email);
							pS.setString(7, contact);
							pS.setString(8, address);
							pS.setString(9, schoolyear);
							

							pS.execute();
							JOptionPane.showMessageDialog(null, "Information Added");

						} catch (Exception x) {
							x.printStackTrace();
						}
					}
			
				}else if(saveAddEdit.equals("Edit")) {
					if (fName.equals("") || mName.equals("") || sName.equals("") || age.equals("") || bDay.equals("") || email.equals("") || contact.equals("") || address.equals("") || schoolyear.equals("")) {
						JOptionPane.showMessageDialog(null, "Please Complete all Fields");
					} else {
						try {
							c = DriverManager.getConnection(connection, username, password);
							query = "UPDATE tblschoolsystem SET firstname = ?, middlename = ?, surname = ?, age = ?, birthday = ?, email = ?, contact = ?, address = ?, schoolyear = ? WHERE id = ?";

							pS = c.prepareStatement(query);

							pS.setString(1, fName);
							pS.setString(2, mName);
							pS.setString(3, sName);
							pS.setString(4, age);
							pS.setString(5, bDay);
							pS.setString(6, email);
							pS.setString(7, contact);
							pS.setString(8, address);
							pS.setString(9, schoolyear);
							pS.setString(10, id);

							pS.execute();
							JOptionPane.showMessageDialog(null, "Information Edited");

						} catch (Exception x) {
							x.printStackTrace();
						}
				}
				}
				
			}
		});
		btnSave.setEnabled(false);
		btnSave.setBounds(495, 387, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnSave);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfSchoolId.getText();

				try {
					c = DriverManager.getConnection(connection, username, password);
					query = "DELETE FROM tblschoolsystem WHERE id = ?";
					pS = c.prepareStatement(query);
					pS.setString(1, id);
					pS.execute();
					JOptionPane.showMessageDialog(null, "The information is deleted succesfully");
					tfFirstName.setText("");
					tfMiddleName.setText("");
					tfSurname.setText("");
					tfAge.setText("");
					tfBirthday.setText("");
					tfEmail.setText("");
					tfContactNumber.setText("");
					tfAddress.setText("");
					tfSY.setText("");
					tfSearch.setText("");

				} catch (SQLException d) {
	
				}
			}
		});
		btnDelete.setBounds(663, 387, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnDelete);
		
		btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseConnection();
			}
		});
		btnReload.setBounds(121, 448, 216, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnReload);
		
		btnViewRec = new JButton("View Records");
		btnViewRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnViewRec) {
					try {
						Thread thread = new Thread() {
							public void run() {
								AraViewRecords.main(new String[] {});
							}
						};
						thread.start();
						thread.join();
					}catch (Exception error) {
						error.printStackTrace();
					}
			}
		
			}
		});
		btnViewRec.setBounds(408, 448, 216, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnViewRec);
		
		lblconnection = new JLabel("Connection");
		lblconnection.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblconnection.setBounds(475, 33, 248, 17);
		frmAraEnrollmentSystem.getContentPane().add(lblconnection);
		
		tfSearch = new JTextField();
		tfSearch.setColumns(10);
		tfSearch.setBounds(121, 64, 216, 20);
		frmAraEnrollmentSystem.getContentPane().add(tfSearch);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentSearch = tfSearch.getText();
				try {
					c = DriverManager.getConnection(connection, username, password);
					query ="SELECT * FROM tblschoolsystem WHERE id LIKE '%" + studentSearch + "%'" + " OR firstname LIKE '%" + studentSearch + "%'" +" OR middlename LIKE '%" + studentSearch +
							 "%'" + " OR surname LIKE '%" + studentSearch +  "%'" + " OR age LIKE '%" + studentSearch + "%'" + " OR address LIKE '%" + studentSearch + 
							 "%'" + " OR birthday LIKE '%" + studentSearch + "%'" + " OR email LIKE '%" + studentSearch + "%'" + " OR contact LIKE '%" + studentSearch +
							 "%'" + " OR schoolyear LIKE '%" + studentSearch +  "%'";
					pS = c.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
					rs = pS.executeQuery();
					if (rs.next()) {
						tfFirstName.setText(rs.getString(1));
						tfMiddleName.setText(rs.getString(2));
						tfSurname.setText(rs.getString(3));
						tfAge.setText(rs.getString(4));
						tfBirthday.setText(rs.getString(5));
						tfEmail.setText(rs.getString(6));
						tfContactNumber.setText(rs.getString(7));
						tfAddress.setText(rs.getString(8));
						tfSY.setText(rs.getString(9));
						tfSchoolId.setText(rs.getString(10));
						if (rs.next() == false) {
							btnFirstPrevious.setEnabled(false);
						}
						rs.previous();
					}else {
						JOptionPane.showMessageDialog(null, "Customer not Found");
						tfFirstName.setText("");
						tfMiddleName.setText("");
						tfSurname.setText("");
						tfAge.setText("");
						tfBirthday.setText("");
						tfEmail.setText("");
						tfContactNumber.setText("");
						tfAddress.setText("");
						tfSY.setText("");
						tfSearch.setText("");
						btnFirstPrevious.setEnabled(true);
						btnPrevious.setEnabled(true);
						btnLastNext.setEnabled(true);
						btnNext.setEnabled(true);
						
					}

				} catch (SQLException f) {
					// e.printStackTrace();
				// System.out.println(e.toString());
				}
			}
		});
		btnSearch.setBounds(10, 61, 89, 23);
		frmAraEnrollmentSystem.getContentPane().add(btnSearch);
		
		panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 0, 783, 58);
		frmAraEnrollmentSystem.getContentPane().add(panel);
	}
	public void DatabaseConnection() {
		try {
			c = DriverManager.getConnection(connection, username, password);
			query = "SELECT * FROM tblschoolsystem";
			pS = c.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = pS.executeQuery();
			if (rs.next()) {
				tfFirstName.setText(rs.getString(1));
				tfMiddleName.setText(rs.getString(2));
				tfSurname.setText(rs.getString(3));
				tfAge.setText(rs.getString(4));
				tfBirthday.setText(rs.getString(5));
				tfEmail.setText(rs.getString(6));
				tfContactNumber.setText(rs.getString(7));
				tfAddress.setText(rs.getString(8));
				tfSY.setText(rs.getString(9));
				tfSchoolId.setText(rs.getString(10));
			}
			lblconnection.setText("Enrollment System Connected");
			lblconnection.setForeground(Color.GREEN);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			lblconnection.setText("Enrollment System is not Connected");
			lblconnection.setForeground(Color.red);
			System.out.println(e.toString());
		}
	}
	
}
