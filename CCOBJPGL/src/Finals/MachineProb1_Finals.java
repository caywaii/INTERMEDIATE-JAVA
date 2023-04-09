package Finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;

public class MachineProb1_Finals {

	private JFrame frmPizzacay;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MachineProb1_Finals window = new MachineProb1_Finals();
					window.frmPizzacay.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JLabel lblTitle, lblSize, lblToppings, lblPrice, lblSmallPrice, lblMediumPrice, lblLargePrice, lblJumboPrice, lblAddToppings;
	JButton btnOrderNow, btnOrderAll;
	JRadioButton smallButton, mediumButton, largeButton, jumboButton;
	ButtonGroup pizzaSizeGroup;
	JCheckBox checkMushroom, checkOnions, checkOlives, checkPepperoni, checkMoreCheese, checkSausage;
	public MachineProb1_Finals() {
		initialize();
	}

	private void initialize() {
		frmPizzacay = new JFrame();
		frmPizzacay.setBackground(new Color(255, 140, 0));
		frmPizzacay.setTitle("PizzaCay");
		frmPizzacay.getContentPane().setForeground(new Color(105, 105, 105));
		frmPizzacay.getContentPane().setBackground(new Color(255, 192, 203));
		frmPizzacay.getContentPane().setFont(new Font("Impact", Font.PLAIN, 20));
		frmPizzacay.setBounds(100, 100, 816, 607);
		frmPizzacay.setLocationRelativeTo(null);
		frmPizzacay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzacay.getContentPane().setLayout(null);
		
		lblTitle = new JLabel("WELCOME TO PIZZACAY");
		lblTitle.setForeground(new Color(255, 250, 205));
		lblTitle.setFont(new Font("Impact", Font.PLAIN, 50));
		lblTitle.setBounds(175, 11, 454, 79);
		frmPizzacay.getContentPane().add(lblTitle);
		
		lblSize = new JLabel("SIZES:");
		lblSize.setForeground(new Color(218, 112, 214));
		lblSize.setFont(new Font("Impact", Font.PLAIN, 20));
		lblSize.setBounds(48, 92, 98, 52);
		frmPizzacay.getContentPane().add(lblSize);
		
		smallButton = new JRadioButton("Small");
		smallButton.setForeground(new Color(105, 105, 105));
		smallButton.setBackground(new Color(255, 192, 203));
		smallButton.setFont(new Font("Impact", Font.PLAIN, 20));
		smallButton.setBounds(197, 107, 109, 23);
		frmPizzacay.getContentPane().add(smallButton);
		
		mediumButton = new JRadioButton("Medium");
		mediumButton.setForeground(new Color(105, 105, 105));
		mediumButton.setBackground(new Color(255, 192, 203));
		mediumButton.setFont(new Font("Impact", Font.PLAIN, 20));
		mediumButton.setBounds(347, 107, 109, 23);
		frmPizzacay.getContentPane().add(mediumButton);
		
		largeButton = new JRadioButton("Large");
		largeButton.setForeground(new Color(105, 105, 105));
		largeButton.setBackground(new Color(255, 192, 203));
		largeButton.setFont(new Font("Impact", Font.PLAIN, 20));
		largeButton.setBounds(505, 107, 109, 23);
		frmPizzacay.getContentPane().add(largeButton);
		
		jumboButton = new JRadioButton("Jumbo");
		jumboButton.setForeground(new Color(105, 105, 105));
		jumboButton.setBackground(new Color(255, 192, 203));
		jumboButton.setFont(new Font("Impact", Font.PLAIN, 20));
		jumboButton.setBounds(648, 107, 109, 23);
		frmPizzacay.getContentPane().add(jumboButton);
		
		pizzaSizeGroup = new ButtonGroup();
		pizzaSizeGroup.add(smallButton); pizzaSizeGroup.add(mediumButton); pizzaSizeGroup.add(largeButton);
		pizzaSizeGroup.add(jumboButton);
		
		lblToppings = new JLabel("TOPPINGS:");
		lblToppings.setForeground(new Color(218, 112, 214));
		lblToppings.setFont(new Font("Impact", Font.PLAIN, 20));
		lblToppings.setBounds(48, 155, 87, 52);
		frmPizzacay.getContentPane().add(lblToppings);
		
		checkMushroom = new JCheckBox("Mushrooms");
		checkMushroom.setForeground(new Color(105, 105, 105));
		checkMushroom.setBackground(new Color(255, 192, 203));
		checkMushroom.setFont(new Font("Impact", Font.PLAIN, 20));
		checkMushroom.setBounds(197, 170, 135, 23);
		frmPizzacay.getContentPane().add(checkMushroom);
		
		checkOnions = new JCheckBox("Onions");
		checkOnions.setForeground(new Color(105, 105, 105));
		checkOnions.setBackground(new Color(255, 192, 203));
		checkOnions.setFont(new Font("Impact", Font.PLAIN, 20));
		checkOnions.setBounds(347, 170, 97, 23);
		frmPizzacay.getContentPane().add(checkOnions);
		
		checkOlives = new JCheckBox("Olives");
		checkOlives.setForeground(new Color(105, 105, 105));
		checkOlives.setBackground(new Color(255, 192, 203));
		checkOlives.setFont(new Font("Impact", Font.PLAIN, 20));
		checkOlives.setBounds(505, 170, 97, 23);
		frmPizzacay.getContentPane().add(checkOlives);
		
		checkSausage = new JCheckBox("Sausage");
		checkSausage.setForeground(new Color(105, 105, 105));
		checkSausage.setBackground(new Color(255, 192, 203));
		checkSausage.setFont(new Font("Impact", Font.PLAIN, 20));
		checkSausage.setBounds(197, 226, 97, 23);
		frmPizzacay.getContentPane().add(checkSausage);
		
		checkPepperoni = new JCheckBox("Pepperoni");
		checkPepperoni.setForeground(new Color(105, 105, 105));
		checkPepperoni.setBackground(new Color(255, 192, 203));
		checkPepperoni.setFont(new Font("Impact", Font.PLAIN, 20));
		checkPepperoni.setBounds(347, 226, 114, 23);
		frmPizzacay.getContentPane().add(checkPepperoni);
		
		checkMoreCheese = new JCheckBox("More Cheese");
		checkMoreCheese.setForeground(new Color(105, 105, 105));
		checkMoreCheese.setBackground(new Color(255, 192, 203));
		checkMoreCheese.setFont(new Font("Impact", Font.PLAIN, 20));
		checkMoreCheese.setBounds(505, 226, 135, 23);
		frmPizzacay.getContentPane().add(checkMoreCheese);
		
		lblPrice = new JLabel("PRICE:");
		lblPrice.setForeground(new Color(218, 112, 214));
		lblPrice.setFont(new Font("Impact", Font.PLAIN, 20));
		lblPrice.setBounds(48, 258, 62, 52);
		frmPizzacay.getContentPane().add(lblPrice);
		
		lblSmallPrice = new JLabel("Small Pizza is 100");
		lblSmallPrice.setForeground(new Color(105, 105, 105));
		lblSmallPrice.setFont(new Font("Impact", Font.PLAIN, 20));
		lblSmallPrice.setBounds(197, 322, 164, 52);
		frmPizzacay.getContentPane().add(lblSmallPrice);
		
		lblLargePrice = new JLabel("Large Pizza is 300");
		lblLargePrice.setForeground(new Color(105, 105, 105));
		lblLargePrice.setFont(new Font("Impact", Font.PLAIN, 20));
		lblLargePrice.setBounds(197, 385, 164, 52);
		frmPizzacay.getContentPane().add(lblLargePrice);
		
		JLabel lblMediumPrice = new JLabel("Medium Pizza is 200");
		lblMediumPrice.setForeground(new Color(105, 105, 105));
		lblMediumPrice.setFont(new Font("Impact", Font.PLAIN, 20));
		lblMediumPrice.setBounds(422, 322, 185, 52);
		frmPizzacay.getContentPane().add(lblMediumPrice);
		
		lblJumboPrice = new JLabel("Jumbo Pizza is 400");
		lblJumboPrice.setForeground(new Color(105, 105, 105));
		lblJumboPrice.setFont(new Font("Impact", Font.PLAIN, 20));
		lblJumboPrice.setBounds(422, 385, 164, 52);
		frmPizzacay.getContentPane().add(lblJumboPrice);
		
		lblAddToppings = new JLabel("PLUS 25 FOR EACH ADDITIONAL TOPPINGS");
		lblAddToppings.setForeground(new Color(218, 112, 214));
		lblAddToppings.setFont(new Font("Impact", Font.PLAIN, 20));
		lblAddToppings.setBounds(48, 448, 342, 52);
		frmPizzacay.getContentPane().add(lblAddToppings);
		
		btnOrderAll = new JButton("ORDER ALL");
		btnOrderAll.setBackground(new Color(216, 191, 216));
		btnOrderAll.setFont(new Font("Impact", Font.PLAIN, 20));
		btnOrderAll.setBounds(441, 511, 145, 36);
		frmPizzacay.getContentPane().add(btnOrderAll);
		
		btnOrderAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				int totalAmountToppings = 25 * 6;
				int totalAmountPizza = 100 + 200 + 300 + 400;
				int totalPizzaCay = totalAmountToppings + totalAmountPizza;
				int x = JOptionPane.showConfirmDialog(null, "Continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if(x == 0) {
					JOptionPane.showMessageDialog(null, "YOU ORDERED A: " + "\n" + lblSmallPrice.getText() + "\n" + lblMediumPrice.getText() + "\n" 
							+ lblLargePrice.getText() + "\n" +lblJumboPrice.getText() + "\n" +  "\n" + "WITH THE FOLLOWING ADDITIONAL TOPPINGS: " + "\n" +
							checkMushroom.getText() + ", " + checkOnions.getText() + ", " + checkOlives.getText() + ", " + checkPepperoni.getText()
							+ ", " + checkSausage.getText() + ", " + checkMoreCheese.getText() + "\n" + "Additional Toppings: " + totalAmountToppings + "\n" + 
							"\n" + "Total Amount is: " + totalPizzaCay);
				}else {
					
				}
				
			}
			
		});
		btnOrderNow = new JButton("ORDER NOW");
		btnOrderNow.setBackground(new Color(216, 191, 216));
		btnOrderNow.setFont(new Font("Impact", Font.PLAIN, 20));
		btnOrderNow.setBounds(223, 513, 138, 32);
		frmPizzacay.getContentPane().add(btnOrderNow);
		btnOrderNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//RadioButton
				String sizesPizza = null;
				int FinalPrices = 0;
				 if(smallButton.isSelected()) {
					 sizesPizza = "You Ordered a Small Pizza 100";	 
					 FinalPrices = 100;
				}else if(mediumButton.isSelected()) {
					   sizesPizza = "You Ordered a Medium Pizza 200";
					   FinalPrices = 200;
				 }else if(largeButton.isSelected()) {
					 sizesPizza = "You Ordered a Large Pizza 300";
					 FinalPrices = 300;
				 }else if(jumboButton.isSelected()) {
					 sizesPizza = "You Ordered a Large Pizza 400";
					 FinalPrices = 400;
				 }else {
					 JOptionPane.showMessageDialog(null,  "Missing Pizza Sizes");
					 
				 }
				 //CheckBox
				 int topPrice = 0;
				 String m;
				 if(checkMushroom.isSelected()) {
						m = checkMushroom.getText(); 
						topPrice += 25;
					}else {
						m = "";
					}
				 
				 String on;
				 if(checkOnions.isSelected()) {
						on = checkOnions.getText(); 
						topPrice = +25;
					}else {
						on = "";
					}
				 String ol;
				 if(checkOlives.isSelected()) {
						ol = checkOlives.getText(); 
						topPrice += 25;
					}else {
						ol = "";
					}
				 String s;
				 if(checkSausage.isSelected()) {
						s = checkSausage.getText(); 
						topPrice += 25;
					}else {
						s = "";
					}
				 String p;
				 if(checkPepperoni.isSelected()) {
						p = checkPepperoni.getText(); 
						topPrice += 25;
					}else {
						p = "";
					}
				 String mc;
				 if(checkMoreCheese.isSelected()) {
						mc = checkMoreCheese.getText(); 
						topPrice += 25;
					}else {
						mc = "";
					}
				 
				 int finalPrice = FinalPrices + topPrice;
				
				int x = JOptionPane.showConfirmDialog(null, "Continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if(x == 0) {
					 JOptionPane.showMessageDialog(null,  sizesPizza + "\n" + "With the Following Additional Toppings: " + "\n" +
							 m + "\n" + on + "\n" + ol + "\n" + s + "\n" + p + "\n" + mc + "\n" + "Additional Toppings: " + topPrice + "\n" + "\n" +
									 "Total Amount is: " + finalPrice);
							
				}else {
					
				}
				
			}
			
		});
		
	}
}
