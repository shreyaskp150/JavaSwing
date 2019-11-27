import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Radio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radio window = new Radio();
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
	public Radio() {
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
		
		JRadioButton rdbtnAMale = new JRadioButton("A) Male");
		rdbtnAMale.setBounds(153, 54, 124, 55);
		frame.getContentPane().add(rdbtnAMale);
		
		JRadioButton rdbtnBFemale = new JRadioButton("B) Female");
		rdbtnBFemale.setBounds(153, 121, 105, 21);
		frame.getContentPane().add(rdbtnBFemale);
		
		JButton btnSubmit = new JButton("Submit");
		
		ButtonGroup G=new ButtonGroup();
		G.add(rdbtnAMale);
		G.add(rdbtnBFemale);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAMale.isSelected()){    
					JOptionPane.showMessageDialog(btnSubmit, this,"You are Male.", 0);    
					}    
					if(rdbtnBFemale.isSelected()){    
					JOptionPane.showMessageDialog(btnSubmit, this,"You are Female.", 0);    
					}    
			}
		});
		btnSubmit.setBounds(153, 185, 85, 21);
		frame.getContentPane().add(btnSubmit);
	}
}
