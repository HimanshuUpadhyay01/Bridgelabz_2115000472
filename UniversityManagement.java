import java.util.ArrayList;
import java.util.List;
class University{
private String name;
private List<Student> students;
private List<Professor> professors;
public University(String name){
this.name=name;
students=new ArrayList<>();
professors=new ArrayList<>();
}
public void addStudent(Student student){
students.add(student);
}
public void addProfessor(Professor professor){
professors.add(professor);
}
public void showStudents(){
System.out.println("Students in "+name+":");
for(Student student:students){
System.out.println(student.getName());
}
}
public void showProfessors(){
System.out.println("Professors in "+name+":");
for(Professor professor:professors){
System.out.println(professor.getName());
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
public void enrollCourse(Course course){
courses.add(course);
course.addStudent(this);
System.out.println(name+" enrolled in "+course.getCourseName());
}
public void showCourses(){
System.out.println(name+" is enrolled in the following courses:");
for(Course course:courses){
System.out.println(course.getCourseName());
}
}
}
class Professor{
private String name;
private List<Course> courses;
public Professor(String name){
this.name=name;
courses=new ArrayList<>();
}
public String getName(){
return name;
}
public void assignProfessor(Course course){
courses.add(course);
course.setProfessor(this);
System.out.println(name+" is assigned to teach "+course.getCourseName());
}
public void showCourses(){
System.out.println(name+" teaches the following courses:");
for(Course course:courses){
System.out.println(course.getCourseName());
}
}
}
class Course{
private String courseName;
private List<Student> students;
private Professor professor;
public Course(String courseName){
this.courseName=courseName;
students=new ArrayList<>();
}
public String getCourseName(){
return courseName;
}
public void addStudent(Student student){
students.add(student);
}
public void setProfessor(Professor professor){
this.professor=professor;
}
public void showDetails(){
System.out.println("Course: "+courseName);
if(professor!=null){
System.out.println("Taught by: "+professor.getName());
}
System.out.println("Enrolled students:");
for(Student student:students){
System.out.println(student.getName());
}
}
}
public class UniversityManagement{
public static void main(String[] args){
University university=new University("Tech University");
Student student1=new Student("Rahul Sharma");
Student student2=new Student("Priya Desai");
Professor professor1=new Professor("Dr. Ramesh Kumar");
Professor professor2=new Professor("Dr. Sunita Mehta");
Course course1=new Course("Computer Science 101");
Course course2=new Course("Mathematics 101");
course1.setProfessor(professor1);
course2.setProfessor(professor2);
student1.enrollCourse(course1);
student1.enrollCourse(course2);
student2.enrollCourse(course1);
professor1.assignProfessor(course1);
professor2.assignProfessor(course2);
university.addStudent(student1);
university.addStudent(student2);
university.addProfessor(professor1);
university.addProfessor(professor2);
university.showStudents();
university.showProfessors();
course1.showDetails();
course2.showDetails();
student1.showCourses();
student2.showCourses();
professor1.showCourses();
professor2.showCourses();
}
}
