package java_dp_notes.adapter;

/**
 * This is our new Vendor Interface that has a different set of methods we must implement for us to be able to work
 * with them!
 *
 *
 * */
public interface PayDNewVendor {

    /*
    * Getter methods according to PayD
    *
    * */
    public String getCustCardNo();
    public String getCardOwnerName();
    public String getCardExpMonthDate();
    public Integer getCVVNo();
    public Double getTotalAmount();

    /*
    * Setter methods according to PayD
    *
    *
    * */
    public void setCustCardNo(String custCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpMonthDate(String cardExpMonthDate);
    public void setCVVNo(Integer cVVNo);
    public void setTotalAmount(Double totalAmount);
}
