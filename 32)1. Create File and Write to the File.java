Java program to create File and Write to the File.

import java.io.File;

public class Main {
 public static void main(String args[])
 {
   File file = new File("JavaFile.java");
   try {
    boolean value = file.createNewFile();
    if (value)
    {
        System.out.println("New Java File is created");
     }
     else {
      System.out.println("the file already exists");
    }
   }
   catch(Exception e)
   {
     e.getStackTrace();
   }
  }
  }
