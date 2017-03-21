//William Borum
//CS 220
//Exercise 10.21
import java.math.BigInteger;

public class Divisible {
  
  //Returns a list of size 10 of BigIntegers that are bigger than Long.MAX_VALUE
  //and are divisible by either x or y
  public static BigInteger[] divBy(int x, int y) {
    int z = 0;
    BigInteger a = new BigInteger("9223372036854775807");
    BigInteger b = new BigInteger("1");
    BigInteger c = new BigInteger(Integer.toString(x));
    BigInteger d = new BigInteger(Integer.toString(y));
    BigInteger e = new BigInteger("0");
    BigInteger[] tmp = new BigInteger[10];
    
    //Step through until the list has 10 entries
    while(z<10) {
      a = a.add(b);
      //Check if the number is divisible by either x or y and add to the list
      if(a.divideAndRemainder(c)[1].equals(e)) tmp[z] = a;
      else if(a.divideAndRemainder(d)[1].equals(e)) tmp[z] = a;
      else z--;
      z++;
    }
    return tmp;
  }
  
  //Returns a nicely formatted list of a given list of BigIntegers
  public static String toStrings(BigInteger[] tmp) {
    String s = "[";
    for(BigInteger num : tmp) {
      if(num != null) s += num.toString() + ", ";
    }
    if(s!="[") s = s.substring(0, s.length()-2);
    return s += "]";
  }
  
  
  
  public static void main(String[] args) {
    //Display the results
    System.out.println("The first ten numbers greater than Long.MAX_VALUE are " + toStrings(divBy(5, 6)));
  }
}
