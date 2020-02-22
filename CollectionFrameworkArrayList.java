//Collection Framework:Array List
import java.util.*;
public class CollectionFrameworkArrayList{
  public static void main(String[] args) {
    ArrayList l1=new ArrayList();
    l1.add("Abhinav");
    l1.add("Gautam");//it is method of collection interface
    l1.add(1,"Kumar");//add(index,object) it is method of list interface
    Iterator it=l1.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
/*ArrayList is a class which implements List interface, and List interface interface collection interface*/
