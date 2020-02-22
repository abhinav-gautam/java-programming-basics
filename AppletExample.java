//Applet
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
//<applet code="Example24" width="300" height="220"></applet>
public class AppletExample extends Applet{
  public void paint(Graphics g){
    g.drawString("Developed by Abhinav Kumar Gautam",5,13);
      }
    Label l1,l2,l3;
    TextField t1,t2;
    Button b1;
    public void init(){
      l1=new Label("Enter first number");
      l2=new Label("Enter second number");
      l3=new Label();
      t1=new TextField();
      t2=new TextField();
      b1=new Button("Add");
      setLayout(null);
      l1.setBounds(40,50,100,20);
      l2.setBounds(40,90,100,20);
      t1.setBounds(160,50,100,20);
      t2.setBounds(160,90,100,20);
      b1.setBounds(100,150,80,20);
      l3.setBounds(100,180,80,20);
      add(l1);
      add(t1);
      add(l2);
      add(t2);
      add(b1);
      add(l3);
      b1.addActionListener(new Handler());
    }
    public class Handler implements ActionListener{
      public void actionPerformed(ActionEvent e){
        int a,b,s;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        s=a+b;
        l3.setText("Sum is:"+s);
      }
    }
}
