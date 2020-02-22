//Multithreading Using Thread Class
class A extends Thread{
  public void run(){
    for(int i=0; i<10; i++){
      System.out.println("Thread 1:"+i);
    }
  }
}
class B extends Thread{
  public void run(){
  for(int i=0; i<10; i++){
    System.out.println("Thread 2:"+i);
  }
}
}
public class MultiThreadingUsingThreadClass{
  public static void main(String[] args) {
    A obj1=new A();
    B obj2=new B();
    obj1.start();
    obj2.start();
  }
}
/*Multithreading using Runnable interface is preferred because here the classes A and B can't be inherited
further as they are inherited once and in runnable method, classes implements runnable method so they can be inhertied further*/
