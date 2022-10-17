Java program to Create an Immutable Class.

import java.io.*;
public class Immutable {
  private String name;
  private int date;
  
Immutable(String name , int date)
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
  public static void main(String args[])
  {
    Immutable obj = new Immutable("program");
  
    System.out.println("Name  " + obj.getName());
    Sysrem.out,println("Date " + obj.getDate());
  }
 }
