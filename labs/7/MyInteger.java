//William Borum
//CS 220
//Exercise 10.3

public class MyInteger {
  private int value = 0;
  
  MyInteger() {
  }
  
  MyInteger(int newValue) {
    value = newValue;
  }
  
  //Get the value of the MyInteger
  public int getValue() {
    return value;
  }
  
  //Set the value
  public void setValue(int value) {
    this.value = value;
  }
  
  //Returns whether or not the value is even/odd
  public boolean isEven() {return value%2 == 0;}
  public boolean isOdd() {return value%2 == 1;}
  
  //Returns whether or not the value is a prime number
  public boolean isPrime() {
    for(int x=2; x < value; x++) {
      if(value%x == 0) return false;
    }
    return true;
  }
  
  //Returns whether or not the value is even/odd
  public static boolean isEven(int v) {return v%2 == 0;}
  public static boolean isOdd(int v) {return v%2 == 0;}
  
  //Returns whether or not the value is a prime number
  public static boolean isPrime(int v) {
    for(int x=2; x < v; x++) {
      if(v%x == 0) return false;
    }
    return true;
  }
  
  //Returns whether or not the value is even/odd/prime
  public static boolean isEven(MyInteger m) {return m.isEven();}
  public static boolean isOdd(MyInteger m) {return m.isOdd();}
  public static boolean isPrime(MyInteger m) {return m.isPrime();}
  
  //Returns whether or not the value is equal to an integer or MyInteger value
  public boolean equals(int i) {return value == i;}
  public boolean equals(MyInteger m) {return value == m.getValue();}
  
  //Converts a char[] into an integer
  public static int parseInt(char[] p) {
    String tmp = "";
    for(char c : p) {
      int j = Character.getNumericValue(c);
      tmp += j;
    }
    return Integer.parseInt(tmp);
  }
  
  //Converts a String into an integer
  public static int parseInt(String p) {
    return Integer.parseInt(p);
  }
  
  
  //Displays the results given a MyInteger
  public static void displayResults(MyInteger m) {
    System.out.print("We created an integer of value " + m.getValue() + ", which is ");
    if(m.isEven()) System.out.print("even");
    else System.out.print("odd");
    if(m.isPrime()) System.out.print(" and prime");
    System.out.print(". \n");
    
    int a = 4;
    System.out.print("The integer " + a + " is ");
    if(isEven(a)) System.out.print("even");
    else System.out.print("odd");
    if(isPrime(a)) System.out.print(" and prime");
    System.out.print(". \n");
    
    System.out.print("The integer " + a + " is ");
    if(m.equals(a)) System.out.print("equal to " + m.getValue());
    else System.out.print("not equal to " + m.getValue());
    System.out.print(". \n");
    
    MyInteger b = new MyInteger(m.getValue());
    System.out.print("Our created integer " + m.getValue() + " is ");
    if(m.equals(b)) System.out.print("equal to " + b.getValue());
    else System.out.print("not equal to " + b.getValue());
    System.out.print(". \n");
    
    String tmp = "1234";
    char[] tmp2 = {'1','2','3','4'};
    System.out.print("Using parseInt on both a String and char[], we can see " + parseInt(tmp));
    if (parseInt(tmp) == (parseInt(tmp2))) System.out.print(" equals " + parseInt(tmp2));
    else System.out.print(" does not equal " + parseInt(tmp2));
    System.out.print(". \n");
    
  }
  
  //Display the results
  public static void main(String[] args) {
    MyInteger m = new MyInteger(7);
    displayResults(m);
  }
}
