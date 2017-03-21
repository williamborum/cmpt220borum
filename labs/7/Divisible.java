//William Borum
//CS 220
//Exercise 10.21
import java.math.BigInteger;

public class Divisible {
  
  public static BigInteger[] divBy(int x, int y) {
    int z = 0;
    BigInteger a = new BigInteger("9223372036854775807");
    BigInteger b = new BigInteger("1");
    BigInteger c = new BigInteger(Integer.toString(x));
    BigInteger d = new BigInteger(Integer.toString(y));
    BigInteger e = new BigInteger("0");
    BigInteger[] tmp = new BigInteger[10];
    
    while(z<10) {
      a = a.add(b);
      if(a.divideAndRemainder(c)[1].equals(e)) tmp[z] = a;
      else if(a.divideAndRemainder(d)[1].equals(e)) tmp[z] = a;
      else z--;
      z++;
    }
    return tmp;
  }
  
  public static String toStrings(BigInteger[] tmp) {
    String s = "[";
    for(BigInteger num : tmp) {
      if(num != null) s += num.toString() + ", ";
    }
    if(s!="[") s = s.substring(0, s.length()-2);
    return s += "]";
  }
  
  
  
  public static void main(String[] args) {
    System.out.println("The first ten numbers greater than Long.MAX_VALUE are " + toStrings(divBy(5, 6)));
  }
}
