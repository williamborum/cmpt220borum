//William Borum
//CS 220
//Exercise 6.16

public class Ex6_16Borum {
  public static void main(String[] args) {
    //Loop from year 2000 to 2020
    for(int j = 2000; j < 2021; j ++) {
      //Print the number of days using the methods below
      System.out.println("The number of days in the year " + j + " is " + numberOfDaysInAYear(j));
    }
  }
  
  //Returns the number of days given the year
  public static int numberOfDaysInAYear(int year) {
    //If the method below finds it is a leap year, add 1 to 365 days in a year
    int i = 0;
    if(isLeapYear(year)) i = 1;
    return(365 + i);
  }
  
  //Returns true if it is a leap year, false if not
  public static boolean isLeapYear(int year) {
    //If the year is not divisible by 4, return false
    if (year % 4 != 0) {
      return false;
    }
    //If the year is divisible by 400, return true
    else if (year % 400 == 0) {
      return true;
    } 
    //If the year is divisible by 100, return false
    else if (year % 100 == 0) {
      return false;
    } 
    //Return true otherwise
    else {
      return true;
    }
  }
}
