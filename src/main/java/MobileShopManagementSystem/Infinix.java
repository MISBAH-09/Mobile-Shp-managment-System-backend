package MobileShopManagementSystem;
public class Infinix extends Mobile {
    private String Broweser;
    private String SpecialFeatures;

    public Infinix(Company company, String Model, int RAM_GB, Dimensions dimension, int stockQuantity,
                   Status status, Condition condition, double price, String battery_capacity, String OS,
                   String camera, String colour, String broweser, String specialFeatures) {
        super(company, Model, RAM_GB, dimension, stockQuantity, status, condition, price, battery_capacity,
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
}
