package main;
public class Main{ // Outer Class
  public int x=10; // Public Member
  protected static int y=20; //Protected member
  class Addition{ //Default inner class
    int Sum(int a,int b){ //Function
      return (a+b+x);
    }
  }
}
