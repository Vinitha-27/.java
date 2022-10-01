Java program to Convert Byte Array to Hexadecimal

import java.io*;
public class ByteHex {
  public static void main(String args[])
  {
    byte[] bytes = {2, 5, 7, 11};
    for (byte b : bytes)
    {
      String st = String.format("%02x",b);
      System.out.print(st);
    }
  }
    
