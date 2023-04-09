package MidTerm_Exam;

import javax.swing.*;
import java.awt.event.*;

public class Pizza {

	JFrame mainFrame;
	JLabel size, toppings;
	JLabel smallP, mediumP, largeP, jumboP, plus, price;
	JRadioButton smallB, mediumB, largeB, jumboB;
	ButtonGroup pizzaSizeGroup;
	JCheckBox mushrooms, onions, olives, sausages, pepperoni, moreCheese;
	JButton order;
	
	Pizza(){
		
		//Frame
		mainFrame = new JFrame("Caryl's Pizza");
		
		//Size Label
		size = new JLabel("Size: ");
		size.setBounds(25, 50, 150, 20);
		//Size Button
		smallB = new JRadioButton("Small");
		smallB.setBounds(70, 50, 80, 20);
		
		mediumB = new JRadioButton("Medium");
		mediumB.setBounds(150, 50, 80, 20);
		
		largeB = new JRadioButton("Large");
		largeB.setBounds(230, 50, 80, 20);
		
		jumboB = new JRadioButton("Jumbo");
		jumboB.setBounds(310, 50, 100, 20);
		
		pizzaSizeGroup = new ButtonGroup();
		
		//Top Label
		toppings = new JLabel("Toppings: ");
		toppings.setBounds(25, 100, 80, 20);
		//Top CheckBox
		mushrooms = new JCheckBox("Mushrooms");
		mushrooms.setBounds(120, 100, 100, 20);
		
		onions = new JCheckBox("Onions");
		onions.setBounds(250, 100, 100, 20);
		
		olives = new JCheckBox("Olives");
		olives.setBounds(120, 130, 100, 20);
		
		sausages = new JCheckBox("Sausage");
		sausages.setBounds(250, 130, 100, 20);
		
		pepperoni = new JCheckBox("Pepperoni");
		pepperoni.setBounds(120, 160, 100, 20);
		
		moreCheese = new JCheckBox("More Cheese");
		moreCheese.setBounds(250, 160, 100, 20);
		
		//Label Price
		price = new JLabel("Price:");
		price.setBounds(25, 200, 100, 20);
		
		smallP = new JLabel("• Small Pizza is 100");
		smallP.setBounds(50, 220, 150, 20);
		
		mediumP = new JLabel("• Medium Pizza is 200");
		mediumP.setBounds(50, 240, 150, 20);
		
		largeP = new JLabel("• Large Pizza is 300");
		largeP.setBounds(50, 260, 150, 20);
		
		jumboP = new JLabel("• Jumbo Pizza is 400");
		jumboP.setBounds(50, 280, 150, 20);
		
		plus = new JLabel("Plus 25 for each additional topping");
		plus.setBounds(25, 320, 300, 20);
		
		//Button
		order = new JButton("ORDER");
		order.setBounds(150, 380, 100, 20);
	
		//Frame Add
		mainFrame.add(size); mainFrame.add(smallB); mainFrame.add(mediumB); mainFrame.add(largeB); mainFrame.add(jumboB);
		mainFrame.add(toppings); mainFrame.add(mushrooms); mainFrame.add(onions); mainFrame.add(olives);
		mainFrame.add(sausages); mainFrame.add(pepperoni); mainFrame.add(moreCheese); mainFrame.add(price);	
		mainFrame.add(smallP); mainFrame.add(mediumP); mainFrame.add(largeP); mainFrame.add(jumboP); mainFrame.add(plus);
		mainFrame.add(order);
		
		pizzaSizeGroup.add(smallB); pizzaSizeGroup.add(mediumB); pizzaSizeGroup.add(largeB);pizzaSizeGroup.add(jumboB);
		//Frame Properties
		mainFrame.setSize(400,500);
		mainFrame.setLayout(null);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		//Exit Option
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ActionListener
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//RadioButton
				String sizesPizza = null;
				int FinalPrices = 0;
				 if(smallB.isSelected()) {
					 sizesPizza = "You Ordered a Small Pizza 100";	 
					 FinalPrices = 100;
				}else if(mediumB.isSelected()) {
					   sizesPizza = "You Ordered a Medium Pizza 200";
					   FinalPrices = 200;
				 }else if(largeB.isSelected()) {
					 sizesPizza = "You Ordered a Large Pizza 300";
					 FinalPrices = 300;
				 }else if(jumboB.isSelected()) {
					 sizesPizza = "You Ordered a Large Pizza 400";
					 FinalPrices = 400;
				 }else {
					 JOptionPane.showMessageDialog(null,  "Missing Pizza Sizes");
					 
				 }
				 //CheckBox
				 int topPrice = 0;
				 String m;
				 if(mushrooms.isSelected()) {
						m = mushrooms.getText(); 
						topPrice += 25;
					}else {
						m = "";
					}
				 
				 String on;
				 if(onions.isSelected()) {
						on = onions.getText(); 
						topPrice = +25;
					}else {
						on = "";
					}
				 String ol;
				 if(olives.isSelected()) {
						ol = olives.getText(); 
						topPrice += 25;
					}else {
						ol = "";
					}
				 String s;
				 if(sausages.isSelected()) {
						s = sausages.getText(); 
						topPrice += 25;
					}else {
						s = "";
					}
				 String p;
				 if(pepperoni.isSelected()) {
						p = pepperoni.getText(); 
						topPrice += 25;
					}else {
						p = "";
					}
				 String mc;
				 if(moreCheese.isSelected()) {
						mc = moreCheese.getText(); 
						topPrice += 25;
					}else {
						mc = "";
					}
				 
				 int finalPrice = FinalPrices + topPrice;
				 
				 
				 JOptionPane.showMessageDialog(null,  sizesPizza + "\n" + "With the Following Additional Toppings: " + "\n" +
				 m + "\n" + on + "\n" + ol + "\n" + s + "\n" + p + "\n" + mc + "\n" + "Additional Toppings: " + topPrice + "\n" + "\n" +
						 "Total Amount is: " + finalPrice);
				
				
				
			}
			
		});
		
		
	}
	
	public static void main(String[] args) {
		new Pizza();
	}
}
