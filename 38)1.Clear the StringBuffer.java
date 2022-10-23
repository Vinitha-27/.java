Java program to Clear the StringBuffer.

import java.io.*;
public class Mian {
   public static void main 
   {
      StringBuffer str = new StringBuffer();
      str.append("Javava");
      str.append("is");
      str.append("popular");
      System.out.println("Updated StringBuffer " + str);
      
       str.delete(0, str.length());
       System.out.println("Updated StringBuffer " + str);
   }
}
     
