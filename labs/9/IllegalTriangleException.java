//William Borum
//CS 220
//Exercise 12.5

public class IllegalTriangleException extends Exception{
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private double side = 1.0;
  
  public IllegalTriangleException() {
  }
  
  public IllegalTriangleException(double side) {
    super(side + " is larger than the other two combined");
  }
  
  public double getSide1() {
    return side;
  }

}
