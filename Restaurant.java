interface Worker{
    void performDuties();
    }
    
    class Person{
    String name;
    int id;
    Person(String name,int id){
    this.name=name;
    this.id=id;
    }
    }
    
    class Chef extends Person implements Worker{
    String specialty;
    Chef(String name,int id,String specialty){
    super(name,id);
    this.specialty=specialty;
    }
    public void performDuties(){
    System.out.println("Chef " + name + " is preparing " + specialty + ".");
    }
    }
    
    class Waiter extends Person implements Worker{
    String section;
    Waiter(String name,int id,String section){
    super(name,id);
    this.section=section;
    }
    public void performDuties(){
    System.out.println("Waiter " + name + " is serving customers in section " + section + ".");
    }
    }
    
    public class Restaurant{
    public static void main(String[] args){
    Person chef = new Chef("Gordon", 101, "Italian Cuisine");
    Person waiter = new Waiter("Rachel", 102, "A");
    
    ((Worker)chef).performDuties();
    ((Worker)waiter).performDuties();
    }
    }
    