Java program to calculate Difference Between Two Time periods.
  
import java.io.*;
public class Time {
  int seconds;
  int minutes;
  int hours;
 public Time(int hours, int minutes, int seconds) {
   this.hours = hours;
   this.minutes = minutes;
   this.seconds = seconds;
 }
  Time start = new Time(4, 6, 12);
  Time stop = new Time(24, 2, 44);
  Time diff;
  diff = difference(start, stop);
  
  System.out.printf("TIME DIFFERENCE %d: %d: %d -", start.hours, start.minutes, start.seconds);
  System.out.printf(" %d: %d: %d ", start.hours, start.minutes, start.seconds);
  System.out.printf("=  %d: %d: %d\n", diff.hours, diff.minutes, diff.seconds);
}
public static Time difference(Time start, Time stop)
{
 
    Time diff = new Time(0, 0, 0);
  if(start.minutes > stop.minutes) {
     --stop.hours;
    stop.minutes += 60;
  }
  diff.minutes = stop.minutes - start.minutes;
  diff.hours = stop.hours - start.hours;
  return(diff);
}
}
    
