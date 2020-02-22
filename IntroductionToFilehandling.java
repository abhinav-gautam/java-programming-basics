//Introduction to file handling
import java.io.*;//Object of File class contains the metadata of the file
public class IntroductionToFilehandling{
  public static void main(String[] args) throws IOException {
    File f1=new File("F:/My_Projects/Java/File1.txt");
    f1.createNewFile();
    System.out.println("Can Read:"+f1.canWrite());
    System.out.println("Do exists:"+f1.exists());
    System.out.println("Length:"+f1.length());
    System.out.println("Name:"+f1.getName());
    f1.delete();
}
}
/*createNewFile() is used to create new file*/
