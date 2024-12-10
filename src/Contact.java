public class Contact {
    int zip;
    long phoneNumber;
    String firstName, lastName, address, city, state, email;
    public Contact(String firstName, String lastName, String address, String city,
                   String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
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
}
