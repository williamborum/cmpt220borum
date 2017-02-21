//William Borum
//CS 220
//Exercise 7.19
import java.util.Arrays;
import java.util.Scanner;

public class Ex7_19Borum {
  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter list: ");
    
    int elements = input.nextInt();
    
    int x = 0;
    int t;
    //Initialize an array of size given by user
    int[] list = new int[elements];
    
    //Loop until the user enters the necessary number of values
    while(x < elements) {
      //Get values from user and put them into the array in order
      t = input.nextInt();
      list[x] = t;
      x ++;
    }
    
    //Display the results
    if(isSorted(list)) System.out.println("The list is already sorted");
    else System.out.println("The list is not sorted");
  }
  
  public static boolean isSorted(int[] list) {
    //Create a new list that will be the sorted list
    int[] sorted = new int[list.length];
    
    //Copy contents of the list to the new list
    for(int i=0;i<list.length;i++) {
      sorted[i] = list[i];
    }
    //Sort the new list
    java.util.Arrays.sort(sorted);
    
    //Loop through the length of the list, if the sorted list and list are not equal at any index, return false
    for(int i=0;i<list.length;i++) {
      if(list[i] != sorted[i]) return false;
    }
    
    //Return true otherwise
    return true;
  }
}
