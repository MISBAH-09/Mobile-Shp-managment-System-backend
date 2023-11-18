package MobileShopManagementSystem;
public class Infinix extends Mobile {
    private String Browser;
    private String SpecialFeatures;

    public Infinix(String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                   Condition condition, double price, String battery_capacity, String OS,
                   String camera, String colour, String broweser, String specialFeatures) {
        super(Company.INFINIX, Model, RAM_GB, dimension, stockQuantity, Status.NOT_SALED, condition, price, battery_capacity,
                OS, camera, colour, Stock.AVAILABLE);
        setBroweser(broweser);
        setSpecialFeatures(specialFeatures);
    }

    public String getBroweser() {
        return Browser;
    }

    public void setBroweser(String broweser) {
        Browser = broweser;
    }

    public String getSpecialFeatures() {
        return SpecialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        SpecialFeatures = specialFeatures;
    }


    @Override
    public String toString() {
        return String.format("ID: %15d\nCompany: %16s\n" +
                        "Model: %25s\nRam: %14d\nDimension: %18s\n" +
                        "Stock Quantity: %3d\nStatus: %19s\nCondition: %10s\n" +
                        "Price: %19.2f\nBattery Capacity: %5s\nOS: %17s\n" +
                        "Colour: %15s\nCamera: %15s\n"+"Browser: %15s\n" +
                        "Speciality: %14s\n"
                , getId(), getCompany(), getModel(), getRAM_GB(), getDimension(),
                getStockQuantity(), getStatus(), getCondition(), getPrice(),
                getBattery_capacity(), getOS(), getColour(), getCamera(),getBroweser(),
                getSpecialFeatures());

    }
}
