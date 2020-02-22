//Constructor Chaining
class parent{
  public parent(){
    System.out.println("Constructor of parent is invoked");
  }
}
class child extends parent{
  public child(){
    this(5);//Calling constructor of same class
    System.out.println("Constructor 1 of child is invoked");
  }
  public child(int x){//Constructor Overloading occurs
    System.out.println("Constructor 2 of child is invoked");
  }
}
public class ConstructorChaining{
  public static void main(String[] args) {
    child c1=new child();
  }
}
/*By default compiler calls parent class constructor.
Constructor call must be on the first line of constructor block.
Both super and this can't exist simaltaneously in constructor block*/
