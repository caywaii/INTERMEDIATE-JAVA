import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tryniBren {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tryniBren window = new tryniBren();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tryniBren() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(113, 41, 86, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton buton = new JButton("New button");
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText() == null) {
					JOptionPane.showMessageDialog(null, "wala");
				}else {
					JOptionPane.showMessageDialog(null, "meron");
				}
			}
		});
		buton.setBounds(62, 160, 89, 23);
		frame.getContentPane().add(buton);
	}
}
