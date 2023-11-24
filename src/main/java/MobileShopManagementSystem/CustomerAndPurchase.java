package MobileShopManagementSystem;

public class CustomerAndPurchase
{
    private String customerName;
    private String mobileNo;
    private Mobile mobile;
    private double price;
    private String model;
    private Date date;

    public CustomerAndPurchase(String customerName, Mobile mobile, String mobileNo, Date date)
    {
        setCustomerName(customerName);
        setModel(mobile.getModel());
        setPrice(mobile.getPrice());
        setDate(date);
        setMobileNo(mobileNo);
    }


    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        model = model.toUpperCase();
        this.model = model;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getMobileNo()
    {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo)
    {
        this.mobileNo = mobileNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void displayDetails()
    {
        System.out.println
                (
                                "Customer Name: " + getCustomerName() +
                                "       Phone Number: " + getMobileNo() +
                                "       Purchased Mobile Model: " + getModel() +
                                "       Price: " + getPrice() +
                                "       Date: " + getDate()
                );
    }

    @Override
    public String toString()
    {
        return  "Customer Name: " + getCustomerName() +
                "       Phone Number: " + getMobileNo() +
                "       Purchased Mobile Model: " + getModel() +
                "       Price: " + getPrice() +
                "       Date: " + getDate();
    }
}
