import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        Map<String, AddressBook> addressBookSystem = new HashMap<>();
        boolean continueAdding = true;
        while (continueAdding) {
            System.out.println("\n1. Add New Address Book");
            System.out.println("2. Add Contact to Address Book");
            System.out.println("3. Display All Contacts in an Address Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Address Book Name: ");
                    String bookName = scanner.nextLine();
                    if (addressBookSystem.containsKey(bookName)) {
                        System.out.println("Address Book already exists.");
                    } else {
                        addressBookSystem.put(bookName, new AddressBook());
                        System.out.println("Address Book '" + bookName + "' created.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Address Book Name: ");
                    String bookName = scanner.nextLine();
                    if (addressBookSystem.containsKey(bookName)) {
                        AddressBook addressBook = addressBookSystem.get(bookName);
                        System.out.println("Enter contact details:");
                        System.out.print("First Name: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Last Name: ");
                        String lastName = scanner.nextLine();
                        System.out.print("Address: ");
                        String address = scanner.nextLine();
                        System.out.print("City: ");
                        String city = scanner.nextLine();
                        System.out.print("State: ");
                        String state = scanner.nextLine();
                        System.out.print("Zip: ");
                        int zip = scanner.nextInt();
                        System.out.print("Phone Number: ");
                        long phoneNumber = scanner.nextLong();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                        addressBook.addContact(contact);
                        System.out.println("Contact added to Address Book '" + bookName + "'.");
                    } else {
                        System.out.println("Address Book does not exist.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter Address Book Name: ");
                    String bookName = scanner.nextLine();
                    if (addressBookSystem.containsKey(bookName)) {
                        System.out.println("Contacts in Address Book '" + bookName + "':");
                        addressBookSystem.get(bookName).displayContacts();
                    } else {
                        System.out.println("Address Book does not exist.");
                    }
                }
                case 4 -> {
                    continueAdding = false;
                    System.out.println("Exiting Address Book Program.");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}