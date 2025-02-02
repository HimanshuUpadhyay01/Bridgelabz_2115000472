public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Create a person object using default constructor
        Person person1 = new Person();
        person1.setName("John Doe");
        person1.setAge(30);
        System.out.println("Person 1 Details:");
        person1.displayDetails();

        // Create a person object using parameterized constructor
        Person person2 = new Person("Jane Doe", 25);
        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();

        // Create a person object using copy constructor
        Person person3 = new Person(person1);
        System.out.println("\nPerson 3 Details:");
        person3.displayDetails();
    }
}