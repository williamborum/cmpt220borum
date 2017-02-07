//William Borum
//CS 220
//Exercise 6.1

public class Ex6_1Borum {
  
  public static void main(String[] args) {
    
    int t = 0;
    
    //Loop for the first 100 positive integers
    for(int n = 1; n < 101; n++) {
      
      //Call the getPentagonalNumber method
      t = getPentagonalNumber(n);
      
      //Print the pentagonal number and space out the column
      System.out.print(t + "\t");
      
      //Move to next line if the row has reached 10 numbers
      if (n % 10 == 0) System.out.print("\n");
    }
    
  }
  
  //Returns the pentagonal number for a given integer
  public static int getPentagonalNumber(int x) {
    return(x * (3 * x - 1) / 2);
  }
}