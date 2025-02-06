import java.util.ArrayList;
import java.util.List;
class Hospital{
private String name;
private List<Doctor> doctors;
private List<Patient> patients;
public Hospital(String name){
this.name=name;
doctors=new ArrayList<>();
patients=new ArrayList<>();
}
public void addDoctor(Doctor doctor){
doctors.add(doctor);
}
public void addPatient(Patient patient){
patients.add(patient);
}
public void showDoctors(){
System.out.println("Doctors in "+name+":");
for(Doctor doctor:doctors){
System.out.println(doctor.getName());
}
}
public void showPatients(){
System.out.println("Patients in "+name+":");
for(Patient patient:patients){
System.out.println(patient.getName());
}
}
}
class Doctor{
private String name;
private List<Patient> patients;
public Doctor(String name){
this.name=name;
patients=new ArrayList<>();
}
public String getName(){
return name;
}
public void consult(Patient patient){
patients.add(patient);
System.out.println(name+" is consulting with "+patient.getName());
}
public void showPatients(){
System.out.println(name+" has consulted the following patients:");
for(Patient patient:patients){
System.out.println(patient.getName());
}
}
}
class Patient{
private String name;
private List<Doctor> doctors;
public Patient(String name){
this.name=name;
doctors=new ArrayList<>();
}
public String getName(){
return name;
}
public void visitDoctor(Doctor doctor){
doctors.add(doctor);
doctor.consult(this);
}
public void showDoctors(){
System.out.println(name+" has visited the following doctors:");
for(Doctor doctor:doctors){
System.out.println(doctor.getName());
}
}
}
public class HospitalAndPatients{
public static void main(String[] args){
Hospital hospital=new Hospital("Apollo Hospital");
Doctor doctor1=new Doctor("Dr. Rajesh Verma");
Doctor doctor2=new Doctor("Dr. Priya Mehta");
Patient patient1=new Patient("Anjali Sharma");
Patient patient2=new Patient("Amit Kumar");
hospital.addDoctor(doctor1);
hospital.addDoctor(doctor2);
hospital.addPatient(patient1);
hospital.addPatient(patient2);
patient1.visitDoctor(doctor1);
patient2.visitDoctor(doctor1);
patient2.visitDoctor(doctor2);
hospital.showDoctors();
hospital.showPatients();
doctor1.showPatients();
doctor2.showPatients();
patient1.showDoctors();
patient2.showDoctors();
}
}
