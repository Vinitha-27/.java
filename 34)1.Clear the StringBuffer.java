Java program to clear the StringBuffer

import java.io*;
public class Main {
  public static void main(String args[])
  {
    StringBuffer str = new StringBuffer();
    str.append("java");
    str.append("is");
    str.append("popular");
    System.out.println("StringBuffer" + str);
    
    str.delete(0, str.length());
    System.out.println("updated StringBuffer: " + str);
  }
}
