package assignment_1.question_1;

public class Runner {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.insertContact("Sikander", 92, 51, "90495322", "Landline");
        phoneBook.insertContact("Ahmed", 92, 51, "90495323", "Landline");
        phoneBook.insertContact("Zaeem", 92, 51, "90495324", "Landline");
        phoneBook.insertContact("Haris", 92, 51, "90495325", "Landline");

        System.out.println(phoneBook.getContact("Sikander"));

        if (phoneBook.deleteContact("Ahmed")) {
            System.out.println("Contact deleted successfully");
        } else {
            System.out.println("Contact deletion unsucccessful");
        }

        System.out.println(phoneBook.getContact("Ahmed"));
    }
}
