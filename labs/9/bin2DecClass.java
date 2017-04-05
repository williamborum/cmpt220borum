//William Borum
//CS 220
//Exercise 12.7

public class bin2DecClass {
  
  public static int bin2Dec(String binary) throws java.lang.NumberFormatException {
    int decimal = 0;
    if(!isBinary(binary)) throw new java.lang.NumberFormatException(binary);
    else {
      decimal = convert(binary);
    }
    return decimal;
  }
  
  private static int convert(String binary) {
    int r = 0;
    
    for(int x = 0; x < binary.length(); x ++) {
      r += (binary.toCharArray()[x]-'0') * Math.pow(2, binary.length() - x - 1);
    }
    
    return r;
  }

  public static boolean isBinary(String binary) {
    for(char c : binary.toCharArray()) {
      if(c != '0' && c != '1') return false;
    }
    return true;
  }
  
  
  
  
  public static void main(String[] args) {
    System.out.println(bin2Dec("0101011"));
    System.out.println(bin2Dec("0103571"));
  }
}
