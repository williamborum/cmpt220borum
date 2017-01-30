//William Borum
//CS 220
//Exercise 4.9
import java.util.Scanner;

public class Ex4_9Borum {
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a character: ");
    
    //Get char
    char c = input.next().charAt(0);
    
    //Cast char to int
    int s = (int) c;
    
    //Display the results
    System.out.println("The Unicode for the character " + c + " is " + s);
    
  }
}
