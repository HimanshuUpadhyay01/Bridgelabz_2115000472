import java.util.ArrayList;
import java.util.List;
class University{
private String name;
private List<Department> departments;
public University(String name){
this.name=name;
departments=new ArrayList<>();
}
public void addDepartment(Department department){
departments.add(department);
}
public void deleteUniversity(){
departments.clear();
}
public void showDepartments(){
System.out.println("Departments in "+name+":");
for(Department department:departments){
System.out.println(department.getDepartmentName());
}
}
}
class Department{
private String departmentName;
private List<Faculty> facultyMembers;
public Department(String departmentName){
this.departmentName=departmentName;
facultyMembers=new ArrayList<>();
}
public String getDepartmentName(){
return departmentName;
}
public void addFaculty(Faculty faculty){
facultyMembers.add(faculty);
}
public void showFaculty(){
System.out.println("Faculty in "+departmentName+" Department:");
for(Faculty faculty:facultyMembers){
System.out.println(faculty.getFacultyName());
}
}
}
class Faculty{
private String facultyName;
public Faculty(String facultyName){
this.facultyName=facultyName;
}
public String getFacultyName(){
return facultyName;
}
}
public class UniversityWithFaculty{
public static void main(String[] args){
University university=new University("Bharati Vidyapeeth University");
Department csDepartment=new Department("Computer Science");
Department eeDepartment=new Department("Electrical Engineering");
Faculty faculty1=new Faculty("Dr. Rajesh Kumar");
Faculty faculty2=new Faculty("Dr. Priya Sharma");
Faculty faculty3=new Faculty("Dr. Amit Singh");
csDepartment.addFaculty(faculty1);
eeDepartment.addFaculty(faculty2);
eeDepartment.addFaculty(faculty3);
university.addDepartment(csDepartment);
university.addDepartment(eeDepartment);
university.showDepartments();
csDepartment.showFaculty();
eeDepartment.showFaculty();
university.deleteUniversity();
university.showDepartments();
}
}
