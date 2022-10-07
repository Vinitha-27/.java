Java program to implement Bubble Sort algorithm.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner input = new Scanner(System.in);
  void bubbleSort(int array[]) 
  {
    int size = array.length;
    
    System.out.println("choose Sorting order");
    System.out.println("1 for Ascending  \n2 for Descending");
    int sortOrder = input.nextInt();
    
    for (int i = 0 ; i < size-1; i++)
      
      for (int j = 0; j < size-i;j++)
        if (array[j] > array[j + 1])
        {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }
  else {
    if (array[j] < array[j + 1]
        {
          int temp = array[j + 1])
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
        }
    public static void main(String args[])
        {
          int[] data = { 2, 5, 11, -10};
          Main bs = new Main();
          
          bs.bubbleSort(data);
          System.out.println("Sorted Array in Ascending order");
          
        System.out.println(Array.toString(data));
        }
        }
