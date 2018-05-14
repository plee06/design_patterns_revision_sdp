package java_dp_notes.adapter;

/**
 * This is our Concrete Class which gets instantiated to then work with Xpay Vendor API.
 *
 * We pass our instantiated object to Xpay to get all our payments processed and finished!
 *
 *
 * */
public class XpayImpl implements XpayInterface {
    /*
    * Our Instance Variables
    *
    * */
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;


    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return cardCVVNo;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;

    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;

    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;

    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;

    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;

    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;

    }
}
