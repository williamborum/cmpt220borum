public class textexercise1_4borum {
  public static void main(String[] args) {
    //Create and display table header
    System.out.println("\ta \ta^2 \ta^3");
    //Initialize an integer of 1 and increment up to and including 4
    for(int i=1; i<5; i++){
      //Display the number, its square, and cube in the appropriate column
      System.out.println("\t"+i+"\t"+i*i+"\t"+i*i*i);
    }
  }
}
