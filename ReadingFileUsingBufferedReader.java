//Reading file using BufferedReader
import java.io.*;
class ReadingFileUsingBufferedReader{
  public static void main(String[] args) throws IOException {
    int i;
    BufferedReader br=new BufferedReader(new FileReader("./File1.txt"));
    while((i=br.read())!=-1 ) {
      System.out.print((char)i);
  }
  br.close();
  System.out.println("\nConcepts.txt");
  BufferedReader br1=new BufferedReader(new FileReader("./Concepts.txt"));
  String s;
  while((s=br1.readLine())!=null){
    System.out.println(s);
  }
    br1.close();
}
}
/*read(char [] cbuf, int off, int len) is overloaded method of read()
cbuf is empty array of type char where data is to be stored
off is offest, index of array from where data is to be stored
len is length of data to be stored in array*/
