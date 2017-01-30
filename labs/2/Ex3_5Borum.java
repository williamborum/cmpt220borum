//William Borum
//CS 220
//Exercise 3.5
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex3_5Borum {
	public static void main(String[] args) {
	  
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("What number is today: ");
    int today = input.nextInt();
    
    System.out.print("Enter the number of days elapsed since today: ");
    int days = input.nextInt();
    
    //Create Array of the days in a week
    List<String> key = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
    
    //Convert days to strings using the array
    String todayWord = key.get(today);
    String futuredayWord = key.get((today + days) % 7);
    
    //Display the results
    System.out.print("Today is " + todayWord + " and the future day is " + futuredayWord);
	}
}