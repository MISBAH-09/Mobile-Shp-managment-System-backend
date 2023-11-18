package MobileShopManagementSystem;

import java.util.ArrayList;

public class InventoryManagement implements  Functions{

    ArrayList<Mobile> list;


    public InventoryManagement()
    {
        this.list = new ArrayList<>();
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
    public void displayListOfMobile()
    {
        for(Mobile mobile:list)
        {
            if (mobile != null)
            {
                System.out.println(mobile.getModel());
            }
        }
    }
    @Override
    public void UpdatePrice(String Model,double Price)
    {
        Model = Model.toUpperCase();

        for (Mobile mobile : list)
        {
            if(mobile != null && mobile.getModel().equals(Model))
            {
                mobile.setPrice(Price);
                System.out.println(mobile);
            }
            break;
        }
    }


}


