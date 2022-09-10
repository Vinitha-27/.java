3)2. Java program to check leap year

import java .util.Scanner;
public class Leap_Year
{
  public static void main(String args[])
  int year=2000;
  boolean leap= false;
  if(year % 4==0)
  {
    if (year % 400 == 0)
     leap =true;
    else
     leap =false;
   }
   else
    leap = false;
   if (leap)
     System.out.println(year + " is a leap year");
   else
     System.out.println("year + " is not a leap year");
   }
 }
  
  
