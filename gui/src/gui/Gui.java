package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.DropMode;

@SuppressWarnings("unused")
public class Gui {

	private JFrame frame;
	private JTextField ln;
	private JTextField fn;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 465, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.setBounds(93, 11, 101, 60);
		panel.add(fn);
		fn.setColumns(10);
		
		ln = new JTextField();
		ln.setBounds(93, 89, 101, 60);
		panel.add(ln);
		ln.setColumns(10);
		
		grade = new JTextField();
		grade.setBounds(93, 170, 101, 60);
		grade.setDropMode(DropMode.INSERT);
		panel.add(grade);
		grade.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(270, 89, 132, 60);
		panel.add(btnNewButton);
		
		JLabel fnlb = DefaultComponentFactory.getInstance().createTitle("First Name");
		fnlb.setEnabled(false);
		fnlb.setBounds(29, 34, 58, 14);
		panel.add(fnlb);
		
		JLabel lnlb = DefaultComponentFactory.getInstance().createTitle("Last Name");
		lnlb.setEnabled(false);
		lnlb.setBounds(29, 112, 58, 14);
		panel.add(lnlb);
		
		JLabel grdlb = DefaultComponentFactory.getInstance().createTitle("Grade");
		grdlb.setEnabled(false);
		grdlb.setBounds(48, 193, 35, 14);
		panel.add(grdlb);
	}
}
