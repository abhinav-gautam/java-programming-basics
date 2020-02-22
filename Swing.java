//Swing
import javax.swing.*;
import java.awt.event.*;
public class Swing extends JFrame{
  JLabel l1,l2,l3,l4;
  JTextField t1,t2;
  JButton b1;
  public void setComponents(){
    l1=new JLabel("Addition of two numbers");
    l2=new JLabel("First Number");
    l3=new JLabel("Second Number");
    l4=new JLabel();
    t1=new JTextField();
    t2=new JTextField();
    b1=new JButton("Add");
    setLayout(null);
    l1.setBounds(90,50,200,20);
    l2.setBounds(70,80,90,20);
    l3.setBounds(70,110,100,20);
    t1.setBounds(190,80,50,20);
    t2.setBounds(190,110,50,20);
    b1.setBounds(120,140,80,20);
    l4.setBounds(90,170,80,20);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b1);
    add(l3);
    add(l4);
    b1.addActionListener(new Handler());
  }
  public class Handler implements ActionListener{
  public void actionPerformed(ActionEvent e){
    int x=Integer.parseInt(t1.getText());
    int y=Integer.parseInt(t2.getText());
    int s=x+y;
    l4.setText("Sum is: "+s);
  }
}
  public static void main(String[] args) {
    Example26 jf=new Example26();
    jf.setComponents();
    jf.setTitle("Addition Of Two Numbers");
    jf.setSize(350,350);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
