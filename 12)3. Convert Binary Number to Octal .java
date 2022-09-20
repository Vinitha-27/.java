Java program to Convert Binary Number to Octal and vice-versa.
  
import java.io.*;
public class Main {
  public static void main(String args[])
  {
    long Binary = 100101;
    int octal = convertBinarytoOctal(binary);
    System.out.println(binary + " in binary = " + octal + " in octal");
  }
  public static int convertBinarytoOctal(long binaryNumber) {
    int octalNumber = 0, decimalNumber = 0, i = 0;
    while (binaryNumber != 0) {
      decimalNumber += (binarynumber % 10) * Math.pow(2, i);
      ++i;
      binaryNumber /= 10;
    }
    i = 1;
    while (decimalNumber ! =0) {
      octalNumber += (decimalNumber % 8) * i;
      decimalNumber /= 8;
      i*= 10;
    }
    return octalNumber;
  }
}
