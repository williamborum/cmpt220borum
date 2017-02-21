//William Borum
//CS 220
//Exercise 8.7
import java.util.Arrays;

public class Ex8_7Borum {
  public static void main(String[] args) {
    
    double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
        {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
        {5.5, 4, -0.5}};
    
    // p1 and p2 are the indices in the points' array
    double[] p1 = points[0], p2 = points[1]; // Initial two points
    double shortestDistance = distance(p1, p2); // Initialize shortestDistance
    
    // Compute distance for every two points
    for (int i = 0; i < points.length; i++) {
      for(int j = i+1; j < points.length; j++) {
        double distance = distance(points[i], points[j]); // Find distance
        if (shortestDistance > distance) {
          p1 = points[i]; // Update p1
          p2 = points[j]; // Update p2
          shortestDistance = distance; // Update shortestDistance
        }
      }
    }
    
    // Display results
    System.out.println("The closest two points are " + Arrays.toString(p1) + " and " + Arrays.toString(p2));
  }
  
  /** Compute the distance between two points (x1, y1, z1) and (x2, y2, z2)*/
  public static double distance(double[] a, double[] b) {
    double sum = 0;
    double[] c = new double[a.length];
    //Iterate and get the sum of the squared differences
    for(int i=0;i<a.length;i++) {
      c[i] = Math.pow((b[i] - a[i]),2);
      sum += c[i];
    }
    
    return Math.sqrt(sum);
  }
}