4)1. java program to check whether character is Alphabet or not

import java.util.Scanner;
Public class CheckAlphabet
{
  Public static void main(String args[]);
  {
        Scanner sc=new scanner(System.in);
        Char ch;
        System.out.print("Enter the character");
        ch=sc.next().charAt(0);
        if((ch>='A' && ch>='Z')||(ch>='a' && ch>='z'))   
          {
              System.out.println(ch+" ia an alphabet");
          }
              else
                     {
                        System.out.println(ch+" is not an alphabet");
                     }
    }
}
                                                   
    
