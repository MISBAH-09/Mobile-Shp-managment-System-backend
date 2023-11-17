package MobileShopManagementSystem;
public class Iphone extends Apple {
    private String networkType;
    private String specialAttributes;

    public Iphone(String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                  Status status, Condition condition, double price, String battery_capacity,
                  String OS, String camera, String colour, String IOS_Version, String networkType,
                  String specialAttributes) {
        super(Model, RAM_GB, dimension, stockQuantity, status, condition, price,
                battery_capacity, OS, camera, colour, IOS_Version);
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
    public String toString() {
        return  String.format("%10d%10s%10d%10s%10d%10s%10s%10.2f%10s%10s%10s%10s%10s%10s%10s",getId(),getCompany(),
                getModel(),getRAM_GB(),getDimension(),getStockQuantity(),getStatus(),getCondition(),
                getPrice(),getBattery_capacity(),getOS(),getCamera(),getColour(),getIOS_Version(),getNetworkType(),getSpecialAttributes());

    }
}