import java.io.*;
Public class SwapTwoNumbers{
  Public Static void main(String args[])
  {
    float a=2.20f, b=3.2f;
    System.Out.Println("Before Swap");
    System.Out.Println("First number ="+a);
    System.Out.Println("Second number ="+b);
    float temporary=a;
    a=b;
    b=temporary;
    System.Out.Println("After Swap");
    System.Out.Println("First number ="+a);
    System.Out.Println("Second number ="+b);
  }
}
