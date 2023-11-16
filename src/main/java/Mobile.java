public class Mobile
{
    private int id;
    private int stockQuantity;
    private int RAM_GB;
    private String Camera;
    private  String Model;
    private double price;

    private static int counter = 0;

    public Mobile()
    {
        this.id = ++counter;

    }

    public int getId()
    {
        return id;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getRAM_GB() {
        return RAM_GB;
    }

    public void setRAM_GB(int RAM_GB) {
        this.RAM_GB = RAM_GB;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Mobile.counter = counter;
    }
}
