//Constructor in inheritance
class parent{
  public parent(int x){//Constructor takes an argument which can't be invoked by compiler
    System.out.println("Constructor of parent is invoked");
  }
}
class child extends parent{
  public child(){
    super(5);//Explicitly invoking parent constructor
    System.out.println("Constructor of child is invoked");
  }
}
class ConstructorIninheritance{
  public static void main(String[] args) {
    child c1=new child();
  }
}
/*If we create an object of child then constructor of parent is invoked first then of child, if object of parent
 is created then only constructor of parent is invoked.Compiler can't invoke a parameterised constructor, it only
 calls default constructor*/
