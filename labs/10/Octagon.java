//William Borum
//CS 220
//Exercise 13.11
class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
  /** The side of this Octagon */
  double side = 1;
  /** Construct a Octagon object */
  Octagon() {
  }
  /** Construct a Octagon object */
  Octagon(double side) {
    this.side = side;
  }
  /** Return the area of this Octagon */
  public double getArea() {
    return (2.0 + 4.0/22.0)* side * side;
  }
  /** Return the perimeter of this Octagon */
  public double getPerimeter() {
    return 8 * side;
  }
  /** Set new side for this Octagon */
  public double setside(double side) {
    this.side = side;
    return side;
  }
  
  public String toString() {
    return "Octagon: side = " + side;
  }
  
  public int compareTo(Octagon o) {
    if (this.side > o.side)
      return 1;
    else if (this.side < o.side)
      return -1;
    else
      return 0;
  }
  
  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
  
  
  
  public static void main(String[] args) throws CloneNotSupportedException {    
    Octagon o1 = new Octagon(5);
    Octagon o2 = (Octagon) o1.clone();
    
    if(o1.compareTo(o2) == 0) System.out.println(o1 + " and " + o2 + " are equal.");
    else System.out.println(o1 + " and " + o2 + " are not equal.");
    
    System.out.println(o1 + " has an area of " + o1.getArea() + " and a perimeter of " + o1.getPerimeter());
    System.out.println(o2 + " has an area of " + o2.getArea() + " and a perimeter of " + o2.getPerimeter());
    
  }
}

