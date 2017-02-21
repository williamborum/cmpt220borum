//William Borum
//CS 220
//Exercise 7.14
import java.util.Scanner;

public class Ex7_14Borum {
  public static void main(String[] args) {
  //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter 5 values to get its gcd: ");
    
    int x = 0;
    int t;
    //Initialize an array of size 5
    int[] list = new int[5];
    
    //Loop until the user enters at least 5 values
    while(x < 5) {
      //Get values from user and put them into the array in order
      t = input.nextInt();
      list[x] = t;
      x ++;
    }
    
    //Display the results
    System.out.println("The gcd is " + gcd(list));
  }
  
  public static int gcd(int... numbers) {
    // the GCD of a number with itself is itself
    int gcd = numbers[0];

    // get gcd of the current gcd and the next integer in the list
    for(int i=1;i<numbers.length;i++) {
      gcd = getGCD(gcd, numbers[i]);
    }

    return gcd;
  }
  
  public static int getGCD(int a, int b) {
    //Find the smaller of the two integers
    int smallest = 0, gcd = 1;
    if(a<b) smallest = a;
    else smallest = b;
    
    //Loop through to the smaller number 
    for(int i=1;i<=smallest;i++) {
      //If the integer divides both integers, update the current gcd
      if(a%i==0 && b%i==0) gcd = i;
    }
    
    return gcd;
  }
}
