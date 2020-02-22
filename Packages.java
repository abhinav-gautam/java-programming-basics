//Packages
package pack1;
import pack2.Student;//importing Student class from pack2
public class Packages{
  public static void main(String [] args){
    Student s1=new Student(); //s1 is object of student class frpm pack1
    s1.set_name("Abhinav");//calling of function
    s1.set_roll_no(3);
    System.out.println("Roll No "+ s1.get_roll_no());
    System.out.println("Name "+ s1.get_name());
  }
}
