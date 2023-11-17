package MobileShopManagementSystem;

public class Mobile extends Electronics
    {
        private String Camera;
        private String colour;

    public Mobile(Company company, String Model, int RAM_GB, Dimensions dimension, int stockQuantity, Status status, Condition condition, double price, String battery_capacity, String OS, String camera, String colour) {
        super(company, Model, RAM_GB, dimension, stockQuantity, status, condition, price, battery_capacity, OS);
        Camera = camera;
        this.colour = colour;
    }

        public String getCamera()
        {
        return Camera;
    }

        public void setCamera(String camera) {
        Camera = camera;
    }
        public String getColour() {
        return colour;
    }

        public void setColour(String colour) {
        this.colour = colour;
    }

        @Override
        public String toString() {
            return  String.format("%10d%10s%10d%10s%10d%10s%10s%10.2f%10s%10s%10s%10s",getId(),getCompany(),
                    getModel(),getRAM_GB(),getDimension(),getStockQuantity(),getStatus(),getCondition(),
                    getPrice(),getBattery_capacity(),getOS(),getCamera(),getColour());

        }
    }
