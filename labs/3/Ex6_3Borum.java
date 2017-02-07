//William Borum
//CS 220
//Exercise 6.3
import java.util.Scanner;

public class Ex6_3Borum {
  
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer to test if it's a palindrome: ");
    
    //Grab integer
    int y = input.nextInt();
    
    //Display results using the methods below
    if(isPalindrome(y)) System.out.println(y + " is a palindrome, its reverse is " + reverse(y));
    else System.out.println(y + " is not a palindrome, its reverse is " + reverse(y));
  }
  
  
  //Return the reversal of an integer, i.e., reverse(456) returns 654
  public static int reverse(int number) {
    
    int last_digit = 0;
    int reversedNum = 0;
    
    //Loop until number is 0
    while (number != 0) {
      
      //Grab the the right-most digit
      last_digit = number % 10;
      
      //Add the digit to the reverse
      reversedNum = reversedNum * 10 + last_digit;
      
      //Get rid of the right-most digit
      number = number / 10; 
    }
    
    return(reversedNum);
  }
  
  
  //Return true if number is a palindrome
  public static boolean isPalindrome(int number) {
    return(number == reverse(number));
  }
}