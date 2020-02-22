//Multi Threading
//Using Runnable Interface
class A implements Runnable{//Runnable is a interface with only one method called run
  public void run(){//overriding run method of runnable
    int i;
    for (i=0; i<10; i++){
      System.out.println("Thread 1:"+i);
    }
  }
}
class B implements Runnable{
  public void run(){
    int i;
    for (i=0; i<10; i++){
      System.out.println("Thread 2:"+i);
    }
  }
}
public class MultiThreadingUsingRunnableInterface{
  public static void main(String[] args) {
    Thread t1=new Thread(new A());//creating new thread with object of class A but refernce is of runnable interface
    Thread t2=new Thread(new B());
    t1.start();//Start method bleongs to thread class
    t2.start();
  }
}
/*Thread class belongs to java.lang.Thread
t1 and t2 points towards method run of interface implemented in class A and B respectively
t1 and t2 can only access run method*/
