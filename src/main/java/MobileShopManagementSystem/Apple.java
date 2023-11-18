package MobileShopManagementSystem;

public class Apple extends Mobile {
        private String IOS_Version;

    public Apple(Company company, String Model, int RAM_GB, Dimensions dimension,
                 int stockQuantity, Condition condition, double price,
                 String battery_capacity, String OS, String camera, String colour,Stock stock, String IOS_Version) {
        super(Company.APPLE, Model, RAM_GB, dimension, stockQuantity, condition, price,
                battery_capacity, OS, camera, colour,Stock.AVAILABLE);
        this.IOS_Version = IOS_Version;
    }

    public String getIOS_Version() {

            return IOS_Version;
    }

    public void setIOS_Version(String IOS_Version) {

            this.IOS_Version = IOS_Version;
    }

    @Override
    public String toString()
    {
        return  String.format("ID: %15d\nCompany: %14s\n" +
                        "Model: %20s\nRam: %14d\nDimension: %18s\n" +
                        "Stock Quantity: %3d\nCondition: %10s\n" +
                        "Price: %19.2f\nBattery Capacity: %5s\nOS: %17s\n" +
                        "Colour: %15s\nCamera: %15s\nIOS Version: %11s\n"
                ,getId(), getCompany(),getModel(),getRAM_GB(),getDimension(),
                getStockQuantity(),getCondition(), getPrice(),
                getBattery_capacity(),getOS(),getColour(),getCamera(),
                getIOS_Version());

    }
}
