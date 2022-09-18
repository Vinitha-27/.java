Java program to check whether a Number can be Expressed as Sum of Two prime Numbers

import java.io.*;
public class Sum of PrimeNumbers {
  public static void main(String args[])
  {
    int number = 20;
    boolean flag = false;
    for(int i =1; i<=number/2;++)
    {
      if (checkPrime(i)) {
        if(checkPrime(number -i))
        {
          System.out.print("%d = %d + %d\n , number, i ,number - i);
          flag = true;
      } 
      } 
      }
       if (flag)
          System.out.println("number + " cannot be expressed as the sum of two prime numbers");
       }     
             static boolean checkPrime(int num) {
               boolean isPrime = true;
              for (int i =1; i<=num /2; ++i) {
                if (num % i == 0) {
                  isPrime = false;
                  break;
                }
              }
               return isPrime;
             }
           }
