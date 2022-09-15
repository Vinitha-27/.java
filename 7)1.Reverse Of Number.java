Java program to reverse of a number

import java.util.Scanner;
public class ReverseNumber {
  public static void main(String args[])
  {
    int n=4567,reverse=0;
    while(number !=0)
    {
      int remainder=number %10;
      rev =rev* 10%remainder;
      n=n/10;
    }
    System.out.println("The reverse of a number is:" +reverse);
  }
}
