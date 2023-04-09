package MachineProb5;

import javax.swing.*;

import java.awt.ItemSelectable;
import java.awt.event.*;
public class InfoPerson {
	//JFrame
	JFrame mainFrame;

	//JLabel 
	JLabel personalInfo, firstName, lastName, midInitial, age, address, town, status, hobbies, gender;
	JLabel login, username, password, emailAddress;
	JLabel others, colleges, campus;
	
	//JTextField 
	JTextField firstNameText, lastNameText, midInitialText, ageText;
	JTextField usernameText, emailAddressText;
	
	//JRadioButton
	JRadioButton male, female;
	JRadioButton single, married;
	
	//JTextArea
	JTextArea addressText;
	
	//JComboBox
	JComboBox townCombo;
	
	//JCheckBox
	JCheckBox singing, dancing, cycling, swimming;
	
	//JPasswordField
	JPasswordField passwordField;
	
	//JList
	
	
	//JButton
	JButton clickFinal;
	
	//Button Group
	ButtonGroup genderGroup, statusGroup;
	
	//Array
	String city[] = {"Baliuag", "Pulilan", "Plaridel", "Bustos", "San Rafael"};
	
	
	
	InfoPerson(){
		mainFrame = new JFrame();
		
		//Personal Information
		personalInfo = new JLabel("Personal Information");
		personalInfo.setBounds(130, 50, 150, 20);
		
		//First Name
		firstName = new JLabel("First Name");
		firstName.setBounds(20, 80, 150, 20);
		
		firstNameText = new JTextField();
		firstNameText.setBounds(150, 80, 150, 20);
		
		//Last Name
		lastName = new JLabel("Last Name");
		lastName.setBounds(20, 110, 150, 20);
		
		lastNameText = new JTextField();
		lastNameText.setBounds(150, 110, 150, 20);
		
		//Middle Initial
		midInitial = new JLabel("Middle Initial");
		midInitial.setBounds(20, 140, 150, 20);
		
		midInitialText = new JTextField();
		midInitialText.setBounds(150, 140, 150, 20);
		
		//Age
		age = new JLabel("Age");
		age.setBounds(20, 170, 150, 20);
		
		ageText = new JTextField();
		ageText.setBounds(150, 170, 150, 20);
		
		//Gender
		gender = new JLabel("Gender");
		gender.setBounds(20, 200, 150, 20);
		
		male = new JRadioButton("Male");
		male.setBounds(150, 200, 100, 30);
		female = new JRadioButton("Female");
		female.setBounds(250, 200, 500, 30);
		
		genderGroup = new ButtonGroup();
		
		
		//Address
		address = new JLabel("Adress");
		address.setBounds(20, 230, 150, 20);
		
		addressText = new JTextArea(10, 10);
		addressText.setLineWrap(true);
		addressText.setBounds(150, 230, 150, 60);
		
		//Town
		town = new JLabel("Town");
		town.setBounds(20, 300, 150, 20);
		
		
		townCombo = new JComboBox(city);
		townCombo.setBounds(150, 300, 150, 20);
		
		//Status
		status = new JLabel("Status");
		status.setBounds(20, 330, 150, 20);
		
		single = new JRadioButton("Single");
		single.setBounds(150, 330, 100, 30);
		
		married = new JRadioButton("Married");
		married.setBounds(250, 330, 500, 30);
		
		statusGroup = new ButtonGroup();
		
		//Hobbies
		
		hobbies = new JLabel("Hobbies");
		hobbies.setBounds(20, 360, 150, 30);
		
		singing = new JCheckBox("Singing");
		singing.setBounds(150, 360, 100, 30);
		
		dancing = new JCheckBox("Dancing");
		dancing.setBounds(250, 360, 150, 30);
		
		cycling = new JCheckBox("Cycling");
		cycling.setBounds(150, 390, 100, 30);
		
		swimming = new JCheckBox("Swimming");
		swimming.setBounds(250, 390, 150, 30);
		
		//LogIn Information
		login = new JLabel("LogIn Information");
		login.setBounds(130, 450, 150, 20);
		
		//UserName
		username = new JLabel("Username");
		username.setBounds(20, 480, 150, 20);
		
		usernameText = new JTextField();
		usernameText.setBounds(150, 480, 150, 20);
		
		//Password
		password = new JLabel("Password");
		password.setBounds(20, 510, 150, 20);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150, 510, 150, 20);
		
		//Email Address
		emailAddress = new JLabel("Email Address");
		emailAddress.setBounds(20, 540, 150, 20);
		
		emailAddressText = new JTextField();
		emailAddressText.setBounds(150, 540, 150, 20);
		
		//Others
		
		others = new JLabel("Other Information");
		others.setBounds(130, 590, 150, 20);
		
		//Colleges
		colleges = new JLabel("Colleges");
		colleges.setBounds(20, 660, 150, 20);
		DefaultListModel<String> collegesList = new DefaultListModel<>();
		collegesList.addElement("CCIT");
		collegesList.addElement("CET");
		collegesList.addElement("CAB");
		collegesList.addElement("CAS");
		collegesList.addElement("SHS");
		
