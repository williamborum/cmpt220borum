//William Borum
//CS 220
//Exercise 5.5
public class Ex5_5Borum {
  public static void main(String[] args) {
    //Start with 20 pounds on the right side of the table
    int p =20;
    
    //Create header
    System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
    
    //Loop until kilograms is not less than 200, add 2 each iteration
    for(int i = 1; i < 200; i += 2){
      //Print each row with appropriate conversions
      System.out.println(i + "\t\t" + Math.round(2.2 * i * 10.0) / 10.0 + "\t|\t" + p + "\t" + Math.round((p / 2.2) * 100.0) / 100.0);
      
      //Add 5 pounds to the right side of the table
      p += 5;
    }
  }
}
