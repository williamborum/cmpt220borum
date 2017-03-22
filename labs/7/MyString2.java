//William Borum
//CS 220
//Exercise 10.23

public class MyString2 {
  private String s = "";
  
  public MyString2() {
  }
  
  public MyString2(String s) {
    this.s = s;
  }
  
  //Compare the MyString with a given string lexicographically
  public int compare(String s) {
    char[] l = this.s.toCharArray();
    char[] c = s.toCharArray();
    //Step through the two strings and compare at each char
    for(int x = 0; x < Math.min(c.length, l.length); x++) {
      if(c[x] != l[x]) return c[x] - l[x];
    }
    //If reached, the two are either the same string or have the same beginning chars
    if(c.length > l.length) {
      return '9' - c[l.length];
    }
    else if(c.length < l.length) {
      return l[c.length] - '9';
    }
    else return 0;
  }
  
  //Returns a substring of the MyString2 starting at the index given
  public MyString2 substring(int begin) {
    char[] l = this.s.toCharArray();
    String tmp = "";
    for(int x = begin; x < l.length; x++) {
      tmp += l[x];
    }
    MyString2 t = new MyString2(tmp);
    return t;
  }
  
  //Returns the Uppercase of all chars in MyString2
  public MyString2 toUpperCase() {
    char[] l = this.s.toCharArray();
    String tmp = "";
    char a = 'a';
    for(int x = 0; x < l.length; x++) {
      a = Character.toUpperCase(l[x]);
      //System.out.println(a);
      tmp += a;
    }
    MyString2 t = new MyString2(tmp);
    //System.out.println(tmp);
    return t;
  }
  
  //Returns a char[] of the string in MyString2
  public char[] toChars() {
    return this.s.toCharArray();
  }
  
  //Returns the string in MyString2
  public String toString() {
    return this.s;
  }
  
  //Returns a MyString2 of a true or false boolean
  public static MyString2 valueOf(boolean b) {
    MyString2 t = new MyString2("true");
    MyString2 f = new MyString2("false");
    if(b) return t;
    else return f;
  }
  
  
  //Display the results
  public static void main(String[] args) {
    MyString2 h = new MyString2("hello");
    System.out.println(h.compare("opensesame"));
    System.out.println(h.toUpperCase().toString());
    System.out.println(valueOf(h.compare("opensesame") > 0));
    System.out.println(valueOf(h.compare("opensesame") < 0));
    System.out.println(h.toChars());
  }
}
