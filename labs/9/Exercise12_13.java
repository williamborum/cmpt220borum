//William Borum
//CS 220
//Exercise 12.13
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_13 {
  
  public static int countWords(String line) {
    String trim = line.trim();
    if (trim.isEmpty())
        return 0;
    return trim.split("\\s+").length;
  }
  
  public static void main(String[] args) throws IOException {
    // Check command line parameter usage
    if (args.length != 1) {
      System.out.println("Usage: java Exercise12_13 sourceFile");
      System.exit(1);
    }
    
    File file = new File(args[0]);
    
    // Create a Scanner for the file
    Scanner input = new Scanner(file);
    
    int lines = 0;
    int chars = 0;
    int words = 0;
    
    while(input.hasNext()) {
      String s1 = input.nextLine();
      lines ++;
      chars += s1.length();
      words += countWords(s1);
    }
    
    System.out.println(chars + " characters");
    System.out.println(words + " words");
    System.out.println(lines + " lines\n");
    input.close();
  }
}
