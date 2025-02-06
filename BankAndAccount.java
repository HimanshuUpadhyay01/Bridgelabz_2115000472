import java.util.ArrayList;
class Bank{
private ArrayList<Customer> customers;
public Bank(){
customers=new ArrayList<>();
}
public void openAccount(Customer customer){
customers.add(customer);
}
public void showCustomers(){
System.out.println("Customers in Bank:");
for(Customer customer:customers){
System.out.println(customer.getName());
}
}
}
class Customer{
private String name;
private ArrayList<Account> accounts;
public Customer(String name){
this.name=name;
accounts=new ArrayList<>();
}
public String getName(){
return name;
}
public void openAccount(Account account){
accounts.add(account);
}
public void viewBalance(){
for(Account account:accounts){
System.out.println("Account Balance: "+account.getBalance());
}
}
}
class Account{
private double balance;
public Account(double balance){
this.balance=balance;
}
public double getBalance(){
return balance;
}
}
public class BankAndAccount{
public static void main(String[] args){
Bank bank=new Bank();
Customer customer1=new Customer("John Doe");
Customer customer2=new Customer("Jane Smith");
Account account1=new Account(1000.00);
Account account2=new Account(5000.00);
customer1.openAccount(account1);
customer2.openAccount(account2);
bank.openAccount(customer1);
bank.openAccount(customer2);
bank.showCustomers();
customer1.viewBalance();
customer2.viewBalance();
}
}
