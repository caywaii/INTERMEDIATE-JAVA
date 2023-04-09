package Lesson_GUI_HardCode;

import javax.swing.*;
import java.awt.event.*;

public class ButtonExample1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("ButtonExample1");
		
		JButton button1 = new JButton("Click Here");
		button1.setBounds(50, 100, 95, 30);
		
		frame.add(button1); 
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
