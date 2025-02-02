class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    void setBalance(double balance) {
    this.balance = balance;
    }
    double getBalance() {
    return balance;
    }
    public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.accountNumber = 12345;
    account.accountHolder = "Emma Watson";
    account.setBalance(1500.00);
    System.out.println("Account Number: " + account.accountNumber);
    System.out.println("Account Holder: " + account.accountHolder);
    System.out.println("Balance: " + account.getBalance());
    }
    }
    class SavingsAccount extends BankAccount {}