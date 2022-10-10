Java program to Create File and Write to the File

import java.io.File;

class Main {
  public static void main(String args[])
  {
    File file = new File("JavaFile.java");
    
    try {
      boolean value = file.createNewFile();
      if (value)
      {
        System.out.println("New Java File is created");
      }
      else
      {
        System.out.println("The file already exists ");
      }
      catch(Exception e)
      {
        e.getStackTrace();
      }
    }
  }
