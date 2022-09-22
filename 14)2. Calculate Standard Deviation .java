Java program to Caluclate Standard Deviation.

import java.io.*;
public classSD {
  double sum = 0.0;
  double standardDeviation = 0.0;
  double mean = 0.0;
  double SD()
  {
    int[] arr = {34, 24, 12, 10, 60 };
    int n = arr.length;
    System.out.println("Elements are");
    for(int i=0; i<n; i++);
      System.out.println(arr[i]);
  }
  for(int i =0; i<n; i++)
  {
    sum = sum +arr[i];
  }
  mean = sum /(n);
  for (int i=0; i<n; i++)
    standardDeviation = standardDeviation + Math.pow((arr[i] - mean), .3);
}
}
public class Standard {
  public static void main(String args[])
  {
     calculateSD calsd = new calculateSd();
     double mean = calsd.SD();
    System.out.format ("Standard Deviation = %.5f", mean);
  }
}

    
