Java program to Convert Binary Number to Decimal Num ber and vice-versa.

import java.io.*;
public class Main {
  public static vois main(String args[])
  {
    lon num = 1001101011;
    int decimal = convertBinaryToDecimal(num);
    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
  }
  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    while (num !=0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber +=remainder * Math.pow(2, i);
      ++i;
    }
    return decimalNumber;
  }
}
