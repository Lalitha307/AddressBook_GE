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
}
