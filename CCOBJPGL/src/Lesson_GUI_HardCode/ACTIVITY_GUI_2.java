package Lesson_GUI_HardCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ACTIVITY_GUI_2 {
	JFrame frame;
	JTextField tf; JLabel num1; JButton b1; JLabel mainLabel;

	ACTIVITY_GUI_2(){
	frame = new JFrame("ODD OR EVEN");
		
		mainLabel = new JLabel();
		mainLabel.setBounds(50, 300, 150, 30);
		//1
		tf = new JTextField();
		tf.setBounds(100,50,150,20);
		
		num1 = new JLabel("PUT NUMBER HERE HEHE!");
		num1.setBounds(50,100,250,20);
		
		
		b1 = new JButton("Click");
		b1.setBounds(50,250,95,30);
		
		frame.add(b1); frame.add(num1); frame.add(tf); frame.add(mainLabel);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//button
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = tf.getText();
				
				int number1 = Integer.parseInt(data1);
				
				if(number1 <= 0) {
					mainLabel.setText(data1 + " point of reference hmmm");
					
				}else if(number1 % 2 == 0) {
					mainLabel.setText(data1 + " even number yeyy!!");
				}else {
					mainLabel.setText(data1 + " odd number wohoo!");
				}
					
					
			}
		});		
	}
	
	public static void main(String[] args) {
		new ACTIVITY_GUI_2();
	}
	}
	

