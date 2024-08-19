package OneWeekSession;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("**********Welcome to bank management System************");
       
        System.out.print("\n\nEnter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

       
        Customer customer = new Customer(name, accountNumber);
        account account = new account(accountNumber, customer);

        int choice;
        do {
        	System.out.println("\n\nChoice for account related operation:"
        			+ "\n 1. for deposit"
        			+ "\n 2. for Check balance"
        			+ "\n 3. for withdraw"
        			+ "\n 4. for customer name"
        			+ "\n 5. for Account Number"
        			+ "\n 0. for exit");
        	
        	choice=scanner.nextInt();
        	switch(choice)
        	{
        	case 1:
        		System.out.print("\n\nEnter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
                
        	case 2:
        		System.out.println("\n\nBalance: " + account.getBalance());
        		break;
        		
        	case 3:
        		System.out.print("\nEnter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
                
            case 4:
            	System.out.println("\nCustomer Name: " + account.getCustomer().getName());
            	break;
            	
            case 5:
            	System.out.println("\nCustomer Account Number: " + account.getCustomer().getAccountNumber());
                break;
                
            default:
            	System.out.println("\nPlease choose correct option");
            	
        		}
        }while(choice!=0);
        
        scanner.close();
    }
}
