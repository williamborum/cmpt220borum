//William Borum
//CS 220
//Exercise 11.13
import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
  
  public static ArrayList<Integer> getFactors(Integer integer) {
    ArrayList<Integer> tmp = new ArrayList<>();
    Integer a = 0;
    
    if(integer.equals(1)) tmp.add(integer);
    while(integer > 1) {
      a = getSmallestFactor(integer);
      tmp.add(a);
      integer /= a;
    }
    
    return tmp;
  }
  
  public static Integer getSmallestFactor(Integer integer) {
    if(integer.equals(1)) return integer;
    for(int x = 2; x < integer; x++) {
      if(Integer.remainderUnsigned(integer, x) == 0) return x; 
    }
    return integer;
  }
  
  public static Integer getSmallestN(Integer integer) {
    ArrayList<Integer> factors = getFactors(integer);
    ArrayList<Integer> nFactors = new ArrayList<>();
    for(Integer x : factors) {
      if((isOdd(x, factors)) && (!nFactors.contains(x))) {
        nFactors.add(x); 
      }
    }
    if(nFactors.size() > 0) return multiplyArray(nFactors);
    System.out.println(factors);
    return -1;
  }
  
  public static boolean isOdd(Integer integer, ArrayList<Integer> factors) {
    int numberOfOccurances = 0;
    for(Integer x : factors) {
      if(x.equals(integer)) numberOfOccurances++;
    }
    return numberOfOccurances%2 == 1;
  }
  
  public static Integer multiplyArray(ArrayList<Integer> nFactors) {
    Integer tmp = 1;
    for(Integer y : nFactors) tmp *= y;
    return tmp;
  }
  
  
  public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<>();
    
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer m: ");
    
    Integer m = input.nextInt();
    Integer n = getSmallestN(m);
    
    if(n > 0) {
      System.out.println("The smallest number n for m * n to be a perfect square is " + n);
      System.out.println("m * n is " + m*n);
    }
    else System.out.println("There is no smallest number n for m * n to be a perfect square");
  }

}
