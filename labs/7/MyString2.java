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
  
  public int compare(String s) {
    char[] l = this.s.toCharArray();
    char[] c = s.toCharArray();
    for(int x = 0; x < c.length; x++) {
      if(c[x] != l[x]) return c[x] - l[x];
    }
    return 0;
  }
  
  public MyString2 substring(int begin) {
    char[] l = this.s.toCharArray();
    String tmp = "";
    for(int x = begin; x < l.length; x++) {
      tmp += l[x];
    }
    MyString2 t = new MyString2(tmp);
    return t;
  }
  
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
  
  public char[] toChars() {
    return this.s.toCharArray();
  }
  
  public String toString() {
    return this.s;
  }
  
  public static MyString2 valueOf(boolean b) {
    MyString2 t = new MyString2("true");
    MyString2 f = new MyString2("false");
    if(b) return t;
    else return f;
  }
  
  
  public static void main(String[] args) {
    MyString2 h = new MyString2("hello");
    System.out.println(h.compare("opensesame"));
    System.out.println(h.toUpperCase().toString());
    System.out.println(valueOf(h.compare("opensesame") > 0));
    System.out.println(valueOf(h.compare("opensesame") < 0));
    System.out.println(h.toChars());
  }
}
