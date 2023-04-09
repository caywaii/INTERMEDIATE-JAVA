package DragAndDrop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ListDataListener;
import javax.swing.text.JTextComponent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MachinProb6_Finals {

	private JFrame frmCarylsAnimal;
	private JTextField tfAnimals;
	JComboBox cbAnimals;
	JList listAnimals;
	JLabel lblPicture;
	private JLabel lblPicAnimals;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MachinProb6_Finals window = new MachinProb6_Finals();
					window.frmCarylsAnimal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MachinProb6_Finals() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarylsAnimal = new JFrame();
		frmCarylsAnimal.setTitle("CARYL'S ANIMAL");
		frmCarylsAnimal.getContentPane().setBackground(new Color(255, 192, 203));
		frmCarylsAnimal.setBackground(new Color(255, 192, 203));
		frmCarylsAnimal.setBounds(100, 100, 873, 430);
		frmCarylsAnimal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarylsAnimal.getContentPane().setLayout(null);
		
		DefaultListModel<String>model1 = new DefaultListModel<>();
		JList <String> listAnimals = new JList <>(model1);
		listAnimals.setBackground(new Color(250, 250, 210));
		listAnimals.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				if(listAnimals.getSelectedValue() == "Pig") {
					tfAnimals.setText("Pig");
					lblPicAnimals.setIcon(new ImageIcon(new ImageIcon("src/pig.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
				}else if(listAnimals.getSelectedValue() == "Bird") {
					tfAnimals.setText("Bird");
					lblPicAnimals.setIcon(new ImageIcon(new ImageIcon("src/Bird.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
				}else if(listAnimals.getSelectedValue() == "Cat") {
					tfAnimals.setText("Cat");
					lblPicAnimals.setIcon(new ImageIcon(new ImageIcon("src/Cat.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
				}else if(listAnimals.getSelectedValue() == "Dog") {
					tfAnimals.setText("Dog");
					lblPicAnimals.setIcon(new ImageIcon(new ImageIcon("src/Dog.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
				}else if(listAnimals.getSelectedValue() == "Rabbit") {
					tfAnimals.setText("Rabbit");
					lblPicAnimals.setIcon(new ImageIcon(new ImageIcon("src/Rabbit.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
				}else {
					tfAnimals.setText("");
					lblPicAnimals.setIcon(new ImageIcon(""));
				}
				
					
			}
		});
		listAnimals.setFont(new Font("Impact", Font.PLAIN, 20));
		listAnimals.setBounds(229, 34, 274, 230);
		frmCarylsAnimal.getContentPane().add(listAnimals);
		
		
		String[] animals = {"Select One", "Bird", "Cat", "Dog", "Rabbit","Pig"};
		cbAnimals = new JComboBox(animals);
		cbAnimals.setBackground(new Color(216, 191, 216));
		cbAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbAnimals.getSelectedItem() == "Select One") {
					JOptionPane.showMessageDialog(null, "Please Select One");
				}else {
					model1.addElement(cbAnimals.getSelectedItem().toString());
				}
				
			}
		});
		cbAnimals.setFont(new Font("Impact", Font.PLAIN, 30));
		cbAnimals.setBounds(10, 34, 194, 40);
		frmCarylsAnimal.getContentPane().add(cbAnimals);
		
		
	
		
		tfAnimals = new JTextField();
		tfAnimals.setBackground(new Color(216, 191, 216));
		tfAnimals.setFont(new Font("Impact", Font.PLAIN, 30));
		tfAnimals.setBounds(229, 275, 274, 45);
		frmCarylsAnimal.getContentPane().add(tfAnimals);
		tfAnimals.setColumns(10);
		
		lblPicAnimals = new JLabel("");
		lblPicAnimals.setBounds(529, 34, 318, 230);
		frmCarylsAnimal.getContentPane().add(lblPicAnimals);
		
		lblNewLabel = new JLabel("CHOOSE YOUR POKEPETS!");
		lblNewLabel.setForeground(new Color(255, 127, 80));
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 40));
		lblNewLabel.setBackground(new Color(221, 160, 221));
		lblNewLabel.setBounds(10, 331, 421, 56);
		frmCarylsAnimal.getContentPane().add(lblNewLabel);
	
	}
}
