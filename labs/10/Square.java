//William Borum
//CS 220
//Exercise 13.7
public class Square extends SimpleGeometricObject implements Colorable {
  double side = 1;
  
  public Square() {
    
  }
  
  Square(double side) {
    this.side = side;
  }
  /** Return the perimeter of this rectangle */
  public double getPerimeter() {
    return 4 * side;
  }
  
  public String toString() {
    return "Square: side = " + side;
  }
  
  @Override
  public void howToColor() {
    System.out.println("Color all 4 sides");
  }

  @Override
  public double getArea() {
    return side*side;
  }
  
  
  public static void main(String[] args) throws IllegalTriangleException {
    Triangle t1 = new Triangle(5, 9, 6);
    Triangle t2 = new Triangle(10, 6, 11);
    Square s1 = new Square(5);
    Square s2 = new Square(8);
    Rectangle r1 = new Rectangle(6, 7);
    SimpleGeometricObject[] simpleGeometricObjects = {t1,s2,r1,s1,t2};
    
    for(SimpleGeometricObject s : simpleGeometricObjects) {
      System.out.println(s + " has an area of " + s.getArea());
      if(s instanceof Square)
        ((Square) s).howToColor();
    }
  }
  
}
