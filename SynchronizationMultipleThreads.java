//Synchronisation of multiple threads
import java.util.*;
class Account{
  private int balance;
  public Account(int balance){
    this.balance=balance;
  }
  public boolean isSufficientBalance(int w){
    if (balance>w)
    return (true);
    else
    return(false);
  }
  public void withdraw(int amt){
    balance-=amt;
    System.out.println("Withdrawl amount is:"+amt);
    System.out.println("Current Balance is:"+balance);
  }
}
class Customer implements Runnable{
  private Account acc;
  private String name;
  public Customer (Account acc,String n){
    this.acc=acc;
    name=n;
  }
  public void run(){
    Scanner kb=new Scanner(System.in);
    synchronized(acc){//synchronized keyword with shared object as argument is used for Synchronisation
    System.out.println(name+",Enter withdrawl amount:");
    int amt = kb.nextInt();
    if (acc.isSufficientBalance(amt)){
      System.out.println(name+"'s Transaction");
      System.out.println("Withdrawl Ammount:"+amt);
      acc.withdraw(amt);
      System.out.println(name+",Withdrawl Succesful.");
    }
    else{
      System.out.println("Insufficient Balance.");
    }
  }
  }
}
public class SynchronizationMultipleThreads{
  public static void main(String[] args) {
    Account a1=new Account(1000);
    Customer c1=new Customer(a1,"Abhinav"), c2=new Customer(a1,"Ansh");
    Thread t1=new Thread(c1), t2=new Thread(c2);
    t1.start(); t2.start();
  }
}
