import java.util.ArrayList;
class Company{
private ArrayList<Department> departments;
public Company(){
departments=new ArrayList<>();
}
public void addDepartment(Department department){
departments.add(department);
}
public void showDepartments(){
System.out.println("Departments in Company:");
for(Department department:departments){
System.out.println(department.getName());
}
}
public void deleteCompany(){
departments.clear();
}
}
class Department{
private String name;
private ArrayList<Employee> employees;
public Department(String name){
this.name=name;
employees=new ArrayList<>();
}
public String getName(){
return name;
}
public void addEmployee(Employee employee){
employees.add(employee);
}
public void removeEmployees(){
employees.clear();
}
}
class Employee{
private String name;
public Employee(String name){
this.name=name;
}
public String getName(){
return name;
}
}
public class CompanyAndDepartment{
public static void main(String[] args){
Company company=new Company();
Department department1=new Department("HR");
Department department2=new Department("IT");
Employee employee1=new Employee("Alice");
Employee employee2=new Employee("Bob");
Employee employee3=new Employee("Charlie");
department1.addEmployee(employee1);
department2.addEmployee(employee2);
department2.addEmployee(employee3);
company.addDepartment(department1);
company.addDepartment(department2);
company.showDepartments();
company.deleteCompany();
company.showDepartments();
}
}
