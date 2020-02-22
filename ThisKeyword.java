//this Keyword
class Box{
  private int l,b,h;
  public void setDimension(int l, int b, int h){//Instance member function
    this.l=l; this.b=b; this.h=h;//"this" represents caller object b1
    System.out.println("Original Dimension:"+this.l+" "+this.b+" "+this.h);
  }
  public void incDimension(int x, int y, int z){
    this.l+=x; this.b+=y; this.h+=z;
    System.out.println("Increased Dimension:"+this.l+" "+this.b+" "+this.h);
  }
}
public class ThisKeyword{
  public static void main(String[] args) {
Box b1=new Box();
b1.setDimension(10,15,20);
b1.incDimension(2,3,6);
  }
}
