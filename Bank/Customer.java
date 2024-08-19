package OneWeekSession;


public class Customer {
	//attribute of customer
    private String name;
    private String accountNumber;
    

   //constructor
    public Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        
    }

    //get method
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public String getName() {
        return name;
    }

   
  
}

