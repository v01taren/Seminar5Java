public class Printer{
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Sasha", "1234");
        phoneBook.addContact("Booba", "102030");
        phoneBook.addContact("Sasha", "405060");
        phoneBook.addContact("Booba", "5678");

        phoneBook.printPhoneBook();
    }
}