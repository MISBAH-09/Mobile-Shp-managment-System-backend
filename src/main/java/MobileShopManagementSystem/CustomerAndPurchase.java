package MobileShopManagementSystem;

public class CustomerAndPurchase
{
    private String customerName;
    private String mobileNo;

    private Mobile mobile;
    private double price;
    private String model;
    private String date;

    public CustomerAndPurchase(String customerName, Mobile mobile, String mobileNo, String date)
    {
        this.customerName = customerName;
        this.mobileNo = mobileNo;
        this.model = mobile.getModel();
        this.price = mobile.getPrice();
        this.date = date;
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

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }





}
