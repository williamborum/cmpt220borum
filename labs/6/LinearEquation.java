//William Borum
//CS 220
//Exercise 9.11
import java.util.Scanner;

public class LinearEquation {
  private double a=1, b=1, c=1, d=1, e=1, f=1;
  
  public LinearEquation() {
  }
  public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
    a = newA;
    b = newB;
    c = newC;
    d = newD;
    e = newE;
    f = newF;
  }
  
  public double getA() {return a;}
  public double getB() {return b;}
  public double getC() {return c;}
  public double getD() {return d;}
  public double getE() {return e;}
  public double getF() {return f;}
  
  public boolean isSolvable() {
    return (a*d - b*c) != 0;
  }
  public double getX() {
    return (e*d - b*f)/(a*d - b*c);
  }
  public double getY() {
    return (a*f - e*c)/(a*d - b*c);
  }
  
  
  public static void main(String[] args) {

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a, b, c, d, e, and f to find a solution: ");
    
    double na = input.nextDouble();
    double nb = input.nextDouble();
    double nc = input.nextDouble();
    double nd = input.nextDouble();
    double ne = input.nextDouble();
    double nf = input.nextDouble();
    
    LinearEquation l = new LinearEquation(na, nb, nc, nd, ne, nf);
    if(!l.isSolvable()) System.out.println("The equation has no solution.");
    else System.out.println("x = " + l.getX() + " and y = " + l.getY());
  }
}
