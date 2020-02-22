package main;
import main.Main;
public class Sum{
public static void main(String[] args) {
  int a=Main.y+2;//Using protected member of class Main
  Main o1=new Main();//Making object of class Main
  Main.Addition o2= o1.new Addition(); //Making object of inner class Addition
  System.out.println("Sum is "+ o2.Sum(a,3));
}
}
