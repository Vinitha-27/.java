Java program to calculate the power of a number

import java.utill.Scanner;
public class PowerOfNumber
{
  public static void main(String args[])
  {
    int base,exponent,expo;
    Scanner sc=new scanner(System.in);
    System.out.print("Enter the base");
    base =sc.nextInt;
    System.out.print("Enter the exponent");
    exponent =sc.nextInt;
    expo=exponent;
    long power=1;
    while(exponent!=0)
    power=power*base;
    --exponent;
  }
  System.out.println(base +"to power "+exp +"is:"+ power);
}
}
    
