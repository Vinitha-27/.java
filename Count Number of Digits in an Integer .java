5)3.Java program to count number of digits in an integer

import java.io.*;
Public class main {
  public static void main(String args[])
  {
    int count=0,num=12345;
    while (num != 0) {
      num /=10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
  }
}
