//William Borum
//CS 220
//Exercise 11.1, 12.5
import java.util.Scanner;

public class Triangle extends SimpleGeometricObject {
  private double side1=1.0, side2=1.0, side3=1.0;
  
  Triangle() {
    
  }
  
  Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
    if (side1 >= side2 + side3)
      throw new IllegalTriangleException(side1);
    else if (side2 >= side1 + side3)
        throw new IllegalTriangleException(side2);
    else if (side3 >= side2 + side1)
        throw new IllegalTriangleException(side3);
    else {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }
  }
  
  public double getSide1() {
    return side1;
  }
  public double getSide2() {
    return side2;
  }
  public double getSide3() {
    return side3;
  }
  
  public double getArea() {
    double q = (side1 + side2 + side3)*.5;
    return Math.sqrt(Math.abs((q*(q - side1)*(q - side2)*(q - side3))));
  }
  
  public double getPerimeter() {
    return side1 + side2 + side3;
  }
  
  public String toString() {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }
  
  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three sides of the triangle, a color, and a T or F to "
        + "indicate whether the triangle is filled: ");
    
    try {
      double n1 = input.nextDouble();
      double n2 = input.nextDouble();
      double n3 = input.nextDouble();
      
      String color = input.next();
      String c = input.next();
      boolean b = c.equals("T") || c.equals("t");
      
      
      
      Triangle triangle = new Triangle(n1, n2, n3);
      
      triangle.setColor(color);
      triangle.setFilled(b);
      
      System.out.print("\n" + triangle.toString() + ". Its perimeter is " + triangle.getPerimeter() + 
          " and its area is " + triangle.getArea() + ". Its color is " + triangle.getColor());
      
      if(triangle.isFilled()) System.out.print(" and it is filled.");
      else System.out.print(" and it is not filled.");
    }
    catch (IllegalTriangleException e) {
      System.out.print("Triangle sides are incorrect: " + e);
    }
    
  }
}
