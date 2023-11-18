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
            displayModel(company);
        }
        if (company.equals(Company.INFINIX))
        {
            displayModel(company);
        }
        if (company.equals(Company.SAMSUNG))
        {
            displayModel(company);
        }


    }


    @Override
    public void display()
    {
        for(Mobile mobile:list)
        {
            if (mobile != null)
            {
                System.out.println(mobile.getModel());
            }
        }
    }

    public void displayModel(Company company)
    {
        if(company.equals(Company.APPLE))
        {
            for (Iphone iphone : listOfIphone)
            {
                if(iphone != null)
                {
                    System.out.println(iphone.getModel());
                }
            }
        }

        if(company.equals(Company.INFINIX))
        {
            for (Infinix infinix : listOfInfinix)
            {
                if(infinix != null)
                {
                    System.out.println(infinix.getModel());
                }
            }
        }

        if(company.equals(Company.SAMSUNG))
        {
            for (Samsung samsung : listOfSamsung)
            {
                if (samsung != null)
                {
                    System.out.println(samsung.getModel());
                }
            }
        }
    }


//    public void



}


