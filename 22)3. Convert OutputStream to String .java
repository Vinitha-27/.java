Java program to conert OutputStream to string
import java.io.*;
public class OutputStreamString {
  public class void main(String args[])
  {
    ByteSArrayOutputStream stream = new BytesSArrayOutputStream();
    String line = "Hello";
    stream.write(line.getBytes());
    String finalSting = new String(stream.toByteArray());
    
    System.out.println(finalSytring);
    
  }
}
