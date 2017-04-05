//William Borum
//CS 220
//Exercise 12.3
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayIndexOutOfBoundsException {
  
  public static void main(String[] args) {
    int[] a = new int[100];
    
    for(int x = 0; x < a.length; x++) {
      a[x] = ThreadLocalRandom.current().nextInt(-999, 1000);
    }
    
    try {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an index between 0 and 99: ");
      
      int y = input.nextInt();
      
      System.out.println("The random integer at index " + y + " is " + a[y]);

      input.close();
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index: " + e);
    }
  }
}