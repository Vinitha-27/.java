Java program to calculate Average Using Arrays.
 
import java.io*;
public class Average {
  public static void main(String args[])
  {
    double[] numArray = {41.2, 52.5, 15.7, 33.0, 45,9};
    double sum = 0.0;
    
   for (double num: numArray) {
     sum += num;
   }
    double average = sum / numArray.length;
    System.out.format("The average is: %2f",format);
  }
}
