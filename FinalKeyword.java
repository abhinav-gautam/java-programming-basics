//final Keyword
public class FinalKeyword{
  private final int x;//Final instance member variable (It will remain blank if not initialized)
  private static final int y;//Final static member variable (It will remain blank if not initialized)
  static{//Static initialization block or construtor or direct initialization is used to initilize it
    y=5;
  }
{//Instance initialization block or construtor or direct initialization is used to initilize it
    x=6;
  }
  static void fun(){
    final int k=10;//final local variable
    System.out.println(k);
  }
  public static void main(String[] args) {
    Example3 o1=new Example3();
    System.out.println(o1.x);
    System.out.println(y);
    fun();
  }
}
/*final variables either local instance static once initialized can't be altered
final class can't be inherited
final functions can't be overridden*/
