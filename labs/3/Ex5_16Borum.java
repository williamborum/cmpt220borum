//William Borum
//CS 220
//Exercise 5.16
import java.util.Scanner;

public class Ex5_16Borum {
  
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer to find its factors: ");
    
    //Grab integer
    int y = input.nextInt();
    
    //Loop until t is 0
    int t = -1;
    while(t != 0){
      
      //Call method factorize to find the smallest factor of the integer
      t = factorize(y);
      
      if(t != 0) {
        
        //Print the smallest factor 
        System.out.print(t + ", ");
        
        //Change the integer so that the next iteration searches for the next smallest factor
        y = y/t;
      }
    }
  }
  
  //Returns the smallest factor of the given integer
  public static int factorize(int x) {
    
    //Start at 2 and increase until i is greater than the given integer
    for(int i = 2; i <= x; i++) {
      if(x % i == 0) return(i);
    }
    
    //Returns 0 if there are no factors
    return 0;
  }
}