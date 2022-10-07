Java program to convert string variables to double.
  
import java.io*;
public class Main {
  public static void main(String args[])
  {
    String str1 = "14";
    String str2 = "60";
    
    double num1 = Double.parseDouble(str1);
    double num2 = Double.parseDouble(str2);
    
    System.out.println(num1);
    System.out.println(num2);
  }
}
