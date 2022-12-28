Java program for Diamond Shape Pattern

import java.util.Scanner;
public class DiamondPattern 
{
  int row,i,j,space=1;
  System.out.print("Enter the no of rows);
  Scanner sc=new Scanner(System.in);
  row=sc.nextInt();
  space=row-1;
  for(j=1;j<=row;j++)
  {
  for(i=1;i<=space;i++)
  {
    System.out.print(" ");
  }
    space--;
    for(i=1;i<=2*j-1;i++)
    {
      System.out.print("*");
    }
    System.out.println("");
  }
