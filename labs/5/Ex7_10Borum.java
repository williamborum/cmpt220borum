//William Borum
//CS 220
//Exercise 7.10
import java.util.Scanner;

public class Ex7_10Borum {
  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter 10 values to find the where the smallest value is: ");
    
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
    System.out.println("The index of the smallest value is " + indexOfSmallestElement(list));
  }
  
  public static int indexOfSmallestElement(double[] array) {
    //Assume the smallest value is the first element in the list
    int ind = 0;
    double smallest = array[0];
    
    //Loop through the whole list
    for(int i=0;i<array.length;i++) {
      //If the value at a certain index is smaller than the smallest so far, set the current index to be the smallest location, update smallest value
      if(array[i]<smallest) {
        ind = i;
        smallest = array[i];
      }
    }
    return ind;
  }
}
