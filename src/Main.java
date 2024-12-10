import java.util.ArrayList;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
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
        System.out.println("\nAll Contacts:");
        addressBook.displayContacts();
        System.out.print("\nEnter the first name of the contact to edit: ");
        String editName = scanner.nextLine();
        addressBook.editContact(editName);
    }
}