package MobileShopManagementSystem;
public class Andriod extends Mobile {

    public Andriod(Company company,String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                   Condition condition, double price, String battery_capacity, String OS,
                   String camera, String colour, int SIM_capacity, String specialAttributes) {
        super(company, Model, RAM_GB, dimension, stockQuantity, condition, price, battery_capacity,
                OS, camera, colour, Stock.AVAILABLE,SIM_capacity,specialAttributes);
    }

    @Override
    public String toString() {
        return String.format("ID: %15d\nCompany: %16s\n" +
                        "Model: %25s\nRam: %14d\nDimension: %18s\n" +
                        "Stock Quantity: %3d\nCondition: %10s\n" +
                        "Price: %19.2f\nBattery Capacity: %5s\nOS: %17s\n" +
                        "Colour: %15s\nCamera: %15s\n"+"IOS Version: %11s\nBrowser: %15s\n"
                , getId(), getCompany(), getModel(), getRAM_GB(), getDimension(),
                getStockQuantity(), getCondition(), getPrice(),
                getBattery_capacity(), getOS(), getColour(), getCamera(),getSpecialAttributes());

    }
}
