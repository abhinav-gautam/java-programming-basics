//Polymorphism
class A{
  public void f1(int a){
    System.out.println("Class A");
  }
  public void f2(int a){
    System.out.println("Class A");
  }
}
class B extends A{
  public void f1(int a,int b){//Function Overloading
    System.out.println("Class B");
  }
  public void f2(int a){//Function Overriding
    System.out.println("Class B");
  }
}
public class Polymorphism{
  public static void main(String[] args) {
    B obj=new B();
    obj.f1(5);
    obj.f1(5,6);
    obj.f2(3);
  }
}
