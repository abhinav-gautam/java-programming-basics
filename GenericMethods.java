//Generic Methods
public class GenericMethods{
  public <E> void printArray(E []s){
  for(E x:s){
    System.out.println(x);
  }
}
  public static void main(String[] args) {
    Example29 o=new Example29();
    String [] countries={"India","Pakistan","Bhutan"};
    Integer [] numbers={1,2,5,6};
    o.printArray(countries);
    o.printArray(numbers);
  }
}
