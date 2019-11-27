import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TxtF {

	private JFrame frame;
	private JTextField textField;
	private JButton btnSubmit;
	private JLabel label;
	//static JLabel l;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TxtF window = new TxtF();
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
	public TxtF() {
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
		
		textField = new JTextField();
		textField.setBounds(52, 34, 204, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		label = new JLabel("");
		label.setBounds(52, 173, 345, 65);
		frame.getContentPane().add(label);
		
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(textField.getText());
			}
		});
		btnSubmit.setBounds(303, 56, 85, 21);
		frame.getContentPane().add(btnSubmit);
		
	
		
	}
}