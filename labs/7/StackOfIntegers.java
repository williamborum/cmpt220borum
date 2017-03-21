//William Borum
//CS 220
//Exercise 10.5
import java.util.Scanner;

public class StackOfIntegers {
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 16;

  /** Construct a stack with the default capacity 16 */
  public StackOfIntegers() {
    this(DEFAULT_CAPACITY);
  }

  /** Construct a stack with the specified maximum capacity */
  public StackOfIntegers(int capacity) {
    elements = new int[capacity];
  }

  /** Push a new integer into the top of the stack */
  public void push(int value) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    elements[size++] = value;
  }

  /** Return and remove the top element from the stack */
  public int pop() {
    return elements[--size];
  }

  /** Return the top element from the stack */
  public int peek() {
    return elements[size - 1];
  }

  /** Test whether the stack is empty */
  public boolean empty() {
    return size == 0;
  }

  /** Return the number of elements in the stack */
  public int getSize() {
    return size;
  }
  
  public String toString() {
    String t = "[";
    for(int i : elements) {
      if(i != 0) t += i+", ";
    }
    if(t!="[") t = t.substring(0, t.length()-2);
    return t += "]";
  }
  
  
  
  public static int getLCF(int num) {
    for(int x=2; x <= num; x++) {
      if(num%x == 0) return x;
    }
    return -1;
  }
  
  public static StackOfIntegers getFactors(int g) {
    int tmp = g;
    StackOfIntegers stack = new StackOfIntegers();
    if(g == 1) stack.push(g);
    while(g > 1) {
      tmp = getLCF(g);
      stack.push(tmp);
      g = g/tmp;
    }
    return stack;
  }
  
  public StackOfIntegers reverseStack(StackOfIntegers tmp) {
    StackOfIntegers stack = new StackOfIntegers();
    while(!tmp.empty()) {
      stack.push(tmp.pop());
    }
    return stack;
  }
  
  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number to find its factors: ");
    
    int number = input.nextInt();
    StackOfIntegers s = getFactors(number);
    
    System.out.println("The factors of " + number + " are " + s.toString());
    System.out.println("The reverse is " + s.reverseStack(s).toString());
  }
}