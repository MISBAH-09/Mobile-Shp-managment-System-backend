package MobileShopManagementSystem;

import java.util.ArrayList;

public class InventoryManagement implements  Functions{

    ArrayList<Mobile> list;
    ArrayList<Mobile> lowStock;
    ArrayList<Mobile> outOfStock;
    ArrayList<PurchasedMobile> purchasedList;


    public InventoryManagement()
    {
        this.list = new ArrayList<>();
        this.lowStock = new ArrayList<>();
        this.outOfStock = new ArrayList<>();
    }

    @Override
    public void addPhone(Object object)
    {
        if (object instanceof Mobile)
        {
            Mobile mobile = (Mobile) object;
            list.add(mobile);
            System.out.println("Mobile Phone Added Successfully");
        }
        else
        {
            System.out.println("Error");
        }
    }

    @Override
    public void fetchPhone(String model)
    {
        model = model.toUpperCase();

        for (Mobile mobile : list)
        {
            if(mobile != null && mobile.getModel().equals(model))
            {
                System.out.println(mobile);
            }
            break;
        }
    }

@Override
    public void DisplayListOfMobileByCompany(Company company)
    {
        for (Mobile mobile : list)
        {
            if(mobile != null && mobile.getStock().equals(Stock.AVAILABLE) &&
                    mobile.getCompany().equals(company))
            {
                System.out.println(mobile.getModel());
            }
        }
    }
@Override
    public void DisplayListOfMobileByPrice(double lowerPrice, double upperPrice)
    {
        for (Mobile mobile : list)
        {
            if(mobile != null && mobile.getPrice() >= lowerPrice && mobile.getPrice() <= upperPrice)
            {
                System.out.println(mobile.getModel());
            }
        }
    }
@Override
    public void DisplayListOfMobileByCompanyAndPrice(Company company, double lowerPrice, double upperPrice)
    {
        for (Mobile mobile : list)
        {
            if(mobile != null && mobile.getStock().equals(Stock.AVAILABLE) &&
                    mobile.getCompany().equals(company))
            {
                if(mobile.getPrice() >= lowerPrice && mobile.getPrice() <= upperPrice)
                {
                    System.out.println(mobile.getModel());
                }
            }
        }
    }

    @Override
    public void displayListOfMobile()
    {
        for(Mobile mobile : list)
        {
            if (mobile != null)
            {
                System.out.println(mobile.getModel());
            }
        }
    }

    @Override
    public void UpdatePrice(String model, double Price)
    {
        model = model.toUpperCase();

        for (Mobile mobile : list) {
            if (mobile != null && mobile.getModel().equals(model))
            {

                mobile.setPrice(Price);
            }
            break;
        }
    }
@Override
    public void UpdateStock(String model, int stockQunatity)
    {
        model = model.toUpperCase();

        for (Mobile mobile : list) {
            if (mobile != null && mobile.getModel().equals(model))
            {
                mobile.setStockQuantity(stockQunatity);

                if (mobile.getStock().equals(Stock.OUT_OF_STOCK))
                {
                    mobile.setStock(Stock.AVAILABLE);
                }
            }
            break;
        }
    }
  @Override
    public void purchasedMobile(String model)
    {
        model = model.toUpperCase();

        for (Mobile mobile : list)
        {
            if(mobile != null && mobile.getModel().equals(model))
            {
                System.out.println(mobile.getModel() + " has been Purchased");
                mobile.setStockQuantity(mobile.getStockQuantity() - 1);
                if(mobile.getStockQuantity() == 0)
                {
                    mobile.setStock(Stock.OUT_OF_STOCK);
                }
            }
            break;
        }
    }

@Override
    public boolean OutOfStock(Mobile mobile)
    {
        if(mobile != null && mobile.getStockQuantity() == 0)
        {
             mobile.setStock(Stock.OUT_OF_STOCK);
             outOfStock.add(mobile);
             return true;
        }

        return false;
    }
@Override
    public boolean LowStock(Mobile mobile)
    {
        int stock  = mobile.getStockQuantity() / 2;
        if(mobile != null && mobile.getStockQuantity() < stock)
        {
            lowStock.add(mobile);
        }

        return false;
    }

@Override
    public void displayOutofStockMobile()
    {
        for (Mobile mobile : list)
        {
            if(OutOfStock(mobile))
            {
                System.out.println(mobile.getModel());
            }
        }
    }

@Override
    public void displayLowStockMobile()
    {
        for (Mobile mobile : list)
        {
            if(LowStock(mobile))
            {
                System.out.println(mobile.getModel());
            }
        }
    }

@Override
    public void displayMonthlyFrequentlyPurchasedItem(int limit, int month)
    {
        for (Mobile mobile : list)
        {
            if (mobile != null && mobile.getMonthlySales(month) > limit)
            {
                System.out.println(mobile.getModel());
                System.out.println("\n");
            }
        }
    }

@Override
    public void displayWeeklyFrequentlyPurchasedItem(int limit, int week)
    {
        for (Mobile mobile : list)
        {
            if (mobile != null && mobile.getWeeklySales(week) > limit)
            {
                System.out.println(mobile.getModel());
                System.out.println("\n");
            }
        }
    }
//    public void PurchasedMobile(Mobile mobile){
//        if(purchasedList== null){
//            purchasedList.add(mobile);
//            System.out.println("done");
//        }
//        if(purchasedList!=null){
//            for(Mobile mob:purchasedList){
//                if(mob.getModel().equals(mobile.getModel())){
//                    int q=mob.getStockQuantity();
//                    System.out.println("done");
//                    mob.setStockQuantity(q+1);
//                }
//            }
//        }
//    }


}


