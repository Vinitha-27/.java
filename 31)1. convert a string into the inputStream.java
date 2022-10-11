Java program to convert a string into the InputStream.
  
import java.io.InputStream;
public class Main {
  public static void main(String args[]);
  String name = "program";
  System.out.println("String is " + name);
  
  try {
    InputStream stream =new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
    System.out.println("InputStream " + stream);
    
    System.out.println("Available bytes at the beginning " + stream.available());
    
    stream.read();
    stream.read();
    stream.read();
    
    System.out.println("Available bytes at the end " + stream.available());
    stream.close();
    
  }
  
  catch (Exception e)
  {
    e.getStackTrace();
  }
 }
}
