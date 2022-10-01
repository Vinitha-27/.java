Java program to Convert a List to Array and Vice Versa

import java.util.ArrayList;
class Main {
  public static void main(String[] args)
  {
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("ArrayList  " + languages);
    String[] arr = new String[languages.size()];
    
    languages.toArray(arr);
    System.out.print("Array");
    for(String item:arr)
    {
      System.out.print(item+", ");
    }
  }
}
      
