package java_dp_notes.adapter;

public class RunAdapterExample {


    /*
    * We pretend here that this is our Client to run the Adapter Example.
    *
    * */
    public static void main(String[] args) {
        // Our Object for Xpay, this is how we would normally work with our 3rd party Payment Processor
        XpayInterface xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);

        // Now we use our Adapter Pattern to be able to work with PayD, here we can see that PayD is Super type!

        /*
        * We pass in our Object of xpay, which originally worked only with Xpay Interface (i.e. the Vendor) and then
        * through our Adapter method (think setProps()) we adapt it to work with PayD by setting all the appropriate
        * values to be processed by our new 3rd Party Vendor of payd!
        *
        * */
        PayDNewVendor payd = new XpayToPayDAdapter(xpay); // This only works because it is a subtype, "implements" super!

        testPayD(payd);

        /*
        * Success! So what exactly is going on here?
        *
        * We've succesfully adapted our original xpay object which only worked with the xPay Vendor API to now work with
        * PayD Vendor API by using our Adapter Object (Concrete Class) which works with PayD by implementing their interface.
        *
        * And then within our "Adapter Class -> Object" we adapt the information in xPay to PayD by setting up the
        * properties, which then all get returned accordingly as the correct information to be used by PayD.
        *
        * Essentially we "wrap" the xPay Object with our Adapter Object which can be used by PayD vendor because it
        * implements their interface. We then set the properties appropriately and return it.
        *
        * This is great because imagine if we had 100's of different XpayImpl, do you really want to go and change
        * the information one by one to work with PayD? Or would you rather have a new Adapter Object that takes in the
        * old objects and appropriately "adapts" to PayD?
        *
        * Obvious answer -> Adapter Pattern!
        *
        * At the end of the day less work - no changes were made to existing code, instead we just pass it into the
        * adapter object which we only write once!
        *
        * */


    }

    /*
    * A Private Helper method to help us test payd to see if we have appropriately adapted all our information to
    * work with the PayD Vendor which has it's own specific set of getters and setters!
    *
    * Just a note -> It is static so it can work in our main method.
    * */
    private static void testPayD(PayDNewVendor payd) {
        System.out.println(payd.getCardExpMonthDate());
        System.out.println(payd.getCardOwnerName());
        System.out.println(payd.getCVVNo());
        System.out.println(payd.getCustCardNo());
        System.out.println(payd.getTotalAmount());
    }
}
