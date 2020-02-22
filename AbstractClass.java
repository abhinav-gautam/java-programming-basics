//Abstract Class
abstract class Parent{//Abstract keyword is used for making abstract class
  int x=10;
  String y="Abhinav";
}
class Child extends Parent{
  public void f1(){
  System.out.println("2x="+2*x);
}
}
public class AbstractClass{
  public static void main(String[] args) {
    Parent obj1=new Child();//Reference variable is of parent but object is of child.
    Child obj2=new Child();
    obj2.f1();
    System.out.println("x="+obj1.x);
    System.out.println("Name="+obj1.y);
  }
}
/*Object of abstract class can't be created but its refernce varible can be created*/
