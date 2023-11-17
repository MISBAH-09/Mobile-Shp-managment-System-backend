package MobileShopManagementSystem;

public class Apple extends Mobile {
        private String IOS_Version;

    public Apple(String Model, int RAM_GB, Dimensions dimension,
                 int stockQuantity, Status status, Condition condition, double price,
                 String battery_capacity, String OS, String camera, String colour, String IOS_Version) {
        super(Company.APPLE, Model, RAM_GB, dimension, stockQuantity, status, condition, price,
                battery_capacity, OS, camera, colour);
        this.IOS_Version = IOS_Version;
    }

    public String getIOS_Version() {

            return IOS_Version;
    }

    public void setIOS_Version(String IOS_Version) {

            this.IOS_Version = IOS_Version;
    }

    @Override
    public String toString() {
        return  String.format("%10d%10s%10d%10s%10d%10s%10s%10.2f%10s%10s%10s%10s%10s",getId(),getCompany(),
                getModel(),getRAM_GB(),getDimension(),getStockQuantity(),getStatus(),getCondition(),
                getPrice(),getBattery_capacity(),getOS(),getCamera(),getColour(),getIOS_Version());

    }
}
