//You are a software developer tasked with creating a small utility for a library 
//system. 
//The library wants to maintain a list of book titles and perform various operations on this list. 
//Each title is stored as a string in an array. The library wants to be able to do the following:
//
//1. Add a Book Title: Add a new book title to the list.
//2. Remove a Book Title: Remove a specific book title from the list.
//3. Search for a Book Title: Search for a book title and return its index if found.
//4. List All Book Titles: Display all the book titles in the list.
//5. Sort Book Titles: Sort the book titles alphabetically.


package OneWeekSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LibrarySystem {

    private ArrayList<String> bookTitles;

    public LibrarySystem() {
        bookTitles = new ArrayList<>();
    }

    //Add a new book title to the list.
    public void addBookTitle(String title) {
        bookTitles.add(title);
        System.out.println("Book added: " + title);
    }

    //Remove a specific book title from the list.
    public void removeBookTitle(String title) {
        if (bookTitles.remove(title)) {
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    //Search for a book title and return its index if found.
    public void searchBookTitle(String title) {
        int index = bookTitles.indexOf(title);
        if (index != -1) {
            System.out.println("Book found at index: " + index);
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    //Display all the book titles in the list.
    public void listAllBookTitles() {
        System.out.println("Listing all book titles:");
        for (String title : bookTitles) {
            System.out.println(title);
        }
    }

    // Sort the book titles alphabetically.
    public void sortBookTitles() {
        Collections.sort(bookTitles);
        System.out.println("Book titles sorted alphabetically.");
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add a Book Title");
            System.out.println("2. Remove a Book Title");
            System.out.println("3. Search for a Book Title");
            System.out.println("4. List All Book Titles");
            System.out.println("5. Sort Book Titles");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title to add: ");
                    String titleToAdd = scanner.nextLine();
                    library.addBookTitle(titleToAdd);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    library.removeBookTitle(titleToRemove);
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String titleToSearch = scanner.nextLine();
                    library.searchBookTitle(titleToSearch);
                    break;
                case 4:
                    library.listAllBookTitles();
                    break;
                case 5:
                    library.sortBookTitles();
                    break;
                case 0:
                    System.out.println("Exiting Library System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
