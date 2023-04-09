import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;


public class Calculator implements MouseListener{

	private JFrame frmCarylculator;
	private JTextField txtDisplay;
	
	String display = "";
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00;
	JButton btnDot, btnDel, btnAC, btnOff, btnMultiply, btnDivdie,btnMinus, btnPlus;
	JButton btnDivide,btnEquals;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCarylculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarylculator = new JFrame();
		frmCarylculator.setTitle("CARYLCULATOR");
		frmCarylculator.getContentPane().setBackground(new Color(255, 218, 185));
		frmCarylculator.getContentPane().setForeground(Color.BLACK);
		frmCarylculator.setBounds(100, 100, 400, 580);
		frmCarylculator.setLocationRelativeTo(null);
		frmCarylculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarylculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Impact", Font.PLAIN, 20));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 364, 117);
		frmCarylculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		btnAC = new JButton("AC");
		btnAC.setEnabled(false);
		btnAC.setName("btnAC");
		btnAC.setFont(new Font("Impact", Font.PLAIN, 20));
		btnAC.setBackground(Color.PINK);
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAC.setBounds(10, 139, 89, 68);
		frmCarylculator.getContentPane().add(btnAC);
		
		btnDel = new JButton("DEL");
		btnDel.setEnabled(false);
		btnDel.setName("btnDel");
		btnDel.setFont(new Font("Impact", Font.PLAIN, 20));
		btnDel.setBackground(Color.PINK);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDel.setBounds(109, 139, 89, 68);
		frmCarylculator.getContentPane().add(btnDel);
		
		btnOff = new JButton("OFF");
		btnOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String switchText = btnOff.getText();
				
