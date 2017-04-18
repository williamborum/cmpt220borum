//William Borum
//CS 220
//Exercise 13.9
class Circle extends GeometricObject implements Comparable<Circle> {
  /** The radius of this circle */
  double radius = 1;
  /** Construct a circle object */
  Circle() {
  }
  /** Construct a circle object */
  Circle(double radius) {
    this.radius = radius;
  }
  /** Return the area of this circle */
  public double getArea() {
    return radius * radius * Math.PI;
  }
  /** Return the perimeter of this circle */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
  /** Set new radius for this circle */
  public double setRadius(double radius) {
    this.radius = radius;
    return radius;
  }
  
  public String toString() {
    return "Circle: radius = " + radius;
  }
  
  public int compareTo(Circle o) {
    if (this.radius > o.radius)
      return 1;
    else if (this.radius < o.radius)
      return -1;
    else
      return 0;
  }
  
  
  
  public static void main(String[] args) {    
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(5);
    Circle c3 = new Circle(7);
    
    if(c1.compareTo(c2) == 0) System.out.println(c1 + " and " + c2 + " are equal.");
    else System.out.println(c1 + " and " + c2 + " are not equal.");
    
    if(c1.compareTo(c3) == 0) System.out.println(c1 + " and " + c3 + " are equal.");
    else System.out.println(c1 + " and " + c3 + " are not equal.");
    
    System.out.println(c1.getArea() + ", " + c2.getArea() + ", " + c3.getArea());
  }
}

