package GUI_ACTIVITY_04292022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NUM3_ACTIVITY {

	//Global Variables
		JFrame mainFrame;
		JLabel inputNum1, inputNum2, inputNum3, inputNum4, inputNum5, result, result2;
		JTextField textField1, textField2, textField3, textField4, textField5;
		JButton generateResult;
		
		NUM3_ACTIVITY(){
			
			//Frame
			mainFrame = new JFrame("Highest and Lowest");
			
			//Label
			inputNum1 = new JLabel("Input First Number");
			inputNum1.setBounds(20,50,150,20);
			
			inputNum2 = new JLabel("Input Second Number");
			inputNum2.setBounds(20,100,150,20);
		
			inputNum3 = new JLabel("Input Third Number");
			inputNum3.setBounds(20,150,150,20);
			
			inputNum4 = new JLabel("Input Fourth Number");
			inputNum4.setBounds(20,200,150,20);
			
			inputNum5 = new JLabel("Input Fifth Number");
			inputNum5.setBounds(20,250,150,20);
			
			//Text Field
			textField1 = new JTextField();
			textField1.setBounds(150,50,150,20);
			
			textField2 = new JTextField();
			textField2.setBounds(150,100,150,20);
			
			textField3 = new JTextField();
			textField3.setBounds(150,150,150,20);
			
			textField4 = new JTextField();
			textField4.setBounds(150,200,150,20);
			
			textField4 = new JTextField();
			textField4.setBounds(150,200,150,20);
			
			textField5 = new JTextField();
			textField5.setBounds(150,250,150,20);
			
			//Button
			generateResult = new JButton("RESULT");
			generateResult.setBounds(150,300,150,20);
			
			//Result Label
			result = new JLabel("Highest");
			result.setBounds(20,400,150,20);
			
			result2 = new JLabel("Lowest");
			result2.setBounds(20,420,150,20);
		
			//Add
			mainFrame.add(inputNum1); mainFrame.add(inputNum2); mainFrame.add(inputNum3);
			mainFrame.add(inputNum4); mainFrame.add(inputNum5); mainFrame.add(result); mainFrame.add(result2);
			
			mainFrame.add(textField1); mainFrame.add(textField2); mainFrame.add(textField3);
			mainFrame.add(textField4); mainFrame.add(textField5); mainFrame.add(generateResult);
			
			//Frame Properties
			mainFrame.setSize(400,600);
			mainFrame.setLayout(null);
			mainFrame.setLocationRelativeTo(null);
			mainFrame.setVisible(true);
			
			//Exit
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			generateResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int dataInput1 = Integer.parseInt(textField1.getText());
					int dataInput2 = Integer.parseInt(textField2.getText());
					int dataInput3 = Integer.parseInt(textField3.getText());
					int dataInput4 = Integer.parseInt(textField4.getText());
					int dataInput5 = Integer.parseInt(textField5.getText());
					
					//Highest
					if(dataInput1 >= dataInput2 && dataInput1 >= dataInput3 && dataInput1 >= dataInput4 && dataInput1 >= dataInput5) {
						result.setText(dataInput1 + " is the Highest");
					}else if(dataInput2 >= dataInput1 && dataInput2 >= dataInput3 && dataInput2 >= dataInput4 && dataInput2 >= dataInput5) {
						result.setText(dataInput2 + " is the Highest");
						
					}else if(dataInput3 >= dataInput1 && dataInput3 >= dataInput2 && dataInput3 >= dataInput4 && dataInput3 >= dataInput5) {
						result.setText(dataInput3 + " is the Highest");
						
					}else if(dataInput4 >= dataInput1 && dataInput4 >= dataInput2 && dataInput4 >= dataInput3 && dataInput4 >= dataInput5) {
						result.setText(dataInput4 + " is the Highest");
					}else {
						result.setText(dataInput5 + " is the Highest");
						
					}
				//Lowest
					if(dataInput1 <= dataInput2 && dataInput1 <= dataInput3 && dataInput1 <= dataInput4 && dataInput1 <= dataInput5) {
						result2.setText(dataInput1 + " is the Lowest");
					}else if(dataInput2 <= dataInput1 && dataInput2 <= dataInput3 && dataInput2 <= dataInput4 && dataInput2 <= dataInput5) {
						result2.setText(dataInput2 + " is the Lowest");
						
					}else if(dataInput3 <= dataInput1 && dataInput3 <= dataInput2 && dataInput3 <= dataInput4 && dataInput3 <= dataInput5) {
						result2.setText(dataInput3 + " is the Lowest");
						
					}else if(dataInput4 <= dataInput1 && dataInput4 <= dataInput2 && dataInput4 <= dataInput3 && dataInput4 <= dataInput5) {
						result2.setText(dataInput4 + " is the Lowest");
					}else {
						result2.setText(dataInput5 + " is the Lowest");
						
					}					
					
				}
				
			});
		}
		
		public static void main(String[] args) {
			new NUM3_ACTIVITY();
		}
}
