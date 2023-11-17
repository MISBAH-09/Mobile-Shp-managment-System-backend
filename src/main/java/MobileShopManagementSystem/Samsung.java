package MobileShopManagementSystem;

public class Samsung extends Mobile
{
    private int SIM_capacity;

    public Samsung(Company company, String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                   Status status, Condition condition, double price, String battery_capacity,
                   String OS, String camera, String colour, int SIM_capacity) {
        super(Company.SAMSUNG, Model, RAM_GB, dimension, stockQuantity, status, condition,
                price, battery_capacity, OS, camera, colour);
        setSIM_capacity(SIM_capacity);
    }

    public int getSIM_capacity() {
        return SIM_capacity;
    }

    public void setSIM_capacity(int SIM_capacity) {
        this.SIM_capacity = SIM_capacity;
    }

    @Override
    public String toString() {
        return  String.format("%10d%10s%10d%10s%10d%10s%10s%10.2f%10s%10s%10s%10s%10d",getId(),getCompany(),
                getModel(),getRAM_GB(),getDimension(),getStockQuantity(),getStatus(),getCondition(),
                getPrice(),getBattery_capacity(),getOS(),getCamera(),getColour(),getSIM_capacity());

    }
}