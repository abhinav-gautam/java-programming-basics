package pack2;
public class Student{
  private int rollno;//variable or member definition
  private String name;
  public void set_roll_no(int r){//set_roll_no is function
    rollno=r;
  }
  public void set_name(String n){//set_name is function
    name=n;
  }
  public int get_roll_no(){//get_roll_no is function
    return (rollno);
  }
  public String get_name(){//get_name is function
    return(name);
  }
}
