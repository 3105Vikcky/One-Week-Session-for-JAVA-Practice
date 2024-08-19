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
            System.out.println("\nInvalid deposit amount");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("\nWithdrew: " + amount);
        } else {
            System.out.println("\nInsufficient balance or invalid withdrawal amount");
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