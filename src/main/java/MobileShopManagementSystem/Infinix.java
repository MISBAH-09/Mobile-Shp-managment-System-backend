package MobileShopManagementSystem;
public class Infinix extends Mobile {
    private String Broweser;
    private String SpecialFeatures;

    public Infinix(String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                   Status status, Condition condition, double price, String battery_capacity, String OS,
                   String camera, String colour, String broweser, String specialFeatures) {
        super(Company.INFINIX, Model, RAM_GB, dimension, stockQuantity, status, condition, price, battery_capacity,
                OS, camera, colour);
       setBroweser(broweser);
       setSpecialFeatures(specialFeatures);
    }

    public String getBroweser() {
        return Broweser;
    }

    public void setBroweser(String broweser) {
        Broweser = broweser;
    }

    public String getSpecialFeatures() {
        return SpecialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        SpecialFeatures = specialFeatures;
    }

    @Override
    public String toString() {
        return  String.format("%10d%10s%10d%10s%10d%10s%10s%10.2f%10s%10s%10s%10s%10s%10s",getId(),getCompany(),
                getModel(),getRAM_GB(),getDimension(),getStockQuantity(),getStatus(),getCondition(),
                getPrice(),getBattery_capacity(),getOS(),getCamera(),getColour(),getBroweser(),getSpecialFeatures());

    }
}
