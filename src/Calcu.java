import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calcu {

public String Str1,Str2,Str3;
public int f=0;
private JFrame frame;
private JTextField TF;
private JButton sqrt;
private JButton btnNewButton_1;
private JButton btnNewButton_2;
private JButton bt7;
private JButton bt8;
private JButton bt9;
private JButton div;
private JButton mul;
private JButton sub;
private JButton add;
private JButton eq;
private JButton bt3;
private JButton bt6;
private JButton bt5;
private JButton bt4;
private JButton bt1;
private JButton bt2;
private JButton dot;
private JButton bt0;
private JButton mod;
private JButton btxy;
private JButton btnX;
private JButton btnN;
private JButton btnSec;
private JButton btnLn;
private JButton btnExp;
private JButton btnCos;
private JButton btnTan;
private JLabel lblEdit;
private JLabel lblView;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Calcu window = new Calcu();
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
public Calcu() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(0, 11, 540, 298);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
TF = new JTextField();
TF.setBounds(46, 36, 434, 47);
frame.getContentPane().add(TF);
TF.setColumns(10);
sqrt = new JButton("Sqrt");
sqrt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
double res1=Float.parseFloat(Str1);
double re=Math.sqrt(res1);
String str=String.valueOf(re);
TF.setText(str);
f=1;
}
});
sqrt.setBounds(10, 100, 89, 23);
frame.getContentPane().add(sqrt);

btnNewButton_1 = new JButton("1/X");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
double res1=Float.parseFloat(Str1);
double re=1/res1;
String str=String.valueOf(re);
TF.setText(str);
f=1;
}
});
btnNewButton_1.setBounds(109, 100, 89, 23);
frame.getContentPane().add(btnNewButton_1);

btnNewButton_2 = new JButton("Sin");
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
float re=(float)Math.sin((po*Math.PI)/180);
TF.setText(String.valueOf(re));
f=1;
}
});
btnNewButton_2.setBounds(208, 100, 89, 23);
frame.getContentPane().add(btnNewButton_2);

bt7 = new JButton("7");
bt7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt7.getText()));
}
});
bt7.setBounds(310, 100, 42, 23);
frame.getContentPane().add(bt7);

bt8 = new JButton("8");
bt8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt8.getText()));
}
});
bt8.setBounds(362, 100, 42, 23);
frame.getContentPane().add(bt8);

bt9 = new JButton("9");
bt9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt9.getText()));
}
});
bt9.setBounds(415, 100, 42, 23);
frame.getContentPane().add(bt9);

div = new JButton("/");
div.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=div.getText();
}
});
div.setBounds(467, 100, 42, 23);
frame.getContentPane().add(div);

mul = new JButton("*");
mul.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=mul.getText();
}
});
mul.setBounds(467, 138, 42, 23);
frame.getContentPane().add(mul);

sub = new JButton("-");
sub.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=sub.getText();
}
});
sub.setBounds(467, 176, 42, 23);
frame.getContentPane().add(sub);

add = new JButton("+");
add.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=add.getText();
}
});
add.setBounds(467, 210, 42, 23);
frame.getContentPane().add(add);

eq = new JButton("=");
eq.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float res1,res;
float res2=Float.parseFloat(TF.getText());
f=1;
if(Str2.equals("+"))
{
res1=Float.parseFloat(Str1);
res=res1+res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("-"))
{
res1=Float.parseFloat(Str1);
res=res1-res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("*"))
{
res1=Float.parseFloat(Str1);
res=res1*res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("/"))
{
res1=Float.parseFloat(Str1);
res=res1/res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("%"))
{
res1=Float.parseFloat(Str1);
res=res1%res2;
String str=String.valueOf(res);
TF.setText(str);

}
else if(Str2.equals("X^Y"))
{
res1=Integer.parseInt(Str1);
System.out.print(res1);
res2=Integer.parseInt(TF.getText());
float po=1;
for(int i=1;i<=res2;i++)
{
po=po*res1;
}
String str=String.valueOf(po);
TF.setText(str);;
}

Str1=null;
Str2=null;
Str3=null;
}
});
eq.setBounds(415, 210, 42, 23);
frame.getContentPane().add(eq);

bt3 = new JButton("3");
bt3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt3.getText()));
}
});
bt3.setBounds(415, 176, 42, 23);
frame.getContentPane().add(bt3);

