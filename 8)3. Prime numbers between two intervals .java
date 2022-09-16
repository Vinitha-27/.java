Java program to display prime numbers between two numbers

import java.io*;
public class main {
public static void main(String args[])
{
  int low=100,high=100;
  while(low<high)
  boolean flag=false;
  for(int i=2;i<=low/2;++i) 
  {
    if(low%i==0)
    {
      flag=true;
      break;
    }
   }
   if(!flag && low!=0 && low!=1)
   System.out.print(low+ "");
   ++ low;
  }
 }
  
