package MobileShopManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagement implements  Functions{

    ArrayList<Mobile> list;
    Scanner input = new Scanner(System.in);

    @Override
    public void addPhone(Object object) {
        if (object instanceof Mobile) {
            Mobile mobile = (Mobile) object;
            list.add(mobile);
            System.out.println("Mobile Phone Added Successfully");
        } else {
            System.out.println("Error");
        }
    }
    @Override
    public void removePhone(Object object)
    {
        if (object instanceof Mobile)
        {
            Mobile mobile = (Mobile) object;
            list.remove(mobile);
            System.out.println("Mobile Phone Removed Successfully");
        } else
        {
            System.out.println("Error");
        }
    }
    @Override
    public void fetchPhone()
    {
        System.out.println("Fetch by: ");
        System.out.println("1......ID  2...... By Model");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
            {
                System.out.println("Enter ID");
                int id = input.nextInt();
                for (Mobile mobile : list) {
                    Mobile mobileVar = list.get(id - 1);
                    System.out.println(mobileVar);
                    break;
                }
            }

            case 2:
            {
                System.out.println("Enter Model");
                String model = input.nextLine();
                for (Mobile mobile : list)
                {
                    if(mobile != null && mobile.getModel().equals(model))
                    {
                        System.out.println(mobile);
                    }
                    break;
                }
            }

        }
    }

    @Override
    public void display()
    {
        for(Mobile mobile:list)
        {
            if (mobile != null)
            {
                System.out.println(mobile);
            }
        }
    }
}
