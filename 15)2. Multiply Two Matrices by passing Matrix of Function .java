Java program to Multiply two Matrices by passing Matrix to a Function.
  
import java.io.*;
public class MultiplyMatrices {
  public static void main(String args[]) {
    int r1 = 2, c1 = 3;
    int r2 = 3, c2 = 4;
    int[][] firstMatrix = { {7, -2, 4}, {8, 0, 1} };
    int[][] secondMatrix = { {2, 7}, {6, 4}, {1, 9} };
    int[][] product = MultiplyMatrices (firstMatrix,  secondMatrix,  r1, c1, c2};
             displayproduct(product);
     }
     public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) { 
        int[][] product = new int[r1][c2];
        for(int i =0; i< r1; i++) {
          for(int j=0; j< c2; j++) {
          }
        }
     }
         public static void displayproduct(int[] product)
               System.out.println("product of two matrices is");
                  for(int[] row : product) {
                    fot(int column : row) {
                      System.out.print(column + " ");
                    }
                    System.out.println();
                  }
                }
              }
                                     
