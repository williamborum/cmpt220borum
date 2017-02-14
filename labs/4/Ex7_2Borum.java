//William Borum
//CS 220
//Exercise 7.2
import java.util.Arrays;
import java.util.Scanner;

public class Ex7_2Borum {
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter 10 integers: ");
    
    int x = 0;
    int t;
    //Initialize an array of size 10
    int[] list = new int[10];
    
    //Loop until the user enters at least 10 integers
    while(x < 10) {
      //Get integers from user and put them into the array in order
      t = input.nextInt();
      list[x] = t;
      x ++;
    }
    
    //Display what the user input for the ten integers and display the reverse using the method below
    System.out.println("The ten integers put in were " + Arrays.toString(list));
    System.out.println("The ten integers in reverse are " + Arrays.toString(reverse(list)));
  }
  
  //Returns the reverse of an integer array
  public static int[] reverse(int[] list) {
    //Initialize an array of the same size as the given array
    int size = list.length;
    int[] rev = new int[size];
    
    //Loop until the index reaches the end of the array
    for(int i = 0; i < size - 1; i ++) {
      //Put the corresponding opposite indexed integer into the reverse array
      rev[i] = list[size - i - 1];
    }
    return rev;
  }
}
