//Inner Class or Nested Class
class Parent{
  int x=10;
  static int y=100;
  class Child1{
    public void fun1(){
    System.out.println("Fun1 Running:"+x);
  }
  }
  static class Child2{
    public void fun2(){
      System.out.println("Fun2 Running:"+y);
    }
  }
}
public class InnerClassorNestedClass{
  public static void main(String[] args) {
    Parent obj1=new Parent();//Object of parent class
    Parent.Child2 obj2= new Parent.Child2();//Object of non static class Child2
    Parent.Child1 obj3= obj1.new Child1();//Object of static class Child1
    obj3.fun1();
    obj2.fun2();
  }
}
