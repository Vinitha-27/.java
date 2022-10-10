Java program to Calculate the Execution Time of Methods

import java.io.*;
public class Main {
  public void dispaly()
  {
    System.out.println("Calculating Method execution time");
  }
  
  public static void main(String[] args)
  {
    Main obj = new main();
    
    Long start = System.nanoTime();
    obj.display();
    
    long end = System.nanoTime();
    long execution = end - start;
    
    System.out.println("EXecution time" + execution + " nanoseconds");
  }
}
