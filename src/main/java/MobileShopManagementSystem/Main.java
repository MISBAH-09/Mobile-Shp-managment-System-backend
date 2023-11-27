package MobileShopManagementSystem;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        InventoryManagement inventoryManagement = new InventoryManagement();

        Mobile iphone = new Iphone("IPhone 11",5,
                new Dimensions(34,56,6),2,
                Condition.NEW,34111.3,"4 hrs","IOS",
                "12 px","Black",1,"6; 2.6","Wired",
                "FaceID/TouchID");

        Mobile samsung = new Andriod(Company.SAMSUNG,"Samsung A32",5,
                new Dimensions(34,56,6),6,
                Condition.NEW,34111.3,"4 hrs","IOS",
                "12 px","Black",2,"none");

        Mobile infinix = new Andriod(Company.INFINIX,"Infinix Hot 10",5,
                new Dimensions(34,56,6),6,
                Condition.NEW,34111.3,"4 hrs","IOS",
                "12 px","Black",2,"null");
        Mobile vivo=new Andriod(Company.VIVO,"VIVO Y13",4,new Dimensions(15,6,7),
                6,Condition.SECOND_HAND,6000.0,"5 hrs","IOS","10 px",
                "navy blue",2,"null");


        CustomerAndPurchase Purchaser1 = new CustomerAndPurchase("Hamza",infinix,"235677",new Date(4,5,2020));
        inventoryManagement.purchaseAndCustomer(Purchaser1);
        CustomerAndPurchase Purchaser2 = new CustomerAndPurchase("szxdfg",infinix,"235677",new Date(4,5,2020));
        inventoryManagement.purchaseAndCustomer(Purchaser2);
        CustomerAndPurchase Purchaser3 = new CustomerAndPurchase("szxdfg",infinix,"235677",new Date(5,13,2020));
        inventoryManagement.purchaseAndCustomer(Purchaser3);
        CustomerAndPurchase Purchaser4 = new CustomerAndPurchase("szxdfg",infinix,"235677",new Date(8,5,2020));
        inventoryManagement.purchaseAndCustomer(Purchaser4);



        inventoryManagement.addPhone(iphone);
        inventoryManagement.addPhone(samsung);
        inventoryManagement.addPhone(infinix);
        inventoryManagement.addPhone(vivo);
//        inventoryManagement.fetchPhone("Infinix Hot 10");
//        inventoryManagement.DisplayListOfMobileByCompany(Company.INFINIX);
//        inventoryManagement.DisplayListOfMobileByPrice(30000,600000);
//        inventoryManagement.DisplayListOfMobileByCompanyAndPrice(Company.SAMSUNG,500,600);
//        inventoryManagement.displayListOfMobile();
          inventoryManagement.UpdatePrice("IPhone 11",400000.3);


//        inventoryManagement.dailySales();
//        inventoryManagement.displayModel();

//        inventoryManagement.purchasedMobile("Iphone");
//        inventoryManagement.purchasedMobile("Iphone 11");
//        System.out.println(iphone.getStockQuantity());
//        System.out.println(iphone.getStock());

//      inventoryManagement.purchaseAndCustomer("Hamza",iphone,"03238835146","02-Nov-2023");

//        inventoryManagement.storeDataToFile(file);
//        inventoryManagement.readFromFile(file);
////


    }
}
