import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Check {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check window = new Check();
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
	public Check() {
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
		
		JLabel label = new JLabel("");
		label.setBounds(57, 43, 320, 48);
		frame.getContentPane().add(label);
		
		JCheckBox chckbxC = new JCheckBox("C++");
		chckbxC.setBounds(169, 135, 119, 48);
		frame.getContentPane().add(chckbxC);
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(169, 205, 108, 40);
		frame.getContentPane().add(chckbxJava);
		
		chckbxC.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText("C++ Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });
	    chckbxJava.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText("Java Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });
	}
}