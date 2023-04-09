package GUI_ACTIVITY_04292022;

import javax.swing.*;
import java.awt.event.*;

public class NUM1_ACTIVITY {

//Global Variables
	JFrame mainFrame;
	JLabel inputNum, result;
	JTextField tf;
	JButton generateResult;
	
	NUM1_ACTIVITY(){
		
		//Frame
		mainFrame = new JFrame("Odd or Even");
		
		//Label 
		inputNum = new JLabel("Input Number Here");
		inputNum.setBounds(20,100,150,20);
		
		//TextField for inputNum
		tf = new JTextField();
		tf.setBounds(150,100,150,20);
		
		//Button
		generateResult = new JButton("Result");
		generateResult.setBounds(150,120,150,20);
		
		//Label Result
		result = new JLabel("Result: ");
		result.setBounds(50,200,150,20);
		
		//Add
		mainFrame.add(inputNum);
		mainFrame.add(tf);
		mainFrame.add(result);
		mainFrame.add(generateResult);
		
		//Frame Properties
		mainFrame.setSize(400,400);
		mainFrame.setLayout(null);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		//Exit
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Button Action Listener
		generateResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dataInput = Integer.parseInt(tf.getText());
				
				if(dataInput == 0) {
					result.setText(dataInput + " Zero");
					
				}else if(dataInput % 2 == 0) {
					result.setText(dataInput + " Positive Even");
					if(dataInput < 0) {
						result.setText(dataInput + " Negative Even");
					}
				}else {
					result.setText(dataInput + " Positive Odd");
					if(dataInput % 2 < 0) {
						result.setText(dataInput + " Negative Odd");
					}
				}	
			}
		});
	}
	public static void main(String[] args) {
		new NUM1_ACTIVITY();
	}
}
