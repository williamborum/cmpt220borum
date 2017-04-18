//William Borum
//CS 220
//Exercise 13.5
public class GeometricTest {

  public static void main(String[] args) throws IllegalTriangleException {
    Triangle t1 = new Triangle(2, 3, 4);
    Triangle t2 = new Triangle(4, 5, 6);
    
    Rectangle r1 = new Rectangle(3, 4);
    Rectangle r2 = new Rectangle(1, 2);
    
    System.out.println("The max of " + t1 + " and " + t2 + " is " + SimpleGeometricObject.max(t1, t2));
    System.out.println("The max of " + r1 + " and " + r2 + " is " + SimpleGeometricObject.max(r1, r2));
    
    
  }

}
