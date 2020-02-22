//static members in inheritance
class Parent{
  static int x=2;//Static variable is not inherited
  public static void f1(){//Static method is inherited
    System.out.println("Parent");
  }
  public static void f2(){
    System.out.println("Parent");
  }
}
class Child extends Parent{
  public static void f1(){//Method hidding not overridding
    System.out.println("Child");
  }
  static {
    x=5;
  }
}
class StaticMembersInInheritance{
  public static void main(String[] args) {
    System.out.println("x="+Child.x);//Output is 2 because parent class is called directly
    Child.f1();
    Child.f2();
    Parent.f1();
    System.out.println("x="+Child.x);
  }
}
/*Method hidding is for static methods and overridding is for instance methods*/
