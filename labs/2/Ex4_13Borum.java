//William Borum
//CS 220
//Exercise 4.13
import java.util.Scanner;

public class Ex4_13Borum {
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a letter: ");
    
    //Get char
    char c = input.next().charAt(0);
    
    //Cast char to int
    int s = (int) c;
    
    //Start at A
    int t = s - 65;
    
    //Consonant unless the char is one of A,E,I,O,U,a,e,i,o,u
    String charType = "a consonant";
   // JA: You don't need the % operator. You are only checking for 5 of the vowels. 
   // Another option would be to use a switch statement:
   // switch (s) {
   //   case 'A':
   //   case 'E':
   //   case 'I':
   //   case 'O':
   //   case 'U':
   //   case 'a':
   //   case 'e':
   //   case 'i':
   //   case 'o':
   //   case 'u': charType = "a vowel"; break;
   //   case default: ...
    if(t % 26 == 0 || t % 26 == 4 || t % 26 == 8 || t % 26 == 14 || t % 26 == 20) 
      charType = "a vowel";
    
    if(t < 0 || t > 51)
      charType = "an invalid input";
    
    //Display the results
    System.out.println(c + " is " + charType);
    
  }
}
