//You are a software developer working on a customer management system for a retail company. 
//The company wants to maintain a list of customers and perform various operations on this list. 
//Each customer has a unique ID, name, and email. The company needs to perform the following 
//operations:
//1. Add a Customer: Add a new customer to the list.
//2. Remove a Customer: Remove a customer from the list using their ID.
//3. Search for a Customer: Search for a customer by their ID and return their details.
//4. List All Customers: Display all customers in the list.
//5. Sort Customers by Name: Sort the customers alphabetically by their name.
//6. Sort Customers by ID: Sort the customers numerically by their ID.

package OneWeekSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerManagementSystem {
	
	private static List<customer> cust = new ArrayList<>();

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("*********Welcome to Customer Management System**********");
			System.out.println("\n1. Add Customer");
			System.out.println("2. Remove Customer");
			System.out.println("3. Search Customer");
			System.out.println("4. List of all Customer");
			System.out.println("5. Sort customers by name");
			System.out.println("6. Sort customers by ID");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				addCustomer(sc);
                break;
            case 2:
                removeCustomer(sc);
                break;
            case 3:
                searchCustomer(sc);
                break;
            case 4:
                listAllCustomers();
                break;
            case 5:
                sortCustomersByName();
                break;
            case 6:
                sortCustomersById();
                break;
            case 7:
                System.out.println("Exiting...");
                sc.close();
                return;
            default:
                System.out.println("Invalid option. Please try again.");
			}
		}
		
		
	}
	
	
	// for adding customer in array list
	private static void addCustomer(Scanner scanner) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        customer newCustomer = new customer(id, name, email);
        cust.add(newCustomer);
        System.out.println("Customer added successfully.");
    }

	
	
	//remove customer from list
    private static void removeCustomer(Scanner scanner) {
        System.out.print("Enter Customer ID to remove: ");
        int id = scanner.nextInt();
        customer customerToRemove = null;
        for (customer customers : cust) {
            if (customers.id == id) {
                customerToRemove = customers;
                break;
            }
        }
        if (customerToRemove != null) {
            cust.remove(customerToRemove);
            System.out.println("Customer removed successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    
    //Search customers by id
    private static void searchCustomer(Scanner scanner) {
        System.out.print("Enter Customer ID to search: ");
        int id = scanner.nextInt();
        for (customer customers : cust) {
            if (customers.id == id) {
                System.out.println(customers);
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    
    //List of all customers 
    private static void listAllCustomers() {
        if (cust.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (customer customers : cust) {
                System.out.println(customers);
            }
        }
    }

    
    // sorting by name
    private static void sortCustomersByName() {
        Collections.sort(cust, Comparator.comparing(customer -> customer.name));
        System.out.println("Customers sorted by name.");
    }

    
    //sorting by id
    private static void sortCustomersById() {
        Collections.sort(cust, Comparator.comparingInt(customer -> customer.id));
        System.out.println("Customers sorted by ID.");
    }

}
