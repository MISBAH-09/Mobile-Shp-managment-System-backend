package MobileShopManagementSystem;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        InventoryManagement inventoryManagement = new InventoryManagement();

        Mobile iphone = new Iphone("I-Phone 11",5,
                new Dimensions(34,56,6),6,Status.NOT_SALED,
                Condition.NEW,34111.3,"4 hrs","IOS",
                "black","12","67","wired",
                "faceID/TOUCHiD");

        Mobile iphone2 = new Iphone("I-Phone 11",5,
                new Dimensions(34,56,6),6,Status.NOT_SALED,
                Condition.NEW,34111.3,"4 hrs","IOS",
                "black","12","67","wired",
                "faceID/TOUCHiD");
        inventoryManagement.addPhone(iphone);
        inventoryManagement.display();
    }
}
