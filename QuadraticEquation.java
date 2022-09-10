3)1. Java program to find all roots of a quadratic equation.
  
 import java.utill.Scanner:
 Public class Quad {
   Public static void main(String args[])
   {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the value of a");
     double a=input.nextDouble();
     System.out.println("Enter the value of b");
     double b=input.nextDouble();
     System.out.println("Enter the value of c");
     double c=input.nextDouble();
     double d=b*b-4*a*c;
     if(det>0)
     {
       double r1=(-b+Math.sqrt(det))/(2*a);
       double r2=(-b-math.sqrt(det))/(2*a);
       System.out.println("The roots are" +r1 +"and" +r2);
     }
     else if(d==0)
       double r1=-b(2*a);
       System.out.println("The roots is" +r1);
   }
   else
   {
     System.out.println("Roots are not real");
   }
 }
}
