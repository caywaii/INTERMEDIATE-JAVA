
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class menu extends JFrame{

	JMenuBar menubar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenuItem frmStudentsMenu = new JMenuItem("Students");
	JMenuItem frmCourse = new JMenuItem("Course");
	JMenuItem frmSettings = new JMenuItem("Settings");
	JMenuItem exit = new JMenuItem ("Exit");
	event click = new event();
	
	JMenu trans = new JMenu("Transacation");
	JMenuItem payment = new JMenuItem("Assesment");
	
	
	public menu(){
		super("SANTIAGO INFORMATION SYSTEM");
		setLayout(new FlowLayout());
		setJMenuBar(menubar);
		
	//Color Background
		menubar.setBackground(Color.DARK_GRAY);
		frmStudentsMenu.setBackground(new Color(255, 99, 239));
		exit.setBackground(new Color(255, 99, 239));
		file.setForeground(Color.pink);
		trans.setForeground(Color.pink);
		
   //This area is under menu-bar
		file.setMnemonic('F');
		menubar.add(file);
		
   //Under file bar menu
		frmStudentsMenu.setMnemonic('S');
		file.add(frmStudentsMenu);
		
		frmCourse.setMnemonic('C');
		file.add(frmCourse);
		
		file.add(frmSettings);
		
		exit.setMnemonic('x');
		file.add(exit);
		
//This area is for the Transaction Menu
		trans.setMnemonic('T');
		menubar.add(trans);
		
		payment.setMnemonic('A');
		trans.add(payment);

		frmStudentsMenu.addActionListener(click);
		exit.addActionListener(click);
		
		messageContent();
	
	}

	//Setting a opening message
	void messageContent() {
		JPanel content = new JPanel();
		setContentPane(content);
		content.setLayout(null);
		content.setBackground(new Color(247, 208, 244));
		
		JLabel textMessage = new JLabel();
		textMessage.setText("Information System");
		textMessage.setBounds(180, 120, 700, 70);
		textMessage.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textMessage.setForeground(Color.DARK_GRAY);
		
		JLabel name = new JLabel();
		name.setText("Made by: Caryl Santiago");
		name.setBounds(180, 150, 700, 70);
		name.setFont(new Font("Montserrat", Font.BOLD, 10));
		name.setForeground(Color.DARK_GRAY);
		
		
		content.add(textMessage);
		content.add(name);

	}
	

	
	//To make the functions worked
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JMenuItem source =(JMenuItem)e.getSource();
			if(source==frmStudentsMenu) {
				frmStudents f1 = new frmStudents();
				f1.setSize(600,600);
				f1.setLocationRelativeTo(null);
				f1.setVisible(true);
			}else if(source==exit) {
				String messageBox = "Are you sure you want to close the application?";
				int ans = JOptionPane.showConfirmDialog(null, messageBox, "Exit", JOptionPane.YES_NO_OPTION);
				if(ans==JOptionPane.YES_OPTION) {
					System.exit(0);
			}
		}
	}
	
}
}
