//Abstract Method
abstract class Person{
  abstract void f1();//Abstract method ends with semi colon instead of a codeblock.
  int x=20;
}
class Student extends Person{
  void f1(){//Abstract method is defind here
    System.out.println("2x="+2*x);
  }
}
public class AbstractMethod{
  public static void main(String[] args) {
    Student s1=new Student();
    s1.f1();
  }
}
/*The class containing the abstract method must be abstract class*/
