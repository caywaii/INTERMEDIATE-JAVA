package DragAndDrop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import java.awt.Color;

public class ComboBox {

	private JFrame frmSeatwork;
	private JTextField tfAnimals;

	JTextArea txtArea;
	JLabel lblPicture;
	private JLabel lblNewLabel;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox window = new ComboBox();
					window.frmSeatwork.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ComboBox() {
		initialize();
	}

	private void initialize() {
		frmSeatwork = new JFrame();
		frmSeatwork.setTitle("Seatwork 2.1");
		frmSeatwork.getContentPane().setBackground(new Color(255, 182, 193));
		frmSeatwork.setBounds(100, 100, 609, 396);
		frmSeatwork.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSeatwork.getContentPane().setLayout(null);
		frmSeatwork.setLocationRelativeTo(null);
		
		String[] animals = {"Select One", "Bird", "Cat", "Dog", "Rabbit","Pig"};
		JComboBox cbAnimals = new JComboBox(animals);
		cbAnimals.setFont(new Font("Impact", Font.PLAIN, 20));
		cbAnimals.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				tfAnimals.setText((String) cbAnimals.getSelectedItem());
				txtArea.setText((String) cbAnimals.getSelectedItem());
				
				if(cbAnimals.getSelectedItem() == "Pig") {
					lblPicture.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Vince\\eclipse-workspace\\CCOBJPGL\\src\\pig.jpg").getImage().getScaledInstance(170, 150, 0)));
					
				}else if(cbAnimals.getSelectedItem() == "Bird"){
					lblPicture.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Vince\\eclipse-workspace\\CCOBJPGL\\src\\Bird.png").getImage().getScaledInstance(170, 150, 0)));
				}else if(cbAnimals.getSelectedItem() == "Cat"){
					lblPicture.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Vince\\eclipse-workspace\\CCOBJPGL\\src\\Cat.jpg").getImage().getScaledInstance(170, 180, 0)));
				}else if(cbAnimals.getSelectedItem() == "Dog") {
					lblPicture.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Vince\\eclipse-workspace\\CCOBJPGL\\src\\Dog.jpg").getImage().getScaledInstance(170, 150, 0)));
				}else if(cbAnimals.getSelectedItem() == "Rabbit") {
					lblPicture.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Vince\\eclipse-workspace\\CCOBJPGL\\src\\Rabbit.jpg").getImage().getScaledInstance(170, 150, 0)));
				}
				else {
					lblPicture.setIcon(new ImageIcon(""));
				}
			
			}
		});
		cbAnimals.setBounds(35, 69, 127, 32);
		frmSeatwork.getContentPane().add(cbAnimals);
		
		tfAnimals = new JTextField();
		tfAnimals.setFont(new Font("Impact", Font.PLAIN, 20));
		tfAnimals.setBounds(222, 68, 127, 35);
		frmSeatwork.getContentPane().add(tfAnimals);
		tfAnimals.setColumns(10);
		
		txtArea = new JTextArea();
		txtArea.setFont(new Font("Impact", Font.PLAIN, 20));
		txtArea.setBounds(397, 70, 179, 237);
		frmSeatwork.getContentPane().add(txtArea);
		
		lblPicture = new JLabel("");
		lblPicture.setBounds(85, 145, 207, 139);
		frmSeatwork.getContentPane().add(lblPicture);
		
		lblNewLabel = new JLabel("CARYL'S CUTE PETS UWU");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel.setBounds(187, 11, 201, 26);
		frmSeatwork.getContentPane().add(lblNewLabel);
	}
}
