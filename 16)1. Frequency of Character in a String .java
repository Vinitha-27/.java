Java program to Find the Frequency of Character in a String.
  
import java.io*;
public class Frequency {
  public static void main(String args[]) 
  {
    String str = "This is nice";
    char ch = 'a';
    int frquency = 0;
    for(int i = 0;i < str.length(); i++)
      if(ch == str.charAt(i)) {
        ++frequency;
      }
  }
  System.out.println("Frequency of " + ch + " = " +frequency);
}
}
