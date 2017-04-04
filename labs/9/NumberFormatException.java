//William Borum
//CS 220
//Exercise 12.1

public class NumberFormatException {
  
  /** Main method */
  public static void main(String[] args) {
    
    // Check number of strings passed
    if (args.length != 3) {
      System.out.println("Usage: java Calculator operand1 operator operand2");
      System.exit(0);
    }
    
    // The result of the operation
    int result = 0;
    
    try {
      // Determine the operator
      switch (args[1].charAt(0)) {
        case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
          break; 
        case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
          break;
        case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
          break;
        case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
      }
      
      // Display result
      System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
    catch (java.lang.NumberFormatException e) {
      System.out.println("Wrong input: " + e);
    }
  }
}