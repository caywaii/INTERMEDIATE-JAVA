package DragAndDrop;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Color;

public class ListsAddDeleteSelectRead {

	private JFrame frmSeatwork;
	private JTextField txtfld;
	private JList list1;
	private JButton btnListTransferOne;
	private JButton btnListToAll;
	private JButton btnReturnToOne;
	private JButton btnReturnToAll;
	private JList list2;
	private JButton btnSelect1;
	private JButton btnClear1;
	private JButton btnSelect2;
	private JButton btnClear2, btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListsAddDeleteSelectRead window = new ListsAddDeleteSelectRead();
					window.frmSeatwork.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListsAddDeleteSelectRead() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSeatwork = new JFrame();
		frmSeatwork.setTitle("Seatwork 2.2");
		frmSeatwork.getContentPane().setBackground(new Color(255, 192, 203));
		frmSeatwork.setBounds(100, 100, 888, 465);
		frmSeatwork.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSeatwork.getContentPane().setLayout(null);
		frmSeatwork.setLocationRelativeTo(null);
		//Text Field
		txtfld = new JTextField();
		txtfld.setBounds(20, 49, 196, 25);
		frmSeatwork.getContentPane().add(txtfld);
		txtfld.setColumns(10);
		
		//List Table
		DefaultListModel<String>model1 = new DefaultListModel<>();
		JList <String> list1 = new JList<>(model1);
		list1.setBounds(228, 49, 185, 240);
		frmSeatwork.getContentPane().add(list1);
		
		DefaultListModel<String>model2 = new DefaultListModel<>();
		JList <String>list2 = new JList<>(model2);
		list2.setBounds(625, 49, 185, 240);
		frmSeatwork.getContentPane().add(list2);
		
		btn1 = new JButton(">");
		btn1.setBackground(new Color(218, 112, 214));
		btn1.setBounds(122, 95, 94, 25);
		frmSeatwork.getContentPane().add(btn1);
		btn1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				model1.addElement(txtfld.getText());
				txtfld.setText(null);
				txtfld.requestFocusInWindow();			}
		});
		
		btnListTransferOne = new JButton(">");
		btnListTransferOne.setBackground(new Color(221, 160, 221));
		btnListTransferOne.setBounds(466, 49, 109, 35);
		frmSeatwork.getContentPane().add(btnListTransferOne);
		btnListTransferOne.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultListModel model2 = (DefaultListModel) list2.getModel();
				for (Object sel : list1.getSelectedValues()) {
				if (model2.indexOf(sel) == -1) {
				model2.addElement(sel);

				int index = list1.getSelectedIndex();
				model1.remove(index);
				}}
			}
		});
		
		btnListToAll = new JButton(">>");
		btnListToAll.setBackground(new Color(221, 160, 221));
		btnListToAll.setBounds(466, 108, 109, 35);
		frmSeatwork.getContentPane().add(btnListToAll);
		btnListToAll.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(list1.getSelectedIndex() == -1) {
					JOptionPane.showMessageDialog(null, "Please Select All"); 
				}else {
					DefaultListModel model2 = (DefaultListModel) list2.getModel();
					for(Object sel: list1.getSelectedValues()) {
						if(model2.indexOf(sel) == -1) {
							model2.addElement(sel);
							model1.removeAllElements();
						}
					}
				}
			}
		});
		
		
		btnReturnToOne = new JButton("<");
		btnReturnToOne.setBackground(new Color(221, 160, 221));
		btnReturnToOne.setBounds(466, 197, 109, 35);
		frmSeatwork.getContentPane().add(btnReturnToOne);
		btnReturnToOne.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultListModel model1 = (DefaultListModel) list1.getModel();
				for (Object sel : list2.getSelectedValues()) {
				if (model1.indexOf(sel) == -1) {
				model1.addElement(sel);

				int index = list2.getSelectedIndex();
				model2.remove(index);
			}
				} 
				}
		});
		btnReturnToAll = new JButton("<<");
		btnReturnToAll.setBackground(new Color(221, 160, 221));
		btnReturnToAll.setBounds(466, 254, 109, 35);
		frmSeatwork.getContentPane().add(btnReturnToAll);
		btnReturnToAll.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(list2.getSelectedIndex() == -1) {
					JOptionPane.showMessageDialog(null, "Please Select All"); 
				}else {
					DefaultListModel model1 = (DefaultListModel) list1.getModel();
					for(Object sel: list2.getSelectedValues()) {
						if(model1.indexOf(sel) == -1) {
							model1.addElement(sel);
							model2.removeAllElements();
						}
					}
				}
			}
		});
		btnSelect1 = new JButton("SELECT ALL");
		btnSelect1.setBackground(new Color(255, 250, 205));
		btnSelect1.setBounds(266, 300, 109, 35);
		frmSeatwork.getContentPane().add(btnSelect1);
		btnSelect1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int begin = 0;
				int end = list1.getModel().getSize()-1;
				if(end >=0) {
					list1.setSelectionInterval(begin, end);
				}
			}
		});
		btnClear1 = new JButton("CLEAR");
		btnClear1.setBackground(new Color(255, 160, 122));
		btnClear1.setBounds(266, 346, 109, 35);
		frmSeatwork.getContentPane().add(btnClear1);
		btnClear1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				model1.removeAllElements();
			}
		});
		btnSelect2 = new JButton("SELECT ALL");
		btnSelect2.setBackground(new Color(255, 250, 205));
		btnSelect2.setBounds(670, 300, 109, 35);
		frmSeatwork.getContentPane().add(btnSelect2);
		btnSelect2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int begin = 0;
				int end = list2.getModel().getSize()-1;
				if(end >=0) {
					list2.setSelectionInterval(begin, end);
				}
			}
		});
		btnClear2 = new JButton("CLEAR");
		btnClear2.setBackground(new Color(255, 160, 122));
		btnClear2.setBounds(670, 346, 109, 35);
		frmSeatwork.getContentPane().add(btnClear2);
		btnClear2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				model2.removeAllElements();
			}
		});
	}
}
