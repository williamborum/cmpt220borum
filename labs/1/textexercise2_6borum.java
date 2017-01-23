import java.util.Scanner;
public class textexercise2_6borum {
  public static void main(String[] args) {
    
    //Prompt the user to enter a number between 0 and 1000
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 1000: ");
    
    int number = input.nextInt();
    
    //Compute the values of the digits and the total sum
    int single = number % 10;
    int ten = (number / 10) % 10;
    int hundred = (number / 100) % 10;
    int total = single + ten + hundred;
    
    //Display results
    System.out.println("The sum of the digits is " + total);
  }
}