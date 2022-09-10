3)3.Java program to check whether a number is positive or negative

import java.util.Scanner;
Public class CheckPositiveOrNegative{
  Public static void main(String args[])
  {
    int num;
    Scanner reader=new Scanner(System.in);
    num =sc.nextInt();
    if(num>0)
    {
      System.out.println("The number is positive");
    }
    else if(num<0)
    {
      System.out.println("The number is negative");
    }
   else
   {
     System.out.println("The number is zero");
   }
  }
}
    
