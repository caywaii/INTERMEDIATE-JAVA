package Lesson_GUI_HardCode;

import javax.swing.*;

public class MySecondSwingExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton button1 = new JButton("Click");
		JButton button2 = new JButton("Submit");
		
		button1.setBounds(130, 100, 100, 40);
		button2.setBounds(130, 140, 100 ,40);
		frame.add(button1);
		frame.add(button2);
		
		frame.setSize(400, 500);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
