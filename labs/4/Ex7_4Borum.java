//William Borum
//CS 220
//Exercise 7.4
import java.util.Arrays;
import java.util.Scanner;

public class Ex7_4Borum {
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter scores to analyze, enter a negative number to end: ");
    
    int x = 0;
    double t = 0;
    //Initialize an array of size 100
    double[] list = new double[100];
    
    //Loop until the user enters a negative score or the user enters 100 scores
    while(x < 100 && t >= 0) {
      //Get integers from user and put them into the array in order
      t = input.nextDouble();
      list[x] = t;
      x ++;
    }
    
    //Analyze the scores using the method below
    analyzeScores(list);
  }
  
  //Displays both the number of scores below average, and those equal and above average
  public static void analyzeScores(double[] list) {
    
    //Create arrays for the below/above average scores
    int size = list.length;
    double[] below = new double[size];
    double[] above = new double[size];
    int b = 0;
    int a = 0;
    
    //Initialize the sum of the scores to 0 and the number of scores to 0 
    double sum = 0;
    int list_size = 0;
    //Loop until the index reaches the end of the array
    for(int i = 0; i < size; i ++) {
      //If the index value is non-negative, add it to the sum
      if(list[i] >= 0) sum += list[i];
      //Otherwise record the number of scores the user entered
      else list_size = i;
    }
    //Calculate the average
    double ave = sum/list_size;
    
    //Loop until the index reaches the number of scores the user inputed
    for(int i = 0; i < list_size; i ++) {
      //If the index value is below average, add to the below average list and add one to the number of below average scores
      if(list[i] < ave) {
        below[b] = list[i];
        b ++;
      }
      //Otherwise add to the above average list and add one to the number of equal or above average scores 
      else {
        above[a] = list[i];
        a ++;
      }
    }
    
    //Display the results
    System.out.println("Out of the " + list_size + " scores, " + b + " are below average, and " + a + " are equal or above average");
    System.out.println(Arrays.toString(Arrays.copyOfRange(below, 0, b)) + " are below average, and " + Arrays.toString(Arrays.copyOfRange(above, 0, a)) + " are equal or above average");
  }
}