				if(switchText.equals("OFF")) {
					btn1.setEnabled(true); btn00.setEnabled(true);
					btn2.setEnabled(true); btnDot.setEnabled(true);
					btn3.setEnabled(true); btnDel.setEnabled(true);
					btn4.setEnabled(true); btnAC.setEnabled(true);
					btn5.setEnabled(true); btnMultiply.setEnabled(true);
					btn6.setEnabled(true); btnPlus.setEnabled(true);
					btn7.setEnabled(true); btnMinus.setEnabled(true);
					btn8.setEnabled(true); btnDivide.setEnabled(true);
					btn9.setEnabled(true); btnEquals.setEnabled(true);
					btn0.setEnabled(true);
					
					btnOff.setText("ON");
					btnOff.setBackground(Color.white);
					btnOff.setForeground(Color.BLACK);
				}else {
					btn1.setEnabled(false); btn00.setEnabled(false);
					btn2.setEnabled(false); btnDot.setEnabled(false);
					btn3.setEnabled(false); btnDel.setEnabled(false);
					btn4.setEnabled(false); btnAC.setEnabled(false);
					btn5.setEnabled(false); btnMultiply.setEnabled(false);
					btn6.setEnabled(false); btnPlus.setEnabled(false);
					btn7.setEnabled(false); btnMinus.setEnabled(false);
					btn8.setEnabled(false); btnDivide.setEnabled(false);
					btn9.setEnabled(false); btnEquals.setEnabled(false);
					btn0.setEnabled(false);
					
					btnOff.setText("OFF");
					btnOff.setBackground(Color.PINK);
					btnOff.setForeground(Color.BLACK);
				}
			}
		});
		btnOff.setName("btnOff");
		btnOff.setFont(new Font("Impact", Font.PLAIN, 20));
		btnOff.setBackground(Color.PINK);
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOff.setBounds(208, 139, 89, 68);
		frmCarylculator.getContentPane().add(btnOff);
		
		btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.setName("btn7");
		btn7.setFont(new Font("Impact", Font.PLAIN, 20));
		btn7.setBackground(Color.PINK);
		btn7.setBounds(10, 218, 89, 68);
		btn7.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn7);
		
		 btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.setName("btn8");
		btn8.setFont(new Font("Impact", Font.PLAIN, 20));
		btn8.setBackground(Color.PINK);
		btn8.setBounds(109, 218, 89, 68);
		btn8.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.setName("btn9");
		btn9.setFont(new Font("Impact", Font.PLAIN, 20));
		btn9.setBackground(Color.PINK);
		btn9.setBounds(208, 218, 89, 68);
		btn9.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn9);
		
		btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.setName("btn4");
		btn4.setFont(new Font("Impact", Font.PLAIN, 20));
		btn4.setBackground(Color.PINK);
		btn4.setBounds(10, 297, 89, 68);
		btn4.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.setName("btn5");
		btn5.setFont(new Font("Impact", Font.PLAIN, 20));
		btn5.setBackground(Color.PINK);
		btn5.setBounds(109, 297, 89, 68);
		btn5.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.setName("btn6");
		btn6.setFont(new Font("Impact", Font.PLAIN, 20));
		btn6.setBackground(Color.PINK);
		btn6.setBounds(208, 297, 89, 68);
		btn6.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.setName("btn1");
		btn1.setFont(new Font("Impact", Font.PLAIN, 20));
		btn1.setBackground(Color.PINK);
		btn1.setBounds(10, 376, 89, 68);
		btn1.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.setName("btn2");
		btn2.setFont(new Font("Impact", Font.PLAIN, 20));
		btn2.setBackground(Color.PINK);
		btn2.setBounds(109, 376, 89, 68);
		btn2.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.setName("btn3");
		btn3.setFont(new Font("Impact", Font.PLAIN, 20));
		btn3.setBackground(Color.PINK);
		btn3.setBounds(208, 376, 89, 68);
		btn3.addMouseListener(this);
		frmCarylculator.getContentPane().add(btn3);
		
		btnMultiply = new JButton("X");
		btnMultiply.setEnabled(false);
		btnMultiply.setName("btnMultiply");
		btnMultiply.setFont(new Font("Impact", Font.PLAIN, 20));
		btnMultiply.setBackground(Color.PINK);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiply.setBounds(307, 139, 65, 68);
		frmCarylculator.getContentPane().add(btnMultiply);
		
		btnDivide = new JButton("\u00F7");
		btnDivide.setEnabled(false);
		btnDivide.setName("btnDivide");
		btnDivide.setFont(new Font("Impact", Font.PLAIN, 20));
		btnDivide.setBackground(Color.PINK);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDivide.setBounds(307, 218, 65, 68);
		frmCarylculator.getContentPane().add(btnDivide);
		
		btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.setName("btn0");
		btn0.setFont(new Font("Impact", Font.PLAIN, 20));
		btn0.setBackground(Color.PINK);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(109, 455, 89, 68);
		frmCarylculator.getContentPane().add(btn0);
		
		btnMinus = new JButton("-");
		btnMinus.setEnabled(false);
		btnMinus.setName("btnMinus");
		btnMinus.setFont(new Font("Impact", Font.PLAIN, 20));
		btnMinus.setBackground(Color.PINK);
		btnMinus.setBounds(307, 297, 65, 68);
		frmCarylculator.getContentPane().add(btnMinus);
		
		btnPlus = new JButton("+");
		btnPlus.setEnabled(false);
		btnPlus.setName("btnPlus");
		btnPlus.setFont(new Font("Impact", Font.PLAIN, 20));
		btnPlus.setBackground(Color.PINK);
		btnPlus.setBounds(307, 376, 65, 68);
		frmCarylculator.getContentPane().add(btnPlus);
		
		btn00 = new JButton(".00");
		btn00.setEnabled(false);
		btn00.setName("btn00");
		btn00.setFont(new Font("Impact", Font.PLAIN, 20));
		btn00.setBackground(Color.PINK);
		btn00.setBounds(10, 455, 89, 68);
		frmCarylculator.getContentPane().add(btn00);
		
		btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setName("btnDot");
		btnDot.setFont(new Font("Impact", Font.PLAIN, 20));
		btnDot.setBackground(Color.PINK);
		btnDot.setBounds(208, 455, 89, 68);
		btnDot.addMouseListener(this);
		frmCarylculator.getContentPane().add(btnDot);
		
		btnEquals = new JButton("=");
		btnEquals.setEnabled(false);
		btnEquals.setName("btnEquals");
		btnEquals.setFont(new Font("Impact", Font.PLAIN, 20));
		btnEquals.setBackground(Color.PINK);
		btnEquals.setBounds(307, 455, 67, 68);
		frmCarylculator.getContentPane().add(btnEquals);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		String btn = e.getComponent().getName();
		if(e.getComponent().isEnabled()) {
			
			switch(btn) {
			
			case "btn1": display += "1"; break;
				
			case "btn2": display += "2"; break;
			
			case "btn3": display += "3"; break;
			
			case "btn4": display += "4"; break;
			
			case "btn5": display += "5"; break;
				
			case "btn6": display += "6"; break;
				
			case "btn7": display += "7"; break;
				
			case "btn8": display += "8"; break;
				
			case "btn9": display += "9"; break;
				
			case "btn0": display += "0"; break;
				
			case "btnDot": display += "."; break;
			}
			
			txtDisplay.setText(display);
		}
			
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
