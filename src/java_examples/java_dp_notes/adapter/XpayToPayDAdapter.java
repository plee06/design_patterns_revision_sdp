package java_dp_notes.adapter;

/**
 * This is our "adapter" in the Adapter Pattern which will help us adapt our already existing XpayImpl to be able to
 * adapt to PayD New Vendor API!
 *
 * */

public class XpayToPayDAdapter implements PayDNewVendor {
    /*
    * This Adapter implements PayDNewVendor to be able to work with PayD Vendor.
    *
    * We use Object Composition to hold our xPayInterface which is the object this XpayToPayDAdapter needs to adapt.
    *
    * i.e. adaptee -> xPayInterface, adapter -> PayDNewVendor
    *
    * This "adaptee" Object is passed in through this class Constructor.
    *
    * The problem here is that the two interfaces have different methods beyond having different types completely.
    *
    * But the sole purpose of these interfaces are pretty similar, i.e. providing customer information and credit
    * card information to vendors
    *
    * */

    /*
    * Instance Variables
    *
    * */
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    // Our Object of Xpay that is wrapped by this XpayToPayDAdapter
    private final XpayInterface xPay;

    public XpayToPayDAdapter(XpayInterface xpay){
        this.xPay = xpay;
        setProp();
    }

    /*
    * Sets appropriate properties by taking the original xPay values and then passing it into the PayDNewVendor
    * appropriate methods.
    *
    * The whole point of this method is to set xPay's properties into PayD!
    *
    * Just to note, we can see that the setCardExpMonthDate is new for PayD, i.e. it didn't exist for xPay.
    *
    * In xPay we had a two methods: setCardYear ... setCardMonth... in PayD there is just one setCardExpMontDate
    * and so we pass in the format "month / year"! We basically had to re-format our results given in xPay to
    * work for PayD. Adapt!
    *
    *
    * */
    private void setProp(){
        setCardOwnerName(this.xPay.getCustomerName());
        setCustCardNo(this.xPay.getCreditCardNo());
        setCardExpMonthDate(this.xPay.getCardExpMonth()+"/"+this.xPay.
                getCardExpYear());
        setCVVNo(this.xPay.getCardCVVNo().intValue());
        setTotalAmount(this.xPay.getAmount());
    }

    /*
    * Our getter methods
    *
    * */
    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    /*
    * Our Setter methods
    *
    * */
    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;

    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;

    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;

    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;

    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;

    }
}
