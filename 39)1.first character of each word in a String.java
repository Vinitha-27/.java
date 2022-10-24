Java program to Capitalgize the first character of each word in a String

import java.io.*;
public class Main {
 public static void main(String args[])
 {
   String name = " program";
   String firstLetter = name.substring(0, 1);
   String remainingLetters = name.substring(1, n);
   
   firstLetter = firstLetter.toUppercase();
   name = firstLetter + remainingLetter;
   System.out.println("Name " + name);
  }
 }
