//Generic Class
class Data <E> {//<E> is a type parameter for generic Class
  E x;
  public void add(E a){
    x=a;
  }
  public E get(){
    return(x);
  }
}
public class GenericClass{
  public static void main(String[] args) {
    Data<Integer> obj1=new Data<Integer>();
    Data<String> obj2=new Data<String>();
    obj1.add(5);
    obj2.add("Abhinav");
    System.out.println("obj1:"+obj1.get()+" obj2:"+obj2.get());
  }
}
/*There can be one or more type parameter section*/
