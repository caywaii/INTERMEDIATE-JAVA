package Lesson_GUI_HardCode;

import javax.swing.*;
import java.awt.event.*;


public class ButtonExample2 {

public static void main(String[] args) {
		
		JFrame frame = new JFrame("ButtonExample1");
		
		JButton button1 = new JButton("Click Here");
		button1.setBounds(50, 100, 95, 30);
		
		JButton button2 = new JButton("Close");
		button2.setBounds(50, 150, 95, 30);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello World");
			}	
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}	
		});
		
		frame.add(button1); frame.add(button2);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
