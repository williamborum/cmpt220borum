import java.util.Scanner;

public class textexercise2_9borum {
  public static void main(String[] args) {
    
    //Prompt the user to enter v0, v1, and t
    Scanner input = new Scanner(System.in);
    System.out.print("Enter v0, v1, and t: ");
    
    double v0 = input.nextDouble();
    double v1 = input.nextDouble();
    double t = input.nextDouble();
    
    
    //Compute the acceleration
    double accel = (v1 - v0)/t;
    
    //Display results
    System.out.println("The average acceleration is " + accel);
  }
}
