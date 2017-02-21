//William Borum
//CS 220
//Exercise 8.5
import java.util.Scanner;

public class Ex8_5Borum {
  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter matrix1: ");
    
    double t;
    //Initialize the 3x4 matrix
    double[][] m1 = new double[3][3];
    double[][] m2 = new double[3][3];
    
    //Loop until the user enters the necessary 12 values
    for(int x=0;x<3;x++) {
      for(int y=0;y<3;y++) {
        //Get values from user and put them into the matrix in order
        t = input.nextDouble();
        m1[x][y] = t;
      }
    }
    
    System.out.print("Enter matrix2: ");
    
    //Loop until the user enters the necessary 12 values
    for(int x=0;x<3;x++) {
      for(int y=0;y<3;y++) {
        //Get values from user and put them into the matrix in order
        t = input.nextDouble();
        m2[x][y] = t;
      }
    }
    
    //Display the results
    System.out.println("The matrices are added as follows ");
    System.out.println(stringMatrix(m1) + "     + \n" + stringMatrix(m2) + "     = \n" + stringMatrix(addMatrix(m1,m2)));
  }
  
  //Returns the sum of two matrices
  public static double[][] addMatrix(double[][] a, double[][] b) {
    //Initialize the matrix that will hold the sum of the two matrices
    double[][] c = new double[a.length][a[0].length];
    
    //Iterate through the matrix
    for(int x=0;x<a.length;x++) {
      for(int y=0;y<a[0].length;y++) {
        //Add the two elements at the same position in the matrix and assign to the sum matrix
        c[x][y] = a[x][y] + b[x][y];
      }
    }
    
    //Return the matrix
    return c;
  }
  
  //Returns string of a matrix with spaces between elements
  public static String stringMatrix(double[][] a) {
    String sMatrix = "";
    
    //Iterate through the whole matrix
    for(int x=0;x<a.length;x++) {
      for(int y=0;y<a[0].length;y++) {
        //Add the element to the string and put a space after it
        sMatrix += a[x][y] + " ";
      }
      //New line at the end of a row
      sMatrix += "\n";
    }
    
    //Return the string
    return sMatrix;
  }
}
