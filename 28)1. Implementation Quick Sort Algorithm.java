Java program to Implementation Quick Sort Algorithm.

import java.util.Arrays;
public class Quicksort {
  static int partition(int array[], int low, int high)
  {
    int pivot = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++)
    {
      if (array[j] <= pivot)
      {
        i++;
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
