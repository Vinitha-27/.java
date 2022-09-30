Java program to Add Two Dates

import java.util.Calender;
public class AddDates {
  public static void main(String args[])
  {
    Calender c1 = Calender.getInstance();
    Calender c2 = Calender.getInstance();
    Calender cTotal = (Calender) c1.clone();
    cTotal.add(Calender.YEAR, c2.get(Calender.YEAR));
    cTotal.add(Calender.MONTH, c2.get(Calender.MONTH));
    cTotal.add(Calender.DATE, c2.get(Calender.DATE));
    cTotal.add(Calender.HOUR_OF_DAY, c2.get(Calender.Hour_OF_DAY));
    cTotal.add(Calender.MINUTE, c2.get(Calender.MINUTE));
    cTotal.add(Calender.SECOND, c2.get(Calender.SECOND));
    cTotal.add(Calender.MILLISECOND, c2.get(Calender.MILLISECONDS));
    
    System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), cTotal.getTime());
    
  }
}
    
