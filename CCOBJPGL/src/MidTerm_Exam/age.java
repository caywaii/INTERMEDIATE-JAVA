package MidTerm_Exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class age {
	JFrame mainFrame;
	JLabel inputNum1, answer;
	JTextField num1Field;
	JButton generateResult;
	
	age(){
		mainFrame = new JFrame("Person Age");
		
		inputNum1 = new JLabel("Enter Your Age: ");
		inputNum1.setBounds(20, 50, 150, 20);
		
		num1Field = new JTextField();
		num1Field.setBounds(150, 50, 150, 20);
		
		generateResult = new JButton("Click");
		generateResult.setBounds(150, 100, 150, 20);
		
		mainFrame.add(inputNum1); mainFrame.add(num1Field); mainFrame.add(generateResult); 
		mainFrame.setSize(400,250);
		mainFrame.setLayout(null);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		generateResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int finalAge = Integer.parseInt(num1Field.getText());
				
				int finalMonths = finalAge * 12;
				int days = (finalAge / 4); 
				int daysx = days * 366;
				int years = (finalAge - (finalAge / 4));
				int yearsFinal = years * 365;
				int finalDays = daysx + yearsFinal;
				int finalWeeks = finalAge * 52;
				int finalHours = finalDays * 24;
				
				String result =  "Total Months = " + finalMonths + "\n" +
								 "Total Weeks  = " + finalWeeks + "\n" +
								 "Total Days   = " + finalDays  + "\n" +
								 "Total Hours  = " + finalHours + "\n";
				
				JOptionPane.showMessageDialog(null, result);
				
				
			}
			
		});
	}
	
	public static void main(String[] args) {
		new age();
	}
}
