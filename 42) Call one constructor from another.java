Java program to call one constructor to another.
  
import java.io.*;
public class Main {
   int sum;
  Mian()
  {
    this(7,3);
  }
  Mian(int arg1, int args2)
  {
    this.sum = arg1 + args2;
  }
  
  void display()
  {
    System.out.println("Sum is  " + sum);
  }
  public static void main(String args[])
  {
    Main obj = new Main();
    obj.display();
  }
}
