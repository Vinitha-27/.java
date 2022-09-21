Java program to Reverse a Sentence Using Recursion.

import java.io.*;
public clss Reverse {
  public static void main(String args[])
  {
    String sentence = "Go work";
    String reversed = reverse(sentence);
    System.out.println("The reverse sentence is: " + reversed);
  }
  public static string reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;
    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
