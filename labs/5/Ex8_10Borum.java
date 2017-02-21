//William Borum
//CS 220
//Exercise 8.10

public class Ex8_10Borum {
  public static void main(String[] args) {
    
    //Initialize 4x4 matrix
    int[][] m = new int[4][4];
    for(int x=0;x<4;x++) {
      for(int y=0;y<4;y++) {
        //Put 0 or 1 into the position of the matrix
        m[x][y] = (int)(Math.random()+.5);
      }
    }
    
    //Display the results
    System.out.println(stringMatrix(m));
    System.out.println("The largest row index: " + getMaxRow(m));
    System.out.println("The largest column index: " + getMaxColumn(m));
  }
  
  //Returns the first row with a max sum
  public static int getMaxRow(int[][] m) {
    int high = 0;
    int pos = 0;
    
    //Iterate over the rows
    for(int i=0;i<m.length;i++) {
      int r = sumRow(m, i);
      //If the row has a sum greater than the highest, update the highest sum and position
      if(r>high) {
        high = r;
        pos = i;
      }
    }
    
    //Return the position of the row
    return pos;
  }
  
  //Returns the first column with a max sum
  public static int getMaxColumn(int[][] m) {
    int high = 0;
    int pos = 0;
    //Iterate over the columns
    for(int i=0;i<m[0].length;i++) {
      int r = sumColumn(m, i);
      //If the column has a sum greater than the highest, update the highest sum and position
      if(r>high) {
        high = r;
        pos = i;
      }
    }
    
    //Return the position of the column
    return pos;
  }
  
  //Gets the sum of a row given a matrix
  public static int sumRow(int[][] m, int rowIndex) {
    //Initialize sum
    int sum = 0;
    
    //Loop through the matrix columns and add the elements in the row position
    for(int i=0;i<m[rowIndex].length;i++) {
      sum += m[rowIndex][i];
    }
    
    //Return total sum
    return sum;
  }
  
  //Gets the sum of a column given a matrix
  public static int sumColumn(int[][] m, int columnIndex) {
    //Initialize sum
    int sum = 0;
    
    //Loop through the matrix rows and add the elements in the column position
    for(int i=0;i<m.length;i++) {
      sum += m[i][columnIndex];
    }
    
    //Return total sum
    return sum;
  }
  
  //Returns string of a matrix with spaces between elements
  public static String stringMatrix(int[][] a) {
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
