import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Tempr {
	public String str1,Str2;
	private JFrame frame;
	private JTextField in;
	private JTextField out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tempr window = new Tempr();
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
	public Tempr() {
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
		
		JRadioButton rd1 = new JRadioButton("CELSIUS");
		rd1.setBounds(61, 102, 109, 23);
		frame.getContentPane().add(rd1);
		
		JRadioButton rd2 = new JRadioButton("FAHRENHEAT");
		rd2.setBounds(61, 128, 109, 23);
		frame.getContentPane().add(rd2);
		
		JRadioButton rd3 = new JRadioButton("KELVIN");
		rd3.setBounds(61, 154, 109, 23);
		frame.getContentPane().add(rd3);
		
		JRadioButton rd11 = new JRadioButton("CELSIUS");
		rd11.setSelected(true);
		rd11.setBounds(269, 102, 109, 23);
		frame.getContentPane().add(rd11);
		
		JRadioButton rd22 = new JRadioButton("FAHRENHEAT");
		rd22.setBounds(269, 128, 109, 23);
		frame.getContentPane().add(rd22);
		
		JRadioButton rd33 = new JRadioButton("KELVIN");
		rd33.setBounds(269, 154, 109, 23);
		frame.getContentPane().add(rd33);
		
		JLabel lblNewLabel = new JLabel("INPUT");
		lblNewLabel.setBounds(114, 33, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		in = new JTextField();
		in.setBounds(194, 30, 86, 20);
		frame.getContentPane().add(in);
		in.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("OUTPUT");
		lblNewLabel_1.setBounds(128, 217, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		out = new JTextField();
		out.setEditable(false);
		out.setBounds(194, 214, 174, 20);
		frame.getContentPane().add(out);
		out.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("INPUT UNIT");
		lblNewLabel_2.setBounds(81, 73, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("OUTPUT UNIT");
		lblNewLabel_3.setBounds(305, 73, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		ButtonGroup g1=new ButtonGroup();
		ButtonGroup g2=new ButtonGroup();
		g1.add(rd1);
		g1.add(rd2);
		g1.add(rd3);
		g2.add(rd11);
		g2.add(rd22);
		g2.add(rd33);
		rd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=in.getText();
				if(rd11.isSelected())
				out.setText(Str1);
				else if(rd22.isSelected())
				{
					float v= Float.parseFloat(Str1);
					float f=(float)((1.80*v)+32.00);
					String str=String.valueOf(f);
					out.setText(str);
				}
				else if(rd33.isSelected())
				{
					float v= Float.parseFloat(Str1);
					float c=(float)(v+273.15);
					String str=String.valueOf(c);
					out.setText(str);	
				}
					
			}
		});	
		rd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=in.getText();
				if(rd11.isSelected())
				{
					//T(°C) = (T(°F) - 32) / 1.8
				float f=Float.parseFloat(Str1);
					float v=(float) ((f-32)/1.8);
					String str=String.valueOf(v);
				out.setText(str);
				}
				else if(rd22.isSelected())
					out.setText(Str1);
				else if(rd33.isSelected())
				{
					//T(K) = (T(°F) + 459.67)× 5/9
					float f=Float.parseFloat(Str1);
					float v=(float)((float)((f+459.67)*5)/9);
					String str=String.valueOf(v);
				out.setText(str);
				}
			}
		});	
		rd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=in.getText();
				if(rd11.isSelected())
				{
					//T(°C) = T(K) - 273.15
					float f=Float.parseFloat(Str1);
					float v=(float) ((float)f-273.15);
					String str=String.valueOf(v);
				out.setText(str);
				}
				else if(rd22.isSelected())
				{
					//T(°F) = T(K) × 9/5 - 459.67
					float f=Float.parseFloat(Str1);
					float v=(float) ((float)(f*1.8)-459.67);
					String str=String.valueOf(v);
					out.setText(str);
				}
				else if(rd33.isSelected())
					out.setText(Str1);	
			}
		});	
		rd11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=in.getText();
				if(rd1.isSelected())
				{
					out.setText(Str1);
				}
				else if(rd2.isSelected())
				{
					//T(°C) = (T(°F) - 32) / 1.8
					float f=Float.parseFloat(Str1);
						float v=(float) ((f-32)/1.8);
						String str=String.valueOf(v);
					out.setText(str);
				}
				else if(rd3.isSelected())
				{
					//T(°C) = T(K) - 273.15
					float f=Float.parseFloat(Str1);
					float v=(float) ((float)f-273.15);
					String str=String.valueOf(v);
				out.setText(str);
				}
			}
		});	
		rd22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Str1=in.getText();
				Str1=in.getText();
				if(rd1.isSelected())
				{
					float v= Float.parseFloat(Str1);
					float f=(float)((1.80*v)+32.00);
					String str=String.valueOf(f);
					out.setText(str);
				}
				else if(rd2.isSelected())
					out.setText(Str1);
				else if(rd3.isSelected())
				{
					//T(°F) = T(K) × 9/5 - 459.67
					float f=Float.parseFloat(Str1);
					float v=(float) ((float)(f*1.8)-459.67);
					String str=String.valueOf(v);
					out.setText(str);
				}
			}
		});	
		rd33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=in.getText();
				if(rd1.isSelected())
				{
					float v= Float.parseFloat(Str1);
					float c=(float)(v+273.15);
					String str=String.valueOf(c);
					out.setText(str);
				}
				else if(rd2.isSelected())
				{
					//T(K) = (T(°F) + 459.67)× 5/9
					float f=Float.parseFloat(Str1);
					float v=(float)((float)((f+459.67)*5)/9);
					String str=String.valueOf(v);
				out.setText(str);
				}
				else if(rd3.isSelected())
					out.setText(Str1);	
			}
		});	
				
	}
}