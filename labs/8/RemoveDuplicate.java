//William Borum
//CS 220
//Exercise 11.13
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
  
  public static void removeDuplicate(ArrayList<Integer> list) {
    for(int x = list.size(); x >= 0; x--) {
      if(isDuplicate(x, list)) list.remove(x);
    }
  }
  
  public static boolean isDuplicate(int index, ArrayList<Integer> tmp) {
    if(index != tmp.size() - 1) {
      for(int i = index + 1; i < tmp.size(); i++) {
        if(tmp.get(index).equals(tmp.get(i))) return true;
      }
    }
    return false;
  }
  
  public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<>();
    
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter ten integers to remove duplicates: ");
    
    Integer n1 = input.nextInt();
    Integer n2 = input.nextInt();
    Integer n3 = input.nextInt();
    Integer n4 = input.nextInt();
    Integer n5 = input.nextInt();
    Integer n6 = input.nextInt();
    Integer n7 = input.nextInt();
    Integer n8 = input.nextInt();
    Integer n9 = input.nextInt();
    Integer n0 = input.nextInt();
    
    
    myList.add(n1);
    myList.add(n2);
    myList.add(n3);
    myList.add(n4);
    myList.add(n5);
    myList.add(n6);
    myList.add(n7);
    myList.add(n8);
    myList.add(n9);
    myList.add(n0);
    System.out.println("The starting list is " + myList);
    removeDuplicate(myList);
    System.out.println("The list with no duplicates is " + myList);
  }
}
