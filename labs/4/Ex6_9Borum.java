//William Borum
//CS 220
//Exercise 6.9

public class Ex6_9Borum {
  public static void main(String[] args) {
    //Print the header
    System.out.println("Feet\tMeters\t|\tMeters\tFeet");
    System.out.println("------------------------------------");
    
    //First meter value
    double j = 20;
    //Loop until feet is greater than or equal to 11
    for(double i = 1; i < 11; i ++) {
      //Print the row using the methods below, add 5 to meters
      System.out.println(i + "\t" + footToMeter(i) + "\t|\t" + j + "\t" + meterToFoot(j));
      j += 5;
    }
    
  }
  
  /** Convert from feet to meters */
  public static double footToMeter(double foot) {
    return(.305*foot);
  }
  /** Convert from meters to feet */
  public static double meterToFoot(double meter) {
    return(3.279*meter);
  }


}