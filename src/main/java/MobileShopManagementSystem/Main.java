package MobileShopManagementSystem;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        InventoryManagement inventoryManagement = new InventoryManagement();

        Mobile iphone = new Iphone("IPhone 11",5,
                new Dimensions(34,56,6),2,
                Condition.NEW,34111.3,"4 hrs","IOS",
                "12 px","Black","6; 2.6","Wired",
                "FaceID/TouchID");

        Mobile samsung = new Samsung("Samsung A32",5,
                new Dimensions(34,56,6),6,
                Condition.NEW,34111.3,"4 hrs","IOS",
                "12 px","Black",2);

        Mobile infinix = new Infinix("Infinix Hot 10",5,
                new Dimensions(34,56,6),6,
                Condition.NEW,34111.3,"4 hrs","IOS",
                "12 px","Black","Google","Dual Sim");


        inventoryManagement.addPhone(iphone);
//        inventoryManagement.addPhone(samsung);
//        inventoryManagement.addPhone(infinix);
//        inventoryManagement.displayModel();
//        inventoryManagement.fetchPhone("IPhone 11");
//        inventoryManagement.UpdatePrice("IPhone 11",400000.3);
//        inventoryManagement.purchasedMobile("Iphone");
//        inventoryManagement.purchasedMobile("Iphone 11");
//        System.out.println(iphone.getStockQuantity());
//        System.out.println(iphone.getStock());

        inventoryManagement.purchaseAndCustomer("Hamza",iphone,"03238835146","02-Nov-2023");
//


    }
}
