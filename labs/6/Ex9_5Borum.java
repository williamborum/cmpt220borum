//William Borum
//CS 220
//Exercise 9.5
import java.util.GregorianCalendar;

public class Ex9_5Borum {
  public static void main(String[] args) {
    //Create Gregorian Calendar object
    GregorianCalendar g = new GregorianCalendar();
    //Display results, not sure if I should add 1 to the month to get the month number for how you would write the date
    System.out.println("The year is " + g.get(GregorianCalendar.YEAR) + ", the month is " + g.get(GregorianCalendar.MONTH) + ", and the day is " + g.get(GregorianCalendar.DAY_OF_MONTH));
    //Update object
    g.setTimeInMillis(1234567898765L);
    //Display results
    System.out.println("The year is " + g.get(GregorianCalendar.YEAR) + ", the month is " + g.get(GregorianCalendar.MONTH) + ", and the day is " + g.get(GregorianCalendar.DAY_OF_MONTH));
  }
}