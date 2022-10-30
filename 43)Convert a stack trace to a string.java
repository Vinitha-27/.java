Java program to convert a stack trace to a string

import java.io.PrintWriter;
import java.io.PrintWriter;

public class PrintStackTrace
{
  public static void main(String args[])
  {
    try {
      int division = 0 / 0;
    }
    catch (ArithmeticException e)
    {
      StringWriter sw = new StringWriter();
      e.printStackTrace(new PrintWriter(sw));
      String excpetionAsString = sw.toString();
      System.out.println(exceptionAsString);
    }
  }
}
