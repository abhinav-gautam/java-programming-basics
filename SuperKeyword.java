//super keyword
class A{
  int x;
  public void f1(){
    System.out.println("Class A Function is called.");
  }
}
class B extends A{
  int x;
  public void f1(){
    System.out.println("Class B function is called.");
    super.f1();//super reference variable is of super class type and this refernce variable is of sub class type
  }
  public void f2(){
    int x;
    x=1; this.x=2; super.x=3;
    System.out.println("x(A)="+super.x+"x(B)="+this.x+"x(f2)="+x);
  }
}
class SuperKeyword{
public static void main(String[] args) {
  B obj1=new B();
  obj1.f1();
  obj1.f2();
}
}
