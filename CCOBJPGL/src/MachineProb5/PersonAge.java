package MachineProb5;
import javax.swing.*;
import java.awt.event.*;
public class PersonAge {

	JFrame mainFrame;
	JLabel inputNum1, answer;
	JTextField num1Field;
	JButton generateResult;
	
	PersonAge(){
		mainFrame = new JFrame("Person Age");
		
		inputNum1 = new JLabel("Enter Your Birth Year");
		inputNum1.setBounds(20, 50, 150, 20);
		
		num1Field = new JTextField();
		num1Field.setBounds(150, 50, 150, 20);
		
		answer = new JLabel("Enter Your Birth Year");
		answer.setBounds(20, 150, 500, 20);
		
		generateResult = new JButton("Click");
		generateResult.setBounds(150, 100, 150, 20);
		
		mainFrame.add(inputNum1); mainFrame.add(num1Field); mainFrame.add(generateResult); mainFrame.add(answer);
		mainFrame.setSize(400,250);
		mainFrame.setLayout(null);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		generateResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dataInput1 = Integer.parseInt(num1Field.getText());
				int result = 2022 - dataInput1;
				JOptionPane.showMessageDialog(null, 
						"Current year is 2022, you were born on the year " + dataInput1 + "\n\n" +
								" You are approximately "  + result + " years old this year."
					);
				
				
			}
			
		});
	}
	
	public static void main(String[] args) {
		new PersonAge();
	}
}
