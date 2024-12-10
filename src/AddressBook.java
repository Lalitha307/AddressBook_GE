import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    public void editContact(String firstName) {
        for (Contact contact : contacts) {
            if (contact.firstName.equals(firstName)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Editing contact for " + firstName);
                System.out.print("New Address: ");
                contact.address = scanner.nextLine();
                System.out.print("New City: ");
                contact.city = scanner.nextLine();
                System.out.print("New State: ");
                contact.state = scanner.nextLine();
                System.out.print("New Zip: ");
                contact.zip = scanner.nextInt();
                System.out.print("New Phone Number: ");
                contact.phoneNumber = scanner.nextLong();
                scanner.nextLine(); // Consume newline
                System.out.print("New Email: ");
                contact.email = scanner.nextLine();
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    public void deleteContact(String firstName) {
        contacts.removeIf(contact -> contact.firstName.equals(firstName));
        System.out.println("Contact deleted if it existed.");
    }
}
