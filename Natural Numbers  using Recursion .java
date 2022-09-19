Java program to find the Sum Natural Numbers using Recursion.

import java.util.Scanner;
public class Sum_Numbers
{
  int sum =0, j=0;
  public statci void main(String args[])
  {
    int m;
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the no.of elements ");
    n = s.nextInt();
    int a[]=new int[n];
    System.out.print("Enter all the elements");
    for(int i =0; i<n;i++)
    {
      a[i] = s.nextInt();
    }
    Sum_Numbers obj = new Sum_Numbers();
    int k = obj.add(a, a.length, 0);
    System.out.println("Sum "+k);
  }
  int add(int a[], int m, int i)
  {
    if(i < m)
    {
      return a[i] + add(a, n, ++i);
    }
    else
    {
      return 0;
    }
  }
}
      
    
  
