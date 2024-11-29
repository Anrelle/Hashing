import java.util.Hashtable;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Hashtable<String, String> library = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                library.put(title, author);
                System.out.println("Book added.");
            } else if (choice == 2) {
                System.out.print("Enter book title to search: ");
                String title = scanner.nextLine();
                if (library.containsKey(title)) {
                    System.out.println("Author: " + library.get(title));
                } else {
                    System.out.println("Book not found.");
                }
            } else if (choice == 3) {
                System.out.println("\nAll Books:");
                for (String key : library.keySet()) {
                    System.out.println("Title: " + key + ", Author: " + library.get(key));
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
