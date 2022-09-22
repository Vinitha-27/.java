Java program to Find Largest Element of an Array.

import java.io.*;
public class Largest {
  public static void main (String args[])
  {
    double[] numArray = {20.2, 44.3, 66.4, 6.8, -12.6};
    double largest = numArray[1];
    for (double num: numArray) {
      if(largest < num)
        largest = num;
    }
    System.out.format("Largest element =%.2f", largest);
  }
}
