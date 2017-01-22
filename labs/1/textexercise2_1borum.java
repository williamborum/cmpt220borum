import java.util.Scanner;
public class textexercise2_1borum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Celsius: ");
    
    //Prompt the user to enter a degree in celsius
    double celsius = input.nextDouble();
    
    //Compute degree to fahrenheit
    double fahrenheit = (9.0 / 5) * celsius + 32;
    
    //Display results
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}
