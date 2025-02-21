class InsufficientBalanceException extends Exception {
}

public class BankAccountSystem {
private double balance;

public BankAccountSystem(double balance) {
this.balance = balance;
}

public void withdraw(double amount) throws InsufficientBalanceException {
if (amount < 0) {
throw new IllegalArgumentException("Invalid amount!");
}
if (amount > balance) {
throw new InsufficientBalanceException();
}
balance -= amount;
}

public double getBalance() {
return balance;
}

public static void main(String[] args) {
BankAccountSystem account = new BankAccountSystem(1000); // Initial balance
try {
System.out.print("Enter withdrawal amount: ");
java.util.Scanner scanner = new java.util.Scanner(System.in);
double amount = scanner.nextDouble();
account.withdraw(amount);
System.out.println("Withdrawal successful, new balance: " + account.getBalance());
} catch (InsufficientBalanceException e) {
System.out.println("Insufficient balance!");
} catch (IllegalArgumentException e) {
System.out.println(e.getMessage());
} finally {
}
}
}
