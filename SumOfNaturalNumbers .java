4)2 Java program to calculate the sum of natural numbers

import java.utill.Scanner;
Public class SumOfNaturalNumbers{
  Public static void main(String args[])
  {
    int num,i,sum=0;
    Scanner sc=new scanner(System.in);
    System.out.print("sum from");
    i=sc.nextInt();
    System.out.print("sum upto");
    num=sc.nextInt();
    while(i<=num)
    {
      sum=sum+i;
      i++;
    }
    System.out.println("sum of natural numbers="+sum);
  }
}
