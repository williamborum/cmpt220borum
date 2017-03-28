//William Borum
//CS 220
//Exercise 11.11
import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
  
  public static void sort(ArrayList<Integer> list) {
    if(list.isEmpty());
    else {
      ArrayList<Integer> tmp = new ArrayList<>();
      Integer integer = 0;
      while(!list.isEmpty()){
        integer = getMin(list);
        tmp.add(integer);
        list.remove(integer);
      }
      list.addAll(tmp);
    }
  }
  
  public static Integer getMin(ArrayList<Integer> tmp) {
    
    if(tmp.isEmpty()) return null;
    else {
      Integer min = tmp.get(0);
      for(int i = 0; i < tmp.size(); i++) {
        if(tmp.get(i) < min) min = tmp.get(i);
      }
      return min;
    }
  }
  
  public static void removeDuplicate(ArrayList<Integer> list) {
    for(int x = 0; x < list.size(); x++) {
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
    System.out.println("Enter five numbers to sort: ");
    
    Integer n1 = input.nextInt();
    Integer n2 = input.nextInt();
    Integer n3 = input.nextInt();
    Integer n4 = input.nextInt();
    Integer n5 = input.nextInt();
    
    
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
