Java program to Make simple Calculator Using switch case

import java.util.Scanner;
public class SimpleCalculator {
public static void main(String args[])
{
 char operator;
 Double number1, number2, result;
 Scanner input = new Scanner(System.in);
 System.out.println("choose an operator: +, -, *, or /");
 operator = input.next().charAt(0);
 System.out.println("Enter first number");
 number1 = input.nextDouble();
 System.out.println("Enter second number");
 number2 = input.nextDouble();

switch (operator) 
{
 case '+':
  result = number1 + number;
  System.out.println(number1 + " + " + number2 + " = " + result);
  break;
case '-':
  result = number1 - number;
  System.out.println(number1 + " - " + number2 + " = " + result);
  break;
case '*':
  result = number1 * number;
  System.out.println(number1 + " * " + number2 + " = " + result);
  break;
  
  default:
    System.out.println("Invalid operator!");
    break;
  }
  input.close();
  }
 }
