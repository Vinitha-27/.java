Java program to Calculate simple interest and compund interest
 
import java.util.Scanner;

public class Mian {
 public static void main(String args[])
 {
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the principal");
   double principal = input.nextDouble();
   
    System.out.print("Enter the rate");
   double rate = input.nextDouble();
   
    System.out.print("Enter the time");
   double time = input.nextDouble()
   
   double interest = (principal * time * rate) / 100;
   System.out.println("principal" + principal);
   System.out.println("Interest Rate" + rate);
   System.out.println("Time Duration " + time);
   System.out.println("Simple Interest " + interest);
   
   input.close();
  }
 }
