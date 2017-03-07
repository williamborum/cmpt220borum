//William Borum
//CS 220
//Ex 9.1

class Rectangle {
  /** The width and height of the rectangle */
  double width = 1;
  double height = 1;
  /** Construct a rectangle object */
  Rectangle() {
  }
  /** Construct a rectangle object */
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
  /** Return the area of this rectangle */
  double getArea() {
    return width * height;
  }
  /** Return the perimeter of this rectangle */
  double getPerimeter() {
    return 2 * (width + height);
  }
  
  public static void main(String[] args) {
    // Create the rectangles
    Rectangle r1 = new Rectangle(4, 40);
    Rectangle r2 = new Rectangle(3.5, 35.9);
    //Display results
    System.out.println("The width of rectangle 1 is " + r1.width + ", the height is " + r1.height + ", the area is " + r1.getArea() + " and the perimeter is " + r1.getPerimeter());
    System.out.println("The width of rectangle 2 is " + r2.width + ", the height is " + r2.height + ", the area is " + r2.getArea() + " and the perimeter is " + r2.getPerimeter());
  }
}

