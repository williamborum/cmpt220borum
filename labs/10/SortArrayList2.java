//William Borum
//CS 220
//Exercise 11.11
import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList2 {
  
  public static void sort(ArrayList<Number> list) {
    if(list.isEmpty());
    else {
      ArrayList<Number> tmp = new ArrayList<>();
      Number Number = 0;
      while(!list.isEmpty()){
        Number = getMin(list);
        tmp.add(Number);
        list.remove(Number);
      }
      list.addAll(tmp);
    }
  }
  
  public static Number getMin(ArrayList<Number> tmp) {
    
    if(tmp.isEmpty()) return null;
    else {
      Number min = tmp.get(0);
      for(int i = 0; i < tmp.size(); i++) {
        if(tmp.get(i).doubleValue() < min.doubleValue()) min = tmp.get(i);
      }
      return min;
    }
  }
  
  public static void removeDuplicate(ArrayList<Number> list) {
    for(int x = 0; x < list.size(); x++) {
      if(isDuplicate(x, list)) list.remove(x);
    }
  }
  
  public static boolean isDuplicate(int index, ArrayList<Number> tmp) {
    if(index != tmp.size() - 1) {
      for(int i = index + 1; i < tmp.size(); i++) {
        if(tmp.get(index).equals(tmp.get(i))) return true;
      }
    }
    return false;
  }
  
  public static void main(String[] args) {
    ArrayList<Number> myList = new ArrayList<>();
    
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter five numbers to sort: ");
    
    Number n1 = input.nextInt();
    Number n2 = input.nextInt();
    Number n3 = input.nextInt();
    Number n4 = input.nextInt();
    Number n5 = input.nextInt();
    
    
    myList.add(n1);
    myList.add(n2);
    myList.add(n3);
    myList.add(n4);
    myList.add(n5);
    System.out.println("The starting list is " + myList);
    sort(myList);
    System.out.println("The sorted list is " + myList);
  }
}
