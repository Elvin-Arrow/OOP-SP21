package assignment_1.question_1;

public class PhoneBook {
    private Contact[] contacts;
    private int contactCount;
    public final int DEFAULT_CAPACITY = 20;

    PhoneBook() {
        contacts = new Contact[DEFAULT_CAPACITY];
        contactCount = 0;
    }

    PhoneBook(int capacity) {
        contacts = new Contact[capacity];
        contactCount = 0;
    }

    public boolean insertContact(String name, int countryCode, int cityCode, String mobileNum, String mobileNumType) {
        if (contactCount < contacts.length) {
            contacts[contactCount] = new Contact(name, countryCode, cityCode, mobileNum, mobileNumType);
            contactCount++;
            return true;
        }

        return false;
    }

    public boolean deleteContact(String name) {
        Contact[] updatedContacts = new Contact[DEFAULT_CAPACITY];
        int index = 0;
        boolean flag = false;

        for (Contact contact : contacts) {
            try {
                if (contact.getName().equals(name)) {
                    flag = true;
                    index++;
                    continue;
                } else {
                    updatedContacts[index] = new Contact(contacts[index]);
                }
                index++;

            } catch (Exception e) {
                break;
            }
        }

        contacts = updatedContacts;
        return flag;
    }

    public String getContact(String name) {
        for (Contact contact : contacts) {
            try {
                if (contact.getName().equals(name)) {
                    return contact.toString();
                }
            } catch (Exception e) {
                break;
            }
        }
        return "No contact found";
    }
}
