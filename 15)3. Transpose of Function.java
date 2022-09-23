Java program to find Transpose of a Matrix.
  
import java.io*;
public class MatrixTranspose {
  public static void main(String args[]) {
    int original[][] = {{2,4,5},{1,3,2},{4,5,3}};
    int transpose[][] =new  int[3];
    for(int i=0;i<3;i++) {
      for(int j=0;j<3;j++) {
        transpose[i][j]=original[j][i];
      }
    }
    System.out.println("Print Matrix without transpose");
    for(int i=0;i<3;i++) {
      for(int j=0;j<3;j++) {
        System.out.print(transpose[i][j]+ "");
      }
      System.out.println();
    }
    System.out.println("Print Matrix After transpose");
    for(int i=0;i<3;i++) {
      for(int j=0;j<3;j++) {
        System.out.print(transpose[i][j]+ "");
      }
      System.out.println();
    }
  }
}
