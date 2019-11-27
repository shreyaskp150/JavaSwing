import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temp window = new Temp();
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
	public Temp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1063, 710);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInput = new JLabel("Temperature in Kelvin: ");
		lblInput.setBounds(293, 112, 165, 65);
		frame.getContentPane().add(lblInput);
		
		textField = new JTextField();
		textField.setBounds(503, 131, 191, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(356, 290, 322, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnToCelcius = new JButton("To Celcius");
		btnToCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s1=textField.getText();   
		        int a=Integer.parseInt(s1);  
		        int c = 0;  
		        if(e.getSource()==btnToCelcius){  
		            c=(int) (a-273.15); 
		        }
		        String result="Result = "+String.valueOf(c);  
		        lblNewLabel.setText(result);
			}
		});
		btnToCelcius.setBounds(177, 491, 204, 59);
		frame.getContentPane().add(btnToCelcius);
		
		JButton btnToFahrenheit = new JButton("To Fahrenheit");
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s1=textField.getText();   
		        int a=Integer.parseInt(s1);  
		        int c=0;  
		        if(e.getSource()==btnToFahrenheit){  
		            c=(int) ((a*9/5)-459.67); 
		        }
		        String result="Result = "+String.valueOf(c);  
		        lblNewLabel.setText(result);
			}
		});
		btnToFahrenheit.setBounds(574, 491, 204, 59);
		frame.getContentPane().add(btnToFahrenheit);
	}
}