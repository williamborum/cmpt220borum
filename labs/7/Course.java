//William Borum
//CS 220
//Exercise 10.9

public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
  
  //Create course
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  //Add student to course
  public void addStudent(String student) {
    if (numberOfStudents >= students.length) {
      String[] temp = new String[students.length * 2];
      System.arraycopy(students, 0, temp, 0, students.length);
      students = temp;
    }
    
    students[numberOfStudents++] = student;
  }
  
  //Get the list of students
  public String[] getStudents() {
    return students;
  }
  
  //Get the number of students
  public int getNumberOfStudents() {
    return numberOfStudents;
  }
  
  //Get the course name
  public String getCourseName() {
    return courseName;
  }
  
  //Drop a student from course
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
  
  //Drop all students from course
  public void clear() {
    String[] temp = new String[students.length];
    System.arraycopy(temp, 0, students, 0, students.length);
  }
  
  //Returns a nicely formatted list of the students in course
  public String toString() {
    String t = "[";
    for(String i : students) {
      if(i != null) t += i+", ";
    }
    if(t!="[") t = t.substring(0, t.length()-2);
    return t += "]";
  }
  
  
  public static void main(String[] args) {
    //Display the results
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
