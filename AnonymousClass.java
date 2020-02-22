//Anonymous Class
class Parent{
  public void fun(){}
}
class Parent2{
  Parent obj=new Parent(){//Anonymous Class, it is child class of Parent class
    public void fun(){
    System.out.println("We are Anonymous");
  }
  };
}
public class AnonymousClass{
  public static void main(String[] args) {
    Parent2 o=new Parent2();
    o.obj.fun();
  }
}
