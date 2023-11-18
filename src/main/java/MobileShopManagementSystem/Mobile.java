package MobileShopManagementSystem;

public class Mobile extends Electronics
    {
        private String Camera;
        private String colour;

    public Mobile(Company company, String Model, int RAM_GB, Dimensions dimension,
                  int stockQuantity, Condition condition, double price, String battery_capacity, String OS, String camera, String colour,Stock stock) {
        super(company, Model, RAM_GB, dimension, stockQuantity, condition, price, battery_capacity, OS, stock);
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

        public String toString()
        {
            return  String.format("ID: %15d\nCompany: %14s\n" +
                            "Model: %20s\nRam: %14d\nDimension: %18s\n" +
                            "Stock Quantity: %3d\nCondition: %10s\n" +
                            "Price: %19.2f\nBattery Capacity: %5s\nOS: %17s\n" +
                            "Colour: %15s\nCamera: %15s\n"
                    ,getId(), getCompany(),getModel(),getRAM_GB(),getDimension(),
                    getStockQuantity(),getCondition(), getPrice(),
                    getBattery_capacity(),getOS(),getColour(),getCamera());
        }
    }
