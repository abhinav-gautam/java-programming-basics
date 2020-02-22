//Array
import java.util.*;
public class Array{
  public static void main(String[] args) {
    int [] arr1=new int[4]; // Types of creating array
    int [] arr2=new int[]{2,5,6,3};
    int [] arr3={1,2,3,4};
    System.out.println("Array 1");
    for (int i=0; i<4; i++){
    System.out.print(arr1[i]);
    }
    System.out.println("\nArray 2");
    for (int i=0; i<4; i++){
      System.out.print(arr2[i]);
    }
    System.out.println("\nArray 3");
    for (int i=0; i<4; i++){
      System.out.print(arr3[i]);
    }
    //User Input Array
    System.out.println("\nEnter length of array: ");
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int [] arr4=new int[len];
    for (int x=0; x<len; x++){
    System.out.println("Enter Value of Position "+x);
    arr4[x]=sc.nextInt();
    }
    for (int i=0; i<len; i++){
      System.out.print(arr4[i]);
    }
    //Two Dimensional Array
    System.out.println("\nEnter x");
    int x=sc.nextInt();
    System.out.println("Enter y");
    int y=sc.nextInt();
    int [][] mat=new int[x][y];
    for (int i=0; i<x; i++){
      for (int j=0; j<y;j++){
        System.out.print("Enter:");
        mat[i][j]=sc.nextInt();
      }
    }
    System.out.println("\nMatrix is:");
    for (int i=0; i<x; i++){
      for (int j=0; j<y;j++){
        System.out.print(mat[i][j]+"  ");
      }
      System.out.println("\n");
    }
  }
}
