package proxy.virtual;


/**
 * Our "REALLY BIG" COMPANY OBJECT!
 *
 * This is the Object we want to delay creation of in this scheme ... i.e. Virtual Proxy
 *
 *
 * */
public class Company {

    // A huge list of contacts that would take forever to load
    private ContactList contactList;


    public Company(ContactList contactList) {
        this.contactList = contactList;

        System.out.println("Company object has been created");
    }
    // This "Virtual Proxy" technique is also known as Lazy Loading!

    // Just pretend there's a bunch of stuff here that takes up a ton of memory ... TON OF MEMORY!

    // This is our proxy method, only ge tthe contact list if this is run
    ContactList getContactList() {
        return this.contactList;
    }
}
