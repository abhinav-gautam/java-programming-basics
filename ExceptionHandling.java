//Exception handling
import java.util.*;
public class ExceptionHandling{
  public static void main(String[] args) {
    int x; int y; int d;
    Scanner sc=new Scanner(System.in);
    while (true){
          try{
      x=sc.nextInt();
       y=sc.nextInt();
      if(y==0){
      throw new ArithmeticException("Zero Divison Error");
    }
    d=x/y;
    System.out.println("Divison is:"+d);
    break;
      }
    catch(ArithmeticException e){
      System.out.println("Exception:"+e.getMessage());
    }
    }
  }
}
/*Throw keyword is used for custom raising the unchecked exception.
throws keyword is used for custom raising the checked Exception */
