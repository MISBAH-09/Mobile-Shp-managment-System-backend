package MobileShopManagementSystem;
public class Iphone extends Apple {
    private String networkType;
    private String specialAttributes;

    public Iphone(Company company, String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                  Status status, Condition condition, double price, String battery_capacity,
                  String OS, String camera, String colour, String IOS_Version, String networkType,
                  String specialAttributes) {
        super(company, Model, RAM_GB, dimension, stockQuantity, status, condition, price,
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
}