6)1. Java program to find LCM of two numbers

import java.util.Scanner;
Public class LCM{
  public static void main(String atgs[])
  {
    int a,b,max,step,lcm=0;
    Scanner sc=new scanner(System.in);
    System.out.print("Enter the first number");
    a=sc.nextInt();
    System.out.print("Enter the second number");
    b=sc.nextInt();
    if(a>b){
      max=step=a;
    }
    else{
      max=step=b;
    }
    while(a!=0){
      if(max %a==0 && max %b==0){
        lcm=max;
        break;
      }
       max +=step;
    }
    System.out.println(""LCM of given number is: "+lcm);
       }
      }             
        
