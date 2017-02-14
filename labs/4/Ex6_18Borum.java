//William Borum
//CS 220
//Exercise 6.18
import java.util.Scanner;

public class Ex6_18Borum {
  public static void main(String[] args) {
    
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a password that is alphanumeric, contains at least 2 digits, and is at least 8 characters: ");
    
    boolean f = true;
    String pass = "";
    
    //Repeat until a valid password is entered
    while(f) {
      //Get string from user
      pass = input.nextLine();
      
      //Test if the password is valid
      boolean t = isValid(pass);
      //If the password is not valid, prompt the user to input another
      if(!t) System.out.println("Invalid Password, please try again.");
      //Otherwise, the password is valid
      else {
        System.out.println("Valid Password");
        f = true;
      }
    }
  }
  
  //Method to determine if the string meets the requirements for a password
  private static boolean isValid(String pass) {
    
    //Test the 3 criteria, using the methods below
    if(pass.length() >= 8 && isAlphaNumeric(pass) && containsDigits(pass)) return true;
    //Returns false otherwise
    return false;
  }
  
  //Method to determine if all the characters in the string are either numbers or letters
  private static boolean isAlphaNumeric(String pass) {
    //Loop for until the index reaches the end of the string
    for(int i = 0; i < pass.length(); i ++) {
      
      //Get the integer value associated with the indexed char at the i position in the string
      int t = (int)pass.charAt(i);
      
      //Returns false if the char is neither a digit nor a letter
      if( t < (int)'1' || (t > (int)'9' && t < (int)'A') || (t > (int)'Z' && t < (int)'a') || t > (int)'z' ) return false;
    }
    //Returns true otherwise
    return true;
  }
  
  //Method to determine if at least 2 of the chars are digits
  private static boolean containsDigits(String pass) {
    
    //Initial count of 0 chars being digits
    int x = 0;
    
    //Loop for until the index reaches the end of the string
    for(int i = 0; i < pass.length(); i ++) {
      
      //Get the integer value associated with the indexed char at the i position in the string
      int t = (int)pass.charAt(i);
      
      //Add one to the count of digits if the char is a digit
      if( t >= (int)'1' && t <= (int)'9') x ++; 
    }
    //Returns whether or not the count is greater than or equal to 2
    return(x >= 2);
  }
}