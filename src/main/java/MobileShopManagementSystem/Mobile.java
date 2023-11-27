package MobileShopManagementSystem;

public abstract class Mobile extends Electronics
    {
        private String Camera;
        private String colour;
        private int SIM_capacity;
        private String specialAttributes;

    public Mobile(Company company, String Model, int RAM_GB, Dimensions dimension,
                  int stockQuantity, Condition condition, double price, String battery_capacity,
                  String OS, String camera, String colour,Stock stock, int SIM_capacity,String specialAttributes) {
        super(company, Model, RAM_GB, dimension, stockQuantity, condition, price, battery_capacity, OS, stock);
        Camera = camera;
        this.colour = colour;
        setSIM_capacity(SIM_capacity);
        setSpecialAttributes(specialAttributes);
    }
        public int getSIM_capacity() {
            return SIM_capacity;
        }

        public void setSIM_capacity(int SIM_capacity) {
            this.SIM_capacity = SIM_capacity;
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
        public String getSpecialAttributes() {
            return specialAttributes;
        }

        public void setSpecialAttributes(String specialAttributes) {
            this.specialAttributes = specialAttributes;
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
                            "Colour: %15s\nCamera: %15s\nSIM Capacity: %5s\n,IOS Version: %11s\n"
                    ,getId(), getCompany(),getModel(),getRAM_GB(),getDimension(),
                    getStockQuantity(),getCondition(), getPrice(),
                    getBattery_capacity(),getOS(),getColour(),getCamera(),getSIM_capacity(),getSpecialAttributes());
        }
    }
