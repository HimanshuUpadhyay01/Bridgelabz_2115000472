public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    
    public Patient(String name, int age, String ailment, String patientID) {
    this.name = name;
    this.age = age;
    this.ailment = ailment;
    this.patientID = patientID;
    totalPatients++;
    }
    
    public static void getTotalPatients() {
    System.out.println("Total patients admitted: " + totalPatients);
    }
    
    public void displayPatientDetails() {
    if (this instanceof Patient) {
    System.out.println("Hospital Name: " + hospitalName);
    System.out.println("Patient Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Ailment: " + ailment);
    System.out.println("Patient ID: " + patientID);
    } else {
    System.out.println("This is not a Patient instance.");
    }
    }
    
    public String getPatientID() {
    return patientID;
    }
    
    public String getName() {
    return name;
    }
    
    public int getAge() {
    return age;
    }
    
    public String getAilment() {
    return ailment;
    }
    
    public static void main(String[] args) {
    Patient patient1 = new Patient("John Doe", 45, "Flu", "P001");
    Patient patient2 = new Patient("Jane Smith", 30, "Cold", "P002");
    patient1.displayPatientDetails();
    patient2.displayPatientDetails();
    Patient.getTotalPatients();
    }
    }
    