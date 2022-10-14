Java program to Implement swtich statement on strings.
 
import java.io*;
public class Main {
  public static void main(String args[])
  {
    String language = "java";
    switch(language)
    {
      case  "Java":
        System.out.println(language + " is famous for enterprise  application");
        break;
        
     case "JavaScript":
        System.out.println(language + " is famous for frontend and backend");
        break;
     
      case "Python":
        System.out.println(language + " is famous for ML and AI");
        break;
      
      default:
        System.out.println(language + " not found on record");
        break;
    }
  }
}
