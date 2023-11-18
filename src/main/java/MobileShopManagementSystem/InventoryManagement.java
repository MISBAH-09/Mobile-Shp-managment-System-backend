package MobileShopManagementSystem;

import java.util.ArrayList;

public class InventoryManagement implements  Functions{

    ArrayList<Mobile> list;
    ArrayList<Iphone> listOfIphone;
    ArrayList<Infinix> listOfInfinix
            ;
    ArrayList<Samsung> listOfSamsung;


    public InventoryManagement()
    {
        this.list = new ArrayList<>();
        this.listOfIphone = new ArrayList<>();
        this.listOfInfinix = new ArrayList<>();
        this.listOfSamsung = new ArrayList<>();
    }

    @Override
    public void addPhone(Object object)
    {
        if (object instanceof Mobile)
        {
            Mobile mobile = (Mobile) object;
            list.add(mobile);
            System.out.println("Mobile Phone Added Successfully");

            if(mobile instanceof Iphone)
            {
                listOfIphone.add((Iphone) mobile);
            }
            else if(mobile instanceof Infinix)
            {
                listOfInfinix.add((Infinix) mobile);
            }
            else if(mobile instanceof Samsung)
            {
                listOfSamsung.add((Samsung) mobile);
            }
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
        if (company.equals(Company.APPLE))
        {
           displayModel();
        }
        if (company.equals(Company.INFINIX))
        {
            displayModel();
        }
        if (company.equals(Company.SAMSUNG))
        {
            displayModel();
        }


    }


    @Override
    public void displayModel()
    {
        for(Mobile mobile:list)
        {
            if (mobile != null)
            {
                System.out.println(mobile.getModel());
            }
        }
    }


//    public void



}


