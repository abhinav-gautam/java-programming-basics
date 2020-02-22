//Instance Initialization Block & Static Initialization Block
public class InstanceInitializationBlockStaticInitializationBlock{
  private int x;//Instance Member Variable
  private static int k;//Static Member Variable
  {//Instance Initialization Block
    System.out.println("Instance Initialization Block x="+x);
    x=5;
  }
  static{//Static Initialization Block
    System.out.println("Static Initialization Block k="+k);
    k=10;
  }
  public InstanceInitializationBlockStaticInitializationBlock(){
    System.out.println("Constructor x="+x);
  }
  public static void main(String [] args){
    System.out.println("k="+k);
    Example1 e1= new Example1();
    System.out.println("x of e1="+e1.x);
    Example1 e2= new Example1();
    System.out.println("x of e2="+e2.x);
  }
}
