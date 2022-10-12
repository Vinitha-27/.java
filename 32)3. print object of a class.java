Java program to print object of a class.
  
import java.io.*;
public class Test {
  public String toString() {
    return "object";
  }
}

public class Main {
  public static void main(String args[])
  {
    Test obj = new Test();
    System.out.println(obj);
  }
}
