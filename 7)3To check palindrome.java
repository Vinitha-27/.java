Java program to check palindrome

import java.util.Scanner;
public class palindrome
{
  public static void main(String args[])
  {
    int x,number,y=0,temp=0;
    Scanner s=new scanner(System.in);
    System.out.print("Enter any number");
    number=sc.nextInt();
    x=number;
    while(number>0)
    {
      x=number%10;
      number=number/10;
      temp=temp*10+x;
    }
    if(temp==y)
    {
      System.out.println("number is palindrome");
    }
    else
    {
      System.out.println("not a palindrome");
    }
  }
}
