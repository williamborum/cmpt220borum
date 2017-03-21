//William Borum
//CS 220
//Exercise 10.11

public class Circle2D {
  private double x = 0, y = 0;
  private double radius = 1;
  
  public double getX() {
    return x;
  }
  
  public double getY() {
    return y;
  }
  
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  Circle2D(){
  }
  
  Circle2D(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  
  public double getArea() {
    return radius * radius * Math.PI;
  }
  
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
  
  private double distance(double a, double b) {
    return Math.sqrt(Math.pow((a-x),2) + Math.pow((b-y),2));
  }
  
  public boolean contains(double a, double b) {
    return distance(a,b) <= radius;
  }
  
  public boolean contains(Circle2D circ) {
    double a = circ.getX();
    double b = circ.getY();
    double z = circ.getRadius();
    return ((distance(a,b) + z) <= radius);
  }
  
  public boolean overlaps(Circle2D circ) {
    double a = circ.getX();
    double b = circ.getY();
    double z = circ.getRadius();
    return ((distance(a,b) - z) <= radius);
  }

  public static void main(String[] args) {
    Circle2D c1 = new Circle2D(2, 2, 5.5);
    System.out.println("Circle c1 has an area of " + c1.getArea() + " and a perimeter of " + c1.getPerimeter());
    
    Circle2D c2 = new Circle2D(4, 5, 10.5);
    Circle2D c3 = new Circle2D(3, 5, 2.3);
    System.out.println("True or false: c1 contains the point (3, 3), " + c1.contains(3, 3) + "\n" +
                       "True or false: c1 contains the circle centered at (4, 5) with radius 10.5, " + c1.contains(c2) + "\n" +
                       "True or false: c1 overlaps the circle centered at (3, 5) with radius 2.5, " + c1.overlaps(c3));
    
  }
}
