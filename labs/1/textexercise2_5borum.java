import java.util.Scanner;
public class textexercise2_5borum {
  public static void main(String[] args) {
    
    //Prompt the user to enter a the subtotal and gratuity rate
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate: ");
    
    double subtotal = input.nextDouble();
    double rate = input.nextDouble();
    
    //Compute gratuity and total
    double gratuity = subtotal * rate * .01;
    double total = subtotal + gratuity;
    
    //Display results
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
}