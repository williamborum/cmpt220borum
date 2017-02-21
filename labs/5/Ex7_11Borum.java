//William Borum
//CS 220
//Exercise 7.11
import java.util.Scanner;

public class Ex7_11Borum {
  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter 10 values to get its mean and deviation: ");
    
    int x = 0;
    double t;
    //Initialize an array of size 10
    double[] list = new double[10];
    
    //Loop until the user enters at least 10 values
    while(x < 10) {
      //Get values from user and put them into the array in order
      t = input.nextDouble();
      list[x] = t;
      x ++;
    }
    
    //Display the results
    System.out.println("The mean is " + mean(list) + " and the deviation is " + deviation(list));
  }
  
  /** Compute the deviation of double values */
  public static double deviation(double[] x) {
    double mean = mean(x), dev = 0, sum = 0;
    //Loop through the whole list
    for(int i=0;i<x.length;i++) {
      //Get the updated summation expression in the formula for deviation
      sum += Math.pow((x[i] - mean), 2);
    }
    //Get deviation using the summation expression and the formula for deviation
    dev = Math.sqrt(sum/(x.length-1));
    return dev;
  }
  
  /** Compute the mean of an array of double values */
  public static double mean(double[] x) {
    double sum = 0, mean = 0;
    //Loop through the whole list
    for(int i=0;i<x.length;i++) {
      //Get updated sum
      sum += x[i];
    }
    //Get mean by dividing sum by number of elements in the list
    mean = 1.0*sum/x.length;
    return mean;
  }
}
