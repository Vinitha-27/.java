Java Program to Multiply Two Matrix Using Multi-dimensional Arrays.
  
import java.io.*;
public class AddMatrices {
  int rows = 2 , columns = 3;
  int[][] firstMatrix = { {5,6,7}, {8,3,4} };
  int[][] secondMatrix = { {2, 6, 7}, {1,9,6} };
  int[][] sum = new int[rows][columns];
  for(int i= 0;i < rows; i++) {
    for (int j=0; j< columns; j++) {
      sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
    }
  }
  System.out.println("Sum of two matrices is ");
  for(int[] row : sum) {
    for (int column : row) {
      System.out.println(column + " ");
    }
    System.out.println();
  }
