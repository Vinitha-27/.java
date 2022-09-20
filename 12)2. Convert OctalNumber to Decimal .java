Java program to Convert Octal Number to Decimal and vice-versa.
  
import java.io.*;
public class OctalToDecimal {
  public static int getDecimal(int octal)
  {
    int decimal=0;
    int n = 0;
    while(true){
      if(octal==0){
        break;
      }
      else
      {
        int temp = octal%10;
        decimal+ =temp*Math.pow(8,n);
        octal =octal/10;
        n++;
      }
    }
    return deciaml;
  }
  public static void main(String args[])
  {
  System.out.println("Decimal of 121 octal is: "+getDeciaml(121));
  System.out.println("Decimal of 13 octal is: "+getDeciaml(13));
  System.out.println("Decimal of 10 octal is: "+getDeciaml(10));
  }
}
