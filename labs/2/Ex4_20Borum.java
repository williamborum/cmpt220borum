//William Borum
//CS 220
//Exercise 4.20
import java.util.Scanner;

public class Ex4_20Borum {
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    
    //Get string
    String s = input.next();
    
    //Get string length
    int l = s.length();
    
    //Get first char
    char c = s.charAt(0);
    
    //Display the results
    System.out.println("Your string is " + l + " characters long and the first character is '" + c + "'");
    
  }
}
