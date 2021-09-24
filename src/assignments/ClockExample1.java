package assignments;


import java.time.Clock;
import java.time.Duration;  
public class ClockExample1 {  
	public static int getWarmupRuns(int m) {
        return Integer.max(2, Integer.min(10, m / 10));
    }
  public static void main(String[] args) {
	  System.out.println(getWarmupRuns(40));
  }  
}  