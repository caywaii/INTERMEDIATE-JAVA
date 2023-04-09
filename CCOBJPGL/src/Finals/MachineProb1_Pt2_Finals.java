package Finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class MachineProb1_Pt2_Finals {

	private JFrame frmCarylCalculator;
	private JTextField tfAge;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MachineProb1_Pt2_Finals window = new MachineProb1_Pt2_Finals();
					window.frmCarylCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JButton generateResult;
	JLabel lblAge, lblTitle;
	public MachineProb1_Pt2_Finals() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarylCalculator = new JFrame();
		frmCarylCalculator.setTitle("Caryl Calculator");
		frmCarylCalculator.getContentPane().setBackground(new Color(255, 192, 203));
		frmCarylCalculator.getContentPane().setLayout(null);
		
		lblTitle = new JLabel("LET US CALCULATE YOUR AGE");
		lblTitle.setForeground(new Color(219, 112, 147));
		lblTitle.setFont(new Font("Impact", Font.PLAIN, 30));
		lblTitle.setBounds(58, 11, 331, 48);
		frmCarylCalculator.getContentPane().add(lblTitle);
		
		lblAge = new JLabel("ENTER YOUR AGE");
		lblAge.setForeground(new Color(219, 112, 147));
		lblAge.setFont(new Font("Impact", Font.PLAIN, 20));
		lblAge.setBounds(86, 70, 133, 34);
		frmCarylCalculator.getContentPane().add(lblAge);
		
		tfAge = new JTextField();
		tfAge.setBounds(229, 70, 117, 34);
		frmCarylCalculator.getContentPane().add(tfAge);
		tfAge.setColumns(10);
		
		generateResult = new JButton("CLICK!");
		generateResult.setForeground(new Color(255, 255, 255));
		generateResult.setBackground(new Color(221, 160, 221));
		generateResult.setFont(new Font("Impact", Font.PLAIN, 20));
		generateResult.setBounds(163, 129, 117, 27);
		
		generateResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int finalAge = Integer.parseInt(tfAge.getText());
				
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
		frmCarylCalculator.getContentPane().add(generateResult);
		frmCarylCalculator.setBackground(new Color(255, 192, 203));
		frmCarylCalculator.setBounds(100, 100, 450, 240);
		frmCarylCalculator.setLocationRelativeTo(null);
		frmCarylCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
