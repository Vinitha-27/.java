Java program to Implement switch statement on strings

import java.io.*;
public class Main {
   public static void main(String args[])
   {
    String language = "Java";
    switch(language) {
     case "Java":
          System.out.println(language + " is famous for enterprise applications");
          break;
     case "JavaScript":
          System.out.println(language + " is for frontend and backend");
          break;
     case  "python":
          System.out.println(language + " is famous for ML and AI");
          break;
          
          
        default:
         System.out.println(language + " not found on record");
         break;
       }
      }
     }
