package OneWeekSession;

public class account {
	//account attribute
    private String accountNumber;
    private double balance;
    private Customer customer;

    
    public account(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
    }

    //deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("\nDeposited: " + amount);
        } else {
            throw new NegativeDeposit("Users should not be able to deposit a negative amount of money.");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("\nWithdrew: " + amount);
        } else {
             throw new InsufficientException("Users should not be able to withdraw more money than what \r\n"
             		+ "//   is available in their account");  
        }
    }

  
    public double getBalance() {
        return balance;
    }

    
    public Customer getCustomer() {
        return customer;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }
}