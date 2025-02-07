class Person{
    String name;
    int age;
    Person(String name,int age){
    this.name=name;
    this.age=age;
    }
    void displayRole(){
    System.out.println("Person");
    }
    }
    
    class Teacher extends Person{
    String subject;
    Teacher(String name,int age,String subject){
    super(name,age);
    this.subject=subject;
    }
    void displayRole(){
    System.out.println("Teacher");
    }
    }
    
    class Student extends Person{
    int grade;
    Student(String name,int age,int grade){
    super(name,age);
    this.grade=grade;
    }
    void displayRole(){
    System.out.println("Student");
    }
    }
    
    class Staff extends Person{
    String position;
    Staff(String name,int age,String position){
    super(name,age);
    this.position=position;
    }
    void displayRole(){
    System.out.println("Staff");
    }
    }
    
    public class SchoolSystem{
    public static void main(String[] args){
    Person person = new Person("John", 30);
    Teacher teacher = new Teacher("Mr. Smith", 40, "Math");
    Student student = new Student("Alice", 16, 10);
    Staff staff = new Staff("David", 50, "Janitor");
    
    person.displayRole();
    teacher.displayRole();
    student.displayRole();
    staff.displayRole();
    }
    }
    