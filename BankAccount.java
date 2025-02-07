class Ba{
    String accountNumber;
    double balance;
    Ba(String accountNumber,double balance){
    this.accountNumber=accountNumber;
    this.balance=balance;
    }
    void displayAccountType(){
    System.out.println("Bank Account");
    }
    }
    
    class SavingsAccount extends Ba{
    double interestRate;
    SavingsAccount(String accountNumber,double balance,double interestRate){
    super(accountNumber,balance);
    this.interestRate=interestRate;
    }
    void displayAccountType(){
    System.out.println("Savings Account");
    }
    }
    
    class CheckingAccount extends Ba{
    double withdrawalLimit;
    CheckingAccount(String accountNumber,double balance,double withdrawalLimit){
    super(accountNumber,balance);
    this.withdrawalLimit=withdrawalLimit;
    }
    void displayAccountType(){
    System.out.println("Checking Account");
    }
    }
    
    class FixedDepositAccount extends Ba{
    int maturityPeriod;
    FixedDepositAccount(String accountNumber,double balance,int maturityPeriod){
    super(accountNumber,balance);
    this.maturityPeriod=maturityPeriod;
    }
    void displayAccountType(){
    System.out.println("Fixed Deposit Account");
    }
    }
    
    public class BankAccount{
    public static void main(String[] args){
    Ba bankAccount = new Ba("A001", 5000);
    SavingsAccount savingsAccount = new SavingsAccount("S001", 10000, 5.5);
    CheckingAccount checkingAccount = new CheckingAccount("C001", 2000, 1500);
    FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("F001", 20000, 12);
    
    bankAccount.displayAccountType();
    savingsAccount.displayAccountType();
    checkingAccount.displayAccountType();
    fixedDepositAccount.displayAccountType();
    }
    }
    