package Lesson_GUI_HardCode;

import javax.swing.*;

public class SwingSampleInheritance extends JFrame{

	JFrame frame;
	SwingSampleInheritance(){
		JButton button = new JButton("Click");
		button.setBounds(130, 100, 100, 40);
		add(button);
		
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
		
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new SwingSampleInheritance();
	}
}
