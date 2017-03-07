//William Borum
//CS 220
//Exercise 9.13
import java.util.Scanner;

public class Location {
  public int row=-1, column=-1;
  public double maxValue=-1;
  
  public Location(){
  }
  public Location(double[][] a){
    for(int x=0; x < a.length; x++) {
      for(int y=0; y < a[0].length; y++) {
        if(a[x][y] > maxValue) {
          maxValue = a[x][y];
          row = x;
          column = y;
        }
      }
    }
  }
  
  public static Location locateLargest(double[][] a) {
    Location l = new Location(a);
    return l;
  }
  
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and columns in the array: ");
    
    int r = input.nextInt();
    int c = input.nextInt();
    
    System.out.println("Enter the array: ");
    
    double[][] b = new double[r][c];
    for(int i=0; i < r; i++) {
      for(int j=0; j < c; j++) {
        b[i][j] = input.nextDouble();
      }
    }
    
    Location l = locateLargest(b);
    System.out.println("The location of the largest element is " + l.maxValue + " at (" + l.row + ", " + l.column + ")");
  }
}
