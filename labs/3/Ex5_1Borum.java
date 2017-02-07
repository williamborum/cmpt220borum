//William Borum
//CS 220
//Exercise 5.1
import java.util.Scanner;

public class Ex5_1Borum {
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    int x = -1;
    int pos = 0;
    int neg = 0;
    int sum = 0;
    
    System.out.print("Enter an integer, the input ends if it is 0: ");
    
    while(x != 0) {
      //Get integer
      x = input.nextInt();
      
      //Test positive or negative
      if(x < 0) neg++;
      if(x > 0) pos++;
      
      //Add to sum
      sum += x;
    }
    
    //Calculate average
    double ave = 1.0 * sum / (pos + neg);
    
    //Display the results
    if (pos == 0 && neg == 0) System.out.println("No numbers are entered except 0");
    else{
      System.out.println("The number of positives is " + pos);
      System.out.println("The number of negatives is " + neg);
      System.out.println("The total is " + sum);
      System.out.println("The average is " + ave);
    }
  }
}