		JList<String> finalList = new JList<>(collegesList);
		finalList.setBounds(150, 620, 150, 90);
		
		//Campus
		campus = new JLabel("Campus");
		campus.setBounds(20, 785, 150, 20);
		
		DefaultListModel<String> campusList = new DefaultListModel<>();
		campusList.addElement("NUB");
		campusList.addElement("NUL");
		campusList.addElement("NU Manila");
		campusList.addElement("NUD");
		campusList.addElement("NUF");
		
		JList<String> finalListCampus = new JList<>(campusList);
		finalListCampus.setBounds(150, 750, 150, 90);
		
		//Button
		clickFinal = new JButton("Show");
		clickFinal.setBounds(130, 900, 150, 50);
	
		
		//Add
		mainFrame.add(personalInfo); 
		mainFrame.add(firstName); mainFrame.add(firstNameText);
		mainFrame.add(lastName); mainFrame.add(lastNameText);
		mainFrame.add(midInitial); mainFrame.add(midInitialText);
		mainFrame.add(age); mainFrame.add(ageText);
		mainFrame.add(gender); mainFrame.add(male); mainFrame.add(female);
		genderGroup.add(male); genderGroup.add(female);
		mainFrame.add(address); mainFrame.add(addressText);
		mainFrame.add(town); mainFrame.add(townCombo); 
		mainFrame.add(status); mainFrame.add(single); mainFrame.add(married); 	
		statusGroup.add(single); statusGroup.add(married);
		mainFrame.add(hobbies); mainFrame.add(singing);  mainFrame.add(dancing); 
		mainFrame.add(cycling);  mainFrame.add(swimming);
		mainFrame.add(login);  
		mainFrame.add(username);  mainFrame.add(usernameText);  
		mainFrame.add(password); mainFrame.add(passwordField);	
		mainFrame.add(emailAddress); mainFrame.add(emailAddressText);
		mainFrame.add(others); mainFrame.add(finalList); mainFrame.add(colleges);
		mainFrame.add(campus); mainFrame.add(finalListCampus);
		mainFrame.add(clickFinal);
		
		//Frame Properties
		mainFrame.setSize(400,1000);
		mainFrame.setLayout(null);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		//Exit
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ActionListener
		clickFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//JRadioButtonGender
			String gender;
				 if(male.isSelected()) {
					 gender = male.getText();				 
					   }else if(female.isSelected()) {
					   gender = female.getText();
				   }else {
					   gender = "N/A";
				   }
				
			String status;
				if(single.isSelected()) {
					status = single.getText();
				}else if (married.isSelected()){
					status = married.getText();
				}else {
					status = "N/A";
				}
				
				//JComboBox
			String townCity = null;
				if(townCombo.getSelectedIndex() == 0) {
					townCity = city[0];
				}else if(townCombo.getSelectedIndex() == 1){
					townCity = city[1];
				}else if(townCombo.getSelectedIndex() == 2) {
					townCity = city[2];
				}else if(townCombo.getSelectedIndex() == 3) {
					townCity = city[3];
				}else {
					townCity = city[4];
				}
				
				//JCheckBox
				String hb1;
				if(singing.isSelected()) {
					hb1 = singing.getText(); 
				}else {
					hb1 = "";
				}
				
				String hb2;
				if(dancing.isSelected()) {
					hb2 = dancing.getText();
				}else {
					hb2 = "";
				}
				
				String hb3;
				if(cycling.isSelected()) {
					hb3 = cycling.getText(); 
				}else {
					hb3 = "";
					
				}
				
				String hb4;
				
				if(swimming.isSelected()) {
					hb4 = swimming.getText();
				}else {
					hb4 = "";
				}
				
				//JPassword
				String data = 
						"Password: "
				+ new String(passwordField.getPassword());
					
				//JList
				String list = "";
				if(finalList.getSelectedIndex() != -1) {
					list = finalList.getSelectedValue();
				}
				String listCampus = "";
				if(finalListCampus.getSelectedIndex() != -1) {
					listCampus = finalListCampus.getSelectedValue();
				}

				
					
				JOptionPane.showMessageDialog(null, 
					personalInfo.getText() + "\n" + "\n" + "Name: "
				   + lastNameText.getText() + ", " + firstNameText.getText() +
					 " " + midInitialText.getText() + "\n" +
				   "Age: " + ageText.getText() + "\n" +
					 "Gender: " + gender + "\n" + "Address: " + addressText.getText() + townCity +
					 "\n" + "Status: " + status + "\n" + "Hobbies include " + hb1 + " " + hb2 + " " + hb3 + " " + hb4
					+  "\n" + "\n" + login.getText() + "\n" + "\n" + "Username: " + usernameText.getText() + "\n" + data + "\n" + "Email Address: " +
					 emailAddressText.getText() + "\n" + "\n" + others.getText() + "\n" + "\n" + "College: " + list + "\n" + "Campus: " + listCampus
				);
					
					  
				  
						
			}

		});
	}

	public static void main(String[] args) {
		new InfoPerson();
	}
}
