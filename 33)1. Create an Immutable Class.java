Java program to create an Immutable Class

import java.io.*;
final class Immutable {
  private String name;
  private int date;
  
  Immnutable(String name, int date)
  {
    this.name = name;
    this.date = date;
  }
  public String getName()
  {
    return name;
  }
  public int getDate()
  {
    return date;
  }
  
}
public class Main {
  public static void main(String[] args)
  {
    Immutable obj = new Immutable("Program",2010);
    
    System.out.println("Name: " + obj.getName());
    System.out.println("Date: " + obj.getName());
  }
}
