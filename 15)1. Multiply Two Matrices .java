Java Program MultiPly two Mtrix using Multi-dimensional Arrays.

import class MultiplyMatrics {
public static void main(String args[])
{
 int r1 = 3, c1 = 4;
 int r2 = 4, c2 = 3;
 int[][] firstMatrix  = { {4, -2, 6}, {7, 5, 1} };
 int[][] secondMatrix = { {2, 8}, {0, 5}, {0, 4} };
 int[][] product = new int[n1][m1];
 for(int i =0; i< n1;  i++)
   for (int j= 0; j< c2; j++)
    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
    }
   }
  }
  System.out.println("Multiplication of two matrices is ");
  for (int[] row : product) {
   for (int colum : row) {
    System.out.print("column + " ");
   }
   System.out.println();
   }
  }
 }
