Java program to display prime numbers between intervals using function

import java.io.*;
public class prime {
public static void main(String args[])
{
 int low = 20,high =50;
 while(low < high)
 {
  if(checkPrimeNumber (low)
   System.out.println(low + "");
   ++low;
 }
}
public static boolean check prime (int number) {
 boolean flag =true;
 for(int i=2;i<=num/2)
 if(num % i==0)
 {
  flag = false;
  break;
 }
}
}
return flag;
