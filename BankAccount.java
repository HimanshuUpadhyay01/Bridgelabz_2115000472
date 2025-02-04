public class BankAccount {
    private static String bankName = "MyBank";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("This is not a BankAccount instance.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "12345");
        BankAccount account2 = new BankAccount("Bob", "67890");
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
