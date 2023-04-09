package Lesson_GUI_HardCode;

import javax.swing.*;

public class PasswordFieldExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("PasswordFieldExample");
		JPasswordField value = new JPasswordField();
		JLabel label1 = new JLabel("Password: ");
		label1.setBounds(20, 100, 80, 30);
		value.setBounds(100, 100, 100, 30);
		
		frame.add(label1); frame.add(value);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
