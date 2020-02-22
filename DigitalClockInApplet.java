//Digital Clock in Applet
import java.util.*;
import java.awt.*;
import java.applet.Applet;
//<applet code="Example25" width="200" height ="200"></applet>
public class DigitalClockInApplet extends Applet implements Runnable {
  Thread t,t1;
  public void start(){
  t=new Thread(this);
  t.start();
}
public void run(){
  t1=Thread.currentThread();
  while (t1==t){
    repaint();
    try{
      t1.sleep(1000);
    }
    catch(InterruptedException e){}
  }
}
public void paint(Graphics g){
  Calendar cal=new GregorianCalendar();
  String hour=String.valueOf(cal.get(Calendar.HOUR));
  String minute=String.valueOf(cal.get(Calendar.MINUTE));
  String second=String.valueOf(cal.get(Calendar.SECOND));
  g.drawString("Current Time is:"+hour+":"+minute+":"+second,50,50);
}
}
