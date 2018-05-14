package proxy.virtual;

import java.util.List;

public class ContactListProxy implements ContactList {


    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {

        if (this.contactList == null) {
            System.out.println("Creating contact list and fetching all contacts .... ");

            // Create the object
            this.contactList = new ContactListImpl();
        }

        // After creation of object, return the employee list!
        return this.contactList.getEmployeeList();
    }
}
