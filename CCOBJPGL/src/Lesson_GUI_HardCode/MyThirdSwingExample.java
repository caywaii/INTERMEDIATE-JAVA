package Lesson_GUI_HardCode;

import javax.swing.*;

public class MyThirdSwingExample {
		JFrame frame;
		MyThirdSwingExample(){
		frame = new JFrame();		
		
		JButton button = new JButton("Click");
		button.setBounds(130, 100, 100, 40);
		frame.add(button);
		
		frame.setSize(400, 500);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		}
		
		public static void main(String[] args) {
			new MyThirdSwingExample();
		}
	}

