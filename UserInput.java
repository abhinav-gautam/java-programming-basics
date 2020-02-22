//User Input
import java.util.*;//java.util.Scanner is imported
public class UserInput{
  public static void main(String[] args) {
    System.out.println("Enter Name and Age:");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    int age=sc.nextInt();
    System.out.println("Name is "+name+" Age is "+age);
  }
}
