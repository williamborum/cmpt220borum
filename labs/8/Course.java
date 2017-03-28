//William Borum
//CS 220
//Exercise 11.5
import java.util.ArrayList;

public class Course {
  private String courseName;
  private ArrayList<String> students = new ArrayList<>();
  private int numberOfStudents;
  
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    students.add(student);
  }
  public ArrayList<String> getStudents() {
    return students;
  }
  
  public int getNumberOfStudents() {
    return numberOfStudents;
  }
  
  public String getCourseName() {
    return courseName;
  }
  
  public void dropStudent(String student) {
    students.remove(student);
  }
  
  public void clear() {
    students = new ArrayList<>();
  }
  
  public String toString() {
    return students.toString();
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