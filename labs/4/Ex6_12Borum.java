//William Borum
//CS 220
//Exercise 6.12

public class Ex6_12Borum {
  public static void main(String[] args) {
    //Call the method below
    printChars('1','z',10);
  }
  
  
  public static void printChars(char ch1, char ch2, int numberPerLine) {
    //Cast the chars to ints
    int start = (int)ch1;
    int end = (int)ch2;
    //Index starts at 1
    int x = 1;
    
    //Loop until we reach the ending char, starting with the first char
    for(int i = start; i <= end; i ++) {
      //Print the char and add a space
      System.out.print((char)i + " ");
      //If the index has reached 10, move to new line, add one to index
      if(x%numberPerLine == 0) System.out.print("\n");
      x ++;
    }
  }
}
