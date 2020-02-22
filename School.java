package School;
public class School{
  public static void main(String []args){
    Students s1= new Students();
    s1.setAge(22);
    s1.setName("Abhinav");
    s1.setRollno(3);
    System.out.println("Name:"+s1.getName());
    System.out.println("Age:"+s1.getAge());
    System.out.println("RollNo:"+s1.getRollno());
  }
}
