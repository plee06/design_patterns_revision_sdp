package proxy.virtual;

public class VirtualProxyRunner {

    public static void main(String[] args) {
        // This is our Proxy object, and right now this proxy object holds a ContactList of null
        // and so no object in the JVM is created. Only when an employee is needed will this Proxy
        // go and fetch the actual "gigantic" object to be instantiated
        ContactList contactList = new ContactListProxy();

        // Our company that takes in the proxy object. Prevention of actual object being created
        Company company = new Company(contactList);

        // Imagine a bunch of things with company happening here ...


        // All of a sudden our company wants the list of employees, now it'll ask the proxy to go and fetch it
        // in our getContactList we have the proxy object which we ask to fetch the contact list because it's null
        // the proxy will create a new contact list (the actual) and pass it back, now we've actually
        // created he object!!

        company.getContactList();
    }
}
