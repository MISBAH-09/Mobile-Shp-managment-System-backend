package MobileShopManagementSystem;
public class Iphone extends Apple {
    private String networkType;
    private String specialAttributes;

    public Iphone(String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                   Condition condition, double price, String battery_capacity,
                  String OS, String camera, String colour, String IOS_Version, String networkType,
                  String specialAttributes) {
        super(Company.APPLE, Model, RAM_GB, dimension, stockQuantity, condition, price,
                battery_capacity, OS, camera, colour,Stock.AVAILABLE, IOS_Version);
        setNetworkType(networkType);
        setSpecialAttributes(specialAttributes);
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getSpecialAttributes() {
        return specialAttributes;
    }

    public void setSpecialAttributes(String specialAttributes) {
        this.specialAttributes = specialAttributes;
    }

    @Override
    public String toString()
    {
        return  String.format("ID: %15d\nCompany: %14s\n" +
                        "Model: %20s\nRam: %14d\nDimension: %18s\n" +
                        "Stock Quantity: %3d\nCondition: %10s\n" +
                        "Price: %19.2f\nBattery Capacity: %5s\nOS: %17s\n" +
                        "Colour: %15s\nCamera: %15s\nIOS Version: %11s\n" +
                        "Network Type: %9s\nSpeciality: %20s\n"
                ,getId(), getCompany(),getModel(),getRAM_GB(),getDimension(),
                getStockQuantity(),getCondition(), getPrice(),
                getBattery_capacity(),getOS(),getColour(),getCamera(),
                getIOS_Version(),getNetworkType(),getSpecialAttributes());
        //Status: %19s

    }
}