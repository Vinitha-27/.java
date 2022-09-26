Java program to All Whitespaces from a String

import java.io.*;
public class Whitespaces {
  public static void main(String args[]) 
  {
    String sentence = "T his b ett er");
    System.out.println("Original sentence " + sentence);
    sentence = sentence. replaceAll ("\\s", "");
    System.out.printlln("After replacement " + sentence);
  }
}
    
