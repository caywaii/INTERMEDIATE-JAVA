package Lesson_GUI_HardCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ACTIVITY_GUI_1 {
	
	JFrame frame;
	JTextField tf; JTextField tf2; JLabel num1; JLabel num2; JButton b1; JLabel mainLabel;
	ACTIVITY_GUI_1(){
		frame = new JFrame();
		
		mainLabel = new JLabel();
		mainLabel.setBounds(50, 300, 150, 30);
		//1
		tf = new JTextField();
		tf.setBounds(50,50,150,20);
		
		num1 = new JLabel("Number 1");
		num1.setBounds(50,100,250,20);
		
		//2
		tf2 = new JTextField();
		tf2.setBounds(50,150,150,20);
		
		num2 = new JLabel("Number 2");
		num2.setBounds(50,200,250,20);
		
		b1 = new JButton("Click");
		b1.setBounds(50,250,95,30);
		
		frame.add(b1); frame.add(num2); frame.add(num1); frame.add(tf); frame.add(tf2); frame.add(mainLabel);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//button
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = tf.getText();
				String data2 = tf2.getText();
				
				int number1 = Integer.parseInt(data1);
				int number2 = Integer.parseInt(data2);
				
				if(number1 > number2) {
					mainLabel.setText(data1);
				}else{
					mainLabel.setText(data2);
				}
					
			}
		});		
	}
	
	public static void main(String[] args) {
		new ACTIVITY_GUI_1();
	}
	
}
