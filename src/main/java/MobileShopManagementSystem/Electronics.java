package MobileShopManagementSystem;

public class Electronics
{
    private int id;
    private Company company;
    private  String Model;
    private int RAM_GB;
    private Dimensions dimension;
    private int stockQuantity;
    private Status status;
    private Condition condition;
    private double price;
    private String battery_capacity;
    private String OS;

    /*
    laptop
    generation , intel core, processor type
    camera touchpad, special attributes
    Latitude;
     */

    private static int counter = 0;

    public Electronics(Company company, String Model, int RAM_GB, Dimensions dimension, int stockQuantity, Status status, Condition condition, double price, String battery_capacity, String OS)
    {
        this.id = ++counter;
        setCompany(company);
        setModel(Model);
        setRAM_GB(RAM_GB);
        setDimension(dimension);
        setStockQuantity(stockQuantity);
        setStatus(status);
        setCondition(condition);
        setPrice(price);
        setBattery_capacity(battery_capacity);
        setOS(OS);

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getId()
    {
        return id;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getRAM_GB() {
        return RAM_GB;
    }

    public void setRAM_GB(int RAM_GB) {
        this.RAM_GB = RAM_GB;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Electronics.counter = counter;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public void setDimension(Dimensions dimension) {
        this.dimension = dimension;
    }

    public String getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(String battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
