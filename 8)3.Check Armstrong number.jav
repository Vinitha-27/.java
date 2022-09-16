Java program to check armstrong number

import java.io.*;
public class Armstrong {
public static void main(String args[])
{
  int number=371, originalNumber %=10, remainder, result=0;
  originalNumber =number;
  while (originalNumber !=0)
  {
    remainder = originalNumber % 10;
    result +=Math.pow(remainder, 3);
    originalNumber /=10;
  }
  if(result == number)
    System.out.println(Enter the number:+" is an armstrong number");
   else
   {
     System.out.println(Enter the number:+" is not an armstrong number");
   }
}
}
