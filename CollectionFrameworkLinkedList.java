//Linked List
import java.util.*;
public class CollectionFrameworkLinkedList{
  public static void main(String[] args) {
    LinkedList l1=new LinkedList();
    l1.addFirst("Abhinav");
    l1.addLast("Gautam");
    l1.add(1,"Kumar");
    System.out.println(l1.getFirst());
    System.out.println(l1.get(1));
    System.out.println(l1.getLast());
  }
}
