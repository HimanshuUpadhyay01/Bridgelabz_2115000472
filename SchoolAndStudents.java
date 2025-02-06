import java.util.ArrayList;
import java.util.List;
class School{
private String name;
private List<Student> students;
public School(String name){
this.name=name;
students=new ArrayList<>();
}
public void addStudent(Student student){
students.add(student);
}
public void showStudents(){
System.out.println("Students in "+name+":");
for(Student student:students){
System.out.println(student.getName());
}
}
}
class Student{
private String name;
private List<Course> courses;
public Student(String name){
this.name=name;
courses=new ArrayList<>();
}
public String getName(){
return name;
}
public void enrollInCourse(Course course){
if(!courses.contains(course)){
courses.add(course);
course.addStudent(this);
}
}
public void showEnrolledCourses(){
System.out.println(name+" is enrolled in the following courses:");
for(Course course:courses){
System.out.println(course.getCourseName());
}
}
}
class Course{
private String courseName;
private List<Student> students;
public Course(String courseName){
this.courseName=courseName;
students=new ArrayList<>();
}
public String getCourseName(){
return courseName;
}
public void addStudent(Student student){
if(!students.contains(student)){
students.add(student);
}
}
public void showEnrolledStudents(){
System.out.println("Students enrolled in "+courseName+":");
for(Student student:students){
System.out.println(student.getName());
}
}
}
public class SchoolAndStudents{
public static void main(String[] args){
School school=new School("ABC High School");
Student student1=new Student("John Doe");
Student student2=new Student("Jane Smith");
Course course1=new Course("Math 101");
Course course2=new Course("Science 101");
student1.enrollInCourse(course1);
student1.enrollInCourse(course2);
student2.enrollInCourse(course1);
school.addStudent(student1);
school.addStudent(student2);
school.showStudents();
student1.showEnrolledCourses();
student2.showEnrolledCourses();
course1.showEnrolledStudents();
course2.showEnrolledStudents();
}
}
