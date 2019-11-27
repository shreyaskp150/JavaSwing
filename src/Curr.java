import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Curr extends Frame implements ItemListener, ActionListener
{
    JComboBox convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton compute, exit;
    JLabel from, to;
    JLabel lblFrom, lblTo;
    JPanel mainPanel = new JPanel();

    double input = 0;
    double result = 0;

    public Curr() {
        super("Money Currency Converter");
        setSize(420,300);
        setLayout(null);
        setBackground(Color.lightGray);

        lblFrom = new JLabel("From:");
        lblFrom.setBounds(30,45,250,30);
        lblFrom.setForeground(Color.RED);
        add(lblFrom);

        convertFrom = new JComboBox<String>();
        convertFrom.setBounds(30,70,150,30);
        convertFrom.addItem("US Dollar");
        convertFrom.addItem("Indian Rupee");
        convertFrom.addItem("Philippine Peso");
        convertFrom.addItem("Japan Yen");
        convertFrom.addItem("Thai Baht");
        convertFrom.addItem("Taiwan Dollar");
        add(convertFrom);

        lblTo = new JLabel("To:");
        lblTo.setBounds(230,45,250,30);
        lblTo.setForeground(Color.RED);
        add(lblTo);

        convertTo = new JComboBox();
        convertTo.setBounds(230,70,150,30);
        convertTo.addItem("US Dollar");
        convertTo.addItem("Indian Rupee");
        convertTo.addItem("Philippine Peso");
        convertTo.addItem("Japan Yen");
        convertTo.addItem("Thai Baht");
        convertTo.addItem("Taiwan Dollar");
        add(convertTo);

        from = new JLabel("Enter Amount to Convert:");
        from.setBounds(50,110,300,30);
        add(from);

        txtFrom = new JTextField(15);
        txtFrom.setBounds(50,140,300,30);
        add(txtFrom);

        compute = new JButton("Compute");
        compute.setBounds(100,250,100,30);
        add(compute);

        to = new JLabel("Total Amount Converted:");
        to.setBounds(50,170,300,30);
        add(to);  

        txtTo = new JTextField(15);
        txtTo.setBounds(50,200,300,30);
        txtTo.setEditable(false);
        txtTo.setForeground(Color.RED);
        add(txtTo);

        exit = new JButton("Exit");
        exit.setBounds(210,250,100,30);
        add(exit);
       
        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        compute.addActionListener(this);
        txtFrom.addActionListener(this);
        exit.addActionListener(this);
       
        addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    exit();
                }
            });
    }
    public void exit(){
        setVisible(false);
        dispose();
        System.exit(0);
    }
  
    public static void main(String args[]) {
        Curr w = new Curr();
        w.setVisible(true);
    }

    public void ConvertDollar() {
        if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input);
            txtTo.setText("$ "+result);
        }
        else if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input * 71.78);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Philippine Peso")
        {
            result = (input * 43.8);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 76.7);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Thai Baht")
        {
            result = (input * 31.8);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 29.7);
            txtTo.setText("NT$ "+result);
        }
    }

    public void ConvertPeso() {
        if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 0.0228);
            txtTo.setText("$ "+result);
        }
        else if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input*1.41);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Philippine Peso")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 1.75);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Thai Baht")
        {
            result = (input * 0.722);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.681);
            txtTo.setText("NT$ "+result);
        }
    }

    public void ConvertYen() {
        if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 0.013);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input * 0.66);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Philippine Peso")
        {
            result = (input * 0.571);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Thai Baht")
        {
            result = (input * 0.414);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.388);
            txtTo.setText("NT$ "+result);
        }
    }

    public void ConvertBaht() {
        if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 0.0315);
            txtTo.setText("$ "+result);
        }
        else if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input * 2.38);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Philippine Peso")
        {
            result = (input * 1.38);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 2.42);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Thai Baht")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.942);
            txtTo.setText("NT$ "+result);
        }
    }

    public void ConvertTaiDollar() {
        if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 0.0336);
            txtTo.setText("$"+result);
        }
        else if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input * 2.35);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Philippine Peso")
        {
            result = (input * 1.47);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 2.28);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Thai Baht")
        {
            result = (input * 1.06);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input);
            txtTo.setText("NT$ "+result);
        }
    }

    public void ConvertRupee() {
        if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 0.014);
            txtTo.setText("$ "+result);
        }
        else if(convertTo.getSelectedItem()=="Philippine Peso")
        {
            result = (input * 0.71);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 1.51);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Thai Baht")
        {
            result = (input * 0.42);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Taiwan Dollar")
        {
            result = (input * 0.43);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input);
            txtTo.setText("NT$ "+result);
        }
    }
    
    public void actionPerformed(ActionEvent e) {

        input = Double.parseDouble(txtFrom.getText());

        if(e.getSource()==compute)
        {
            if(convertFrom.getSelectedItem()=="US Dollar")
            {
                ConvertDollar();                
            }
            else if(convertFrom.getSelectedItem()=="Indian Rupee")
            {
                ConvertRupee();
            }
            else if(convertFrom.getSelectedItem()=="Philippine Peso")
            {
                ConvertPeso();
            }
            else if(convertFrom.getSelectedItem()=="Japan Yen")
            {
                ConvertYen();
            }
            else if(convertFrom.getSelectedItem()=="Thai Baht")
            {
                ConvertBaht();
            }
            else
            {
                ConvertTaiDollar();
            }

        }
      
        else
        {
            int choice = JOptionPane.showConfirmDialog(null,"Do you really want to quit?","Exit",JOptionPane.YES_NO_OPTION);
            if(choice==0) {
                dispose();
                System.exit(0);
            }
        }
    }

    public void itemStateChanged(ItemEvent e)
    {

    }
}