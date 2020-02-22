//Strings
public class Strings{
  public static void main(String[] args) {
    String s1="Computer";//String is a predefined class not data type
    String s2="Computer";
    String s4="computer";
    String s3=new String("Computer");
    System.out.println(s1==s2);//Comparing the reference variable
    System.out.println(s1.equals(s2));//Comparing the values
    System.out.println(s1==s3);
    System.out.println(s1.equals(s3));
    //Case Conversion
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
    System.out.println(s1.indexOf("m"));//Left to right Searching
    System.out.println(s1.indexOf('m',3));
    System.out.println(s1.indexOf("ute"));
    System.out.println(s1.indexOf("ute",5));;
    System.out.println(s1.lastIndexOf("m"));//Right to left Searching
    System.out.println(s1.lastIndexOf('m',3));
    System.out.println(s1.lastIndexOf("ute"));
    System.out.println(s1.lastIndexOf("ute",5));;
    System.out.println(s1.equals(s4));
    System.out.println(s1.equalsIgnoreCase(s4));
    System.out.println(s1.substring(2,5));
    int i= s1.compareTo(s4);
    if(i==0){
    System.out.println("Strings are same");}
    else if (i>0){
    System.out.println("Opposite to dictionary order");}
    else{
    System.out.println("Dictionary Order");}

  }
}
/*Strings are immutable.
String is not data type it is a class of java.lang.String therefore object of the class needs to be created.
If the values of two objects are exactly same then new object is not created, the two refernce variables
point towards the same object.
Traditional way of creating objects is used to create object with same value.*/
