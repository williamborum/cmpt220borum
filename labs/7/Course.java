//William Borum
//CS 220
//Exercise 10.9

public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
  
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    if (numberOfStudents >= students.length) {
      String[] temp = new String[students.length * 2];
      System.arraycopy(students, 0, temp, 0, students.length);
      students = temp;
    }
    
    students[numberOfStudents++] = student;
  }
  public String[] getStudents() {
    return students;
  }
  
  public int getNumberOfStudents() {
    return numberOfStudents;
  }
  
  public String getCourseName() {
    return courseName;
  }
  
  public void dropStudent(String student) {
    String[] temp = new String[students.length];
    int y = 0;
    for(int x = 0; x < numberOfStudents; x++) {
      if(!students[x].equals(student)) {
        temp[y] = students[x];
        y++;
      }
    }
    
    System.arraycopy(temp, 0, students, 0, students.length);
  }
  
  public void clear() {
    String[] temp = new String[students.length];
    System.arraycopy(temp, 0, students, 0, students.length);
  }
  
  public String toString() {
    String t = "[";
    for(String i : students) {
      if(i != null) t += i+", ";
    }
    if(t!="[") t = t.substring(0, t.length()-2);
    return t += "]";
  }
  
  
  public static void main(String[] args) {
    Course c = new Course("Math");
    c.addStudent("Tim");
    c.addStudent("Mary");
    c.addStudent("Richard");
    System.out.println("The students in " + c.getCourseName() + " class are " + c.toString());
    
    c.dropStudent("Mary");
    System.out.println("The students in " + c.getCourseName() + " class are " + c.toString());
    
    c.clear();
    System.out.println("The students in " + c.getCourseName() + " class are " + c.toString());
  }
}