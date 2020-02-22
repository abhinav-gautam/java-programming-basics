//Writing to File using FileOutputStream
import java.io.*;
public class WritingToFileUsingFileOutputStream{
  public static void main(String[] args) throws IOException {
    FileOutputStream fout=new FileOutputStream("./File1.txt",true);
    String s="Abhinav";
    char[] cS=s.toCharArray();
    for (int i=0; i<s.length();i++){
      fout.write(cS[i]);
    }
    fout.close();
  }
}
