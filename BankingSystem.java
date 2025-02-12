abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
    this.accountNumber = accountNumber;
    this.holderName = holderName;
    this.balance = balance;
    }
    public String getAccountNumber() {
    return accountNumber;
    }
    public String getHolderName() {
    return holderName;
    }
    public double getBalance() {
    return balance;
    }
    public void deposit(double amount) {
    balance += amount;
    }
    public void withdraw(double amount) {
    if (amount <= balance) {
    balance -= amount;
    } else {
    System.out.println("Insufficient balance.");
    }
    }
    public abstract double calculateInterest();
    public void displayDetails() {
    System.out.println("Account Number: " + accountNumber + ", Holder Name: " + holderName + ", Balance: " + balance);
    }
    }
    class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
    super(accountNumber, holderName, balance);
    this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest() {
    return getBalance() * interestRate / 100;
    }
    }
    class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
    super(accountNumber, holderName, balance);
    this.overdraftLimit = overdraftLimit;
    }
    @Override
    public double calculateInterest() {
    return 0;
    }
    }
    interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
    }
    class BankingSystem {
    public static void main(String[] args) {
    BankAccount savings = new SavingsAccount("SA123", "YSSUP", 50000, 4);
    BankAccount current = new CurrentAccount("CA456", "KCID", 100000, 50000);
    System.out.println("Details of Bank Accounts:");
    savings.displayDetails();
    System.out.println("Interest: " + savings.calculateInterest());
    current.displayDetails();
    System.out.println("Interest: " + current.calculateInterest());
    }
    }