package MobileShopManagementSystem;

import java.util.ArrayList;

public class Electronics
{
    private int id;
    private Company company;
    private  String Model;
    private int RAM_GB;
    private Dimensions dimension;
    private int stockQuantity;
    private Condition condition;
    private double price;
    private String battery_capacity;
    private String OS;

    private Stock stock;
    private int purchasedStock = 0;

    private ArrayList<Integer> weeklySales;
    private ArrayList<Integer> monthlySales;

    /*
    laptop
    generation , intel core, processor type
    camera touchpad, special attributes
    Latitude;
     */

    private static int counter = 0;

    public Electronics(Company company, String Model, int RAM_GB,
                       Dimensions dimension, int stockQuantity,
                       Condition condition, double price,
                       String battery_capacity, String OS,Stock stock)
    {
        this.id = ++counter;
        setCompany(company);
        setModel(Model);
        setRAM_GB(RAM_GB);
        setDimension(dimension);
        setStockQuantity(stockQuantity);
        setCondition(condition);
        setPrice(price);
        setBattery_capacity(battery_capacity);
        setOS(OS);
        setStock(stock);

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

    public void setModel(String model)
    {
        model = model.toUpperCase();
        Model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setOS(String OS)

    {
        this.OS = OS;
    }

    public int getWeeklySales(int week)
    {
        return weeklySales.get(week - 1);
    }

    public void setWeeklySales(int week, int quantitySold)
    {
        weeklySales.add(week-1, quantitySold);
    }

    public int getMonthlySales(int month)
    {
        return monthlySales.get(month - 1);
    }

    public void setMonthlySales(int month, int quantitySold)
    {
        monthlySales.add(month-1, quantitySold);
    }

    public int getPurchasedStock() {
        return purchasedStock;
    }

    public void setPurchasedStock(int purchasedStock) {
        this.purchasedStock = purchasedStock;
    }


    @Override
    public String toString()
    {
        return  String.format("ID: %15d\nCompany: %14s\n" +
                        "Model: %20s\nRam: %14d\nDimension: %18s\n" +
                        "Stock Quantity: %3d\nCondition: %10s\n" +
                        "Price: %19.2f\nBattery Capacity: %5s\nOS: %17s\n"
                ,getId(), getCompany(),getModel(),getRAM_GB(),getDimension(),
                getStockQuantity(),getCondition(), getPrice(),
                getBattery_capacity(),getOS());

    }
}
