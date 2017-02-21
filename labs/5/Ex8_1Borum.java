//William Borum
//CS 220
//Exercise 8.1
import java.util.Scanner;

public class Ex8_1Borum {
  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a 3-by-4 matrix row by row: ");
    
    double t;
    //Initialize the 3x4 matrix
    double[][] matrix = new double[3][4];
    
    //Loop until the user enters the necessary 12 values
    for(int x=0;x<3;x++) {
      for(int y=0;y<4;y++) {
        //Get values from user and put them into the matrix in order
        t = input.nextDouble();
        matrix[x][y] = t;
      }
    }
    
    //Display the results
    for(int i=0;i<matrix[0].length;i++) System.out.println("The sum of the elements at column " + i + " is " + sumColumn(matrix, i));
  }
  
  //Gets the sum of a column given a matrix
  public static double sumColumn(double[][] m, int columnIndex) {
    //Initialize sum
    double sum = 0;
    
    //Loop through the matrix rows and add the elements in the column position
    for(int i=0;i<m.length;i++) {
      sum += m[i][columnIndex];
    }
    
    //Return total sum
    return sum;
  }
}
