//Writing file using BufferedWriter
import java.io.*;
class WritingFileUingBufferedWriter{
  public static void main(String[] args) throws IOException {
    BufferedWriter bw=new BufferedWriter(new FileWriter("./File1.txt"));
    bw.write("My name is Retr0 and I am not a Hacker.");
    bw.close();
  }
}
