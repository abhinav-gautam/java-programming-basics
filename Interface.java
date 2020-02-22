//Interface
interface I1{
  void f1();
}
interface I2 extends I1{
  void f2();
}
class Parent implements I2{
  public void f1(){
    System.out.println("Function f1 is invoked");
  }
  public void f2(){
    System.out.println("Function f2 is invoked");
  }
}
class Interface{
  public static void main(String[] args) {
    Parent obj=new Parent();
    obj.f1();
    obj.f2();
  }
}
/*Interface just specify method declarations (implicitly public and abstact) and can contaon only
fields (variables)(implictly public static final).
Interface do not have constructor.
Interface can't be instantiated (Objects can't be created) but refernce variable ca be created.
Interface can inherit one or more interfaces.
Class can implements one or more interfaces */
