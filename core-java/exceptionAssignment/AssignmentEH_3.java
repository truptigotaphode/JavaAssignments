package exceptionAssignment;


public class AssignmentEH_3 {
	public static void main(String[] args) {
        SavingAccount savingAcc = new SavingAccount(1800345, 5000);

        try {
            double withdrawnAmount = savingAcc.withdraw(5100);
            System.out.println("Withdrawn: " + withdrawnAmount);
        } catch (InsufficientBalanceException | IllegalBankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double withdrawnAmount = savingAcc.withdraw(10000);
            System.out.println("Withdrawn: " + withdrawnAmount);
        } catch (InsufficientBalanceException | IllegalBankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class IllegalBankTransactionException extends Exception {
    public IllegalBankTransactionException(String message) {
        super(message);
    }
}

class SavingAccount {
    private long id;
    private double balance;

    public SavingAccount(long id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    public double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if (amount < 0) {
            throw new IllegalBankTransactionException("Withdraw amount cannot be negative.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
        }

        if (balance == 0) {
            throw new InsufficientBalanceException("Balance is zero, cannot withdraw.");
        }

        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }
}

