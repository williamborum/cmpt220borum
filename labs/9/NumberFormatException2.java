//William Borum
//CS 220
//Exercise 12.1

public class NumberFormatException2 {
  
  /** Main method */
  public static void main(String[] args) {
    
    // Check number of strings passed
    if (args.length != 3) {
      System.out.println("Usage: java Calculator operand1 operator operand2");
      System.exit(0);
    }
    
    // The result of the operation
    int result = 0;
    
    if(args[0].matches("^-?\\d+$") && args[2].matches("^-?\\d+$")) {
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
    else {
      System.out.print("Wrong input: ");
      if(!args[0].matches("^-?\\d+$")) System.out.print(args[0] + " ");
      if(!args[2].matches("^-?\\d+$")) System.out.print(args[2]);
      System.out.print("\n");
    }
  }
}