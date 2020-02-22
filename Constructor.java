//Constructor
public class Constructor{
  private int l,b,h;
  public Box(){ //Constructor
    l=10;b=20;h=30;
  }
  public Constructor(int L,int B,int H){ //Constructor Overloading
    l=L;b=B;h=H;
  }
  public void printing(){
    System.out.println("Box "+l+b+h);
  }
  public static void main(String [] args){
    Box b1=new Box();
    Box b2=new Box(20,30,50);
    b1.printing();
    b2.printing();
  }
}
