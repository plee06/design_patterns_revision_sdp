package java_dp_notes.adapter;

/**
 * This is the Xpay Interface that is provided to us that we must work with in order to get payments processed
 * for our items in our fake e-commerce website!
 *
 * It defines a bunch of getter and setter methods that allows us to work with their API.
 *
 * What we do is have a concrete implementation that implements this interface, instantiate it and pass our
 * object to them which then does all the "payment processing" behind the scenes for us, no need to worry about that!
 *
 *
 * */
public interface XpayInterface {

    /*
    * Getter methods
    *
    * */
    public String getCreditCardNo();
    public String getCustomerName();
    public String getCardExpMonth();
    public String getCardExpYear();
    public Short getCardCVVNo();
    public Double getAmount();

    /*
    * Setter methods
    *
    * */
    public void setCreditCardNo(String creditCardNo);
    public void setCustomerName(String customerName);
    public void setCardExpMonth(String cardExpMonth);
    public void setCardExpYear(String cardExpYear);
    public void setCardCVVNo(Short cardCVVNo);
    public void setAmount(Double amount);
}
