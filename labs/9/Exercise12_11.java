//William Borum
//CS 220
//Exercise 12.11
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_11 {
  
  public static void main(String[] args) throws IOException {
    // Check command line parameter usage
    if (args.length != 2) {
      System.out.println("Usage: java Exercise12_11 removeString sourceFile");
      System.exit(1);
    }
    
    File file = new File(args[1]);
    File temp = new File("tmp.txt");
    
    // Create a Scanner for the file
    Scanner input = new Scanner(file);
    
    FileWriter output = new FileWriter(temp);
    
    while(input.hasNext()) {
      String s1 = input.nextLine();
      String s2 = s1.replaceAll(args[0], "");
      System.out.println(s2);
      output.write(s2 + "\n");
    }
    input.close();
    output.close();
    file.delete();
    temp.renameTo(file);
  }
}
