Java program to check if a string contains a substring

import java.io*;
public class Main {
  public static void main(String args[])
  {
    String txt = "this is program";
    String str1 = "programiz";
    String str2 = "programming";
   boolean result = txt.contains(str1);
   if(result)
   {
     System.out.println(str1 + " is present in the string");
   }
    else
    {
      System.out.println(str1 + " is not present in the string");
    }
    result = txt.contains(str2);
    if(result)
    {
      System.out.println(str2 + " is present in the string");
    }
    else
    {
      System.out.println("str2 + " is not present in the string");
     }
   }
  }