bt6 = new JButton("6");
bt6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt6.getText()));
}
});
bt6.setBounds(415, 138, 42, 23);
frame.getContentPane().add(bt6);

bt5 = new JButton("5");
bt5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt5.getText()));
}
});
bt5.setBounds(362, 138, 42, 23);
frame.getContentPane().add(bt5);

bt4 = new JButton("4");
bt4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}

TF.setText(TF.getText().concat(bt4.getText()));
}
});
bt4.setBounds(307, 138, 42, 23);
frame.getContentPane().add(bt4);

bt1 = new JButton("1");
bt1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
if(f==1)
{
TF.setText("");
f=0;
}

TF.setText(TF.getText().concat(bt1.getText()));

}
});
bt1.setBounds(307, 176, 42, 23);
frame.getContentPane().add(bt1);

bt2 = new JButton("2");
bt2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}

TF.setText(TF.getText().concat(bt2.getText()));
}
});
bt2.setBounds(362, 176, 42, 23);
frame.getContentPane().add(bt2);
dot = new JButton(".");
dot.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(dot.getText()));
}
});
dot.setBounds(362, 210, 42, 23);
frame.getContentPane().add(dot);
bt0 = new JButton("0");
bt0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
TF.setText("");
f=0;
}
TF.setText(TF.getText().concat(bt0.getText()));
}
});
bt0.setBounds(307, 210, 42, 23);
frame.getContentPane().add(bt0);

mod = new JButton("%");
mod.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=mod.getText();
}
});
mod.setBounds(10, 138, 89, 23);
frame.getContentPane().add(mod);

btxy = new JButton("X^Y");
btxy.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=TF.getText();
TF.setText("");
Str2=btxy.getText();
f=1;
}
});
btxy.setBounds(10, 176, 89, 23);
frame.getContentPane().add(btxy);

btnX = new JButton("X^2");
btnX.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
int n=Integer.parseInt(TF.getText());
int ff=n*n;
f=1;
String str=String.valueOf(ff);
TF.setText(str);
f=1;
}
});
btnX.setBounds(10, 210, 89, 23);
frame.getContentPane().add(btnX);

btnN = new JButton("n!");
btnN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
int n=Integer.parseInt(TF.getText());
int ff=1;
for(int i=1;i<=n;i++)
{
ff=ff*i;
f=1;
}
String str=String.valueOf(ff);
TF.setText(str);
f=1;

}
});
btnN.setBounds(109, 210, 89, 23);
frame.getContentPane().add(btnN);

btnSec = new JButton("Sec");
btnSec.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
float r=(float)Math.cos((po*Math.PI)/180);
float rr=(float)1/r;
String str=String.valueOf(rr);
TF.setText(str);
}
});
btnSec.setBounds(208, 210, 89, 23);
frame.getContentPane().add(btnSec);

btnLn = new JButton("ln");
btnLn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
double r=Math.log(po);
String str=String.valueOf(r);
TF.setText(str);
f=1;
}
});
btnLn.setBounds(109, 176, 89, 23);
frame.getContentPane().add(btnLn);

btnExp = new JButton("Exp");
btnExp.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double ev = 2.718281828;
double po=1;
int n=Integer.parseInt(TF.getText());
for(int i=1;i<=n;i++)
{
po=po*ev;
}
String str=String.valueOf(po);
TF.setText(str);;
}
});
btnExp.setBounds(109, 138, 89, 23);
frame.getContentPane().add(btnExp);

btnCos = new JButton("Cos");
btnCos.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
float re=(float)Math.sin((po*Math.PI)/180);
TF.setText(String.valueOf(re));
f=1;
}
});
btnCos.setBounds(208, 138, 89, 23);
frame.getContentPane().add(btnCos);

btnTan = new JButton("Tan");
btnTan.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float po=Float.parseFloat(TF.getText());
float re=(float)Math.sin((po*Math.PI)/180);
TF.setText(String.valueOf(re));
f=1;
}
});
btnTan.setBounds(208, 176, 89, 23);
frame.getContentPane().add(btnTan);

JLabel lblFile = new JLabel("File");
lblFile.setBounds(10, 11, 46, 14);
frame.getContentPane().add(lblFile);

lblEdit = new JLabel("Edit");
lblEdit.setBounds(66, 11, 46, 14);
frame.getContentPane().add(lblEdit);

lblView = new JLabel("View");
lblView.setBounds(118, 11, 46, 14);
frame.getContentPane().add(lblView);
}
}