//William Borum
//CS 220
//Exercise 7.8
import java.util.Scanner;

public class Ex7_8Borum {

  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter 10 values to find its average: ");
    
    int x = 0;
    int t;
    //Initialize an array of size 10
    double[] list = new double[10];
    
    //Loop until the user enters at least 10 values
    while(x < 10) {
      //Get values from user and put them into the array in order
      t = input.nextDouble(); // JA: This had to read doubles, not integers
      list[x] = t;
      x ++;
    }
    
    //Display what the user input for the ten integers and display the reverse using the method below
    System.out.println("The average is " + average(list));
  }
  
  
  public static int average(int[] array) {
    //Initialize sum to 0
    int sum = 0;
    //Loop until the index reaches the end of the array
    for(int i = 0; i < array.length; i ++) {
      //Add index value to sum
      sum += array[i];
    }
    //Calculate the average
    double ave = 1.0*sum/array.length;
    
    return (int)ave;
  }
  
  public static double average(double[] array) {
    //Initialize sum to 0
    double sum = 0;
    //Loop until the index reaches the end of the array
    for(int i = 0; i < array.length; i ++) {
      //Add index value to sum
      sum += array[i];
    }
    //Calculate the average
    double ave = sum/array.length;
    
    return ave;
  }
}
