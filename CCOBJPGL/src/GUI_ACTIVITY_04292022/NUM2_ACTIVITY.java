package GUI_ACTIVITY_04292022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NUM2_ACTIVITY {

//Global Variables
	JFrame mainFrame;
	JLabel inputNum1, inputNum2, result;
	JTextField textField, textField2;
	JButton generateSum, generateDifference, generateProduct, generateQuotient;
	
	NUM2_ACTIVITY(){
		
		//Frame 	
		mainFrame = new JFrame("Calculator");
		
		//Label
		inputNum1 = new JLabel("Input First Number");
		inputNum1.setBounds(20,100,150,20);
		
		inputNum2 = new JLabel("Input Second Number");
		inputNum2.setBounds(20,150,150,20);
		
		//Text Field
		textField = new JTextField();
		textField.setBounds(150,100,150,20);
		
		textField2 = new JTextField();
		textField2.setBounds(150,150,150,20);
		
		//Button
		generateSum = new JButton("SUM");
		generateSum.setBounds(150,200,150,20);
		
		generateDifference = new JButton("DIFFERENCE");
		generateDifference.setBounds(150,250,150,20);
		
		generateProduct = new JButton("PRODUCT");
		generateProduct.setBounds(150,300,150,20);
		
		generateQuotient = new JButton("QUOTIENT");
		generateQuotient.setBounds(150,350,150,20);
		
		//Result Label
		result = new JLabel("Input First Number");
		result.setBounds(20,400,150,20);
		
		//Add
		mainFrame.add(inputNum1);
		mainFrame.add(inputNum2);
		mainFrame.add(result);
		mainFrame.add(textField);
		mainFrame.add(textField2);
		mainFrame.add(generateSum); mainFrame.add(generateDifference); 
		mainFrame.add(generateProduct); mainFrame.add(generateQuotient);
		
		//Frame Properties
		mainFrame.setSize(400,600);
		mainFrame.setLayout(null);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		//Exit
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ActionListenerSum
				generateSum.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int dataInput = Integer.parseInt(textField.getText());
						int dataInput2 = Integer.parseInt(textField2.getText());
				
						int sum = dataInput + dataInput2;
				
						result.setText(sum + " is the answer");
			}
		});
		//ActionListenerDifference
				generateDifference.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int dataInput = Integer.parseInt(textField.getText());
						int dataInput2 = Integer.parseInt(textField2.getText());
						
						int difference = dataInput - dataInput2;
						
						result.setText(difference + " is the answer");
					}
				});
		//ActionListenerProduct
				generateProduct.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int dataInput = Integer.parseInt(textField.getText());
						int dataInput2 = Integer.parseInt(textField2.getText());
						
						int product = dataInput * dataInput2;
						
						result.setText(product + " is the answer");
					}
				});
		//ActionListenerProduct
				generateQuotient.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int dataInput = Integer.parseInt(textField.getText());
						int dataInput2 = Integer.parseInt(textField2.getText());
						
						int quotient = dataInput / dataInput2;
						
						result.setText(quotient + " is the answer");
					}
				});
		
	}
	
	public static void main(String[] args) {
		new NUM2_ACTIVITY();
	}
}
