package MobileShopManagementSystem;

public class Samsung extends Mobile
{
    private int SIM_capacity;

    public Samsung(String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                   Condition condition, double price, String battery_capacity,
                   String OS, String camera, String colour, int SIM_capacity) {
        super(Company.SAMSUNG, Model, RAM_GB, dimension, stockQuantity, condition,
                price, battery_capacity, OS, camera, colour, Stock.AVAILABLE);
        setSIM_capacity(SIM_capacity);
    }

    public int getSIM_capacity() {
        return SIM_capacity;
    }

    public void setSIM_capacity(int SIM_capacity) {
        this.SIM_capacity = SIM_capacity;
    }

    @Override
    public String toString()
    {
        return  String.format("ID: %15d\nCompany: %16s\n" +
                        "Model: %22s\nRam: %14d\nDimension: %18s\n" +
                        "Stock Quantity: %3d\nCondition: %10s\n" +
                        "Price: %19.2f\nBattery Capacity: %5s\nOS: %17s\n" +
                        "Colour: %15s\nCamera: %15s\nSIM Capacity: %5s\n"
                ,getId(), getCompany(),getModel(),getRAM_GB(),getDimension(),
                getStockQuantity(),getCondition(), getPrice(),
                getBattery_capacity(),getOS(),getColour(),getCamera(),getSIM_capacity());
    }
}
