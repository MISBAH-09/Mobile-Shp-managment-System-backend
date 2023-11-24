package MobileShopManagementSystem;

import java.io.*;
import java.util.ArrayList;

public class InventoryManagement implements  Functions
{
    ArrayList<Mobile> list;
    ArrayList<Mobile> lowStock;
    ArrayList<Mobile> outOfStock;
    ArrayList<Mobile> purchasedList;
    Date date=new Date();
    ArrayList<CustomerAndPurchase> customerAndPurchasesList;
    File file = new File("Mobiles.txt");


    public InventoryManagement()
    {
        this.list = new ArrayList<>();
        this.lowStock = new ArrayList<>();
        this.outOfStock = new ArrayList<>();
        this.purchasedList = new ArrayList<>();
        this.customerAndPurchasesList = new ArrayList<>();
    }

    @Override
    public void addPhone(Object object)
    {
        createFile(file);
        try
        {
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (object instanceof Mobile)
            {
                Mobile mobile = (Mobile) object;
                list.add(mobile);
                System.out.println("Mobile Phone Added Successfully");
                bufferedWriter.write(mobile.toString());
                bufferedWriter.newLine();
            }
            else
            {
                System.out.println("Error");
            }
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Mobile Data Stored  Successfully In File: "+file.getName());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
//    public <T>void display(ArrayList<T> t){
//        for(int i =0;i< t.size();i++){
//            System.out.println(t.get(i));
//        }
//
//    }


    @Override
    public void fetchPhone(String model)
    {
        model = model.toUpperCase();
        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((bufferedReader.readLine()) != null)
            {
                for (Mobile mobile : list)
                {
                    if(mobile != null && mobile.getModel().equals(model))
                    {
                        System.out.println(mobile);
                    }
                }
                break;
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

@Override
    public void DisplayListOfMobileByCompany(Company company)
    {
        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((bufferedReader.readLine()) != null)
            {
                for (Mobile mobile : list)
                {
                    if(mobile != null && mobile.getStock().equals(Stock.AVAILABLE) &&
                        mobile.getCompany().equals(company))
                    {
                    System.out.println(mobile.getModel());
                    }
                }break;
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

@Override
    public void DisplayListOfMobileByPrice(double lowerPrice, double upperPrice)
    {
        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((bufferedReader.readLine()) != null)
            {for (Mobile mobile : list)
            {
                if(mobile != null && mobile.getPrice() >= lowerPrice && mobile.getPrice() <= upperPrice)
                {
                    System.out.println(mobile.getModel());
                }

                }break;
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
@Override
    public void DisplayListOfMobileByCompanyAndPrice(Company company, double lowerPrice, double upperPrice)
    {
        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((bufferedReader.readLine()) != null)
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
                }break;
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void displayListOfMobile()
    {
        try
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((bufferedReader.readLine()) != null)
            {

                for(Mobile mobile : list)
                {
                    if (mobile != null)
                    {
                        System.out.println(mobile.getModel());
                    }
                }break;
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
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

        for (Mobile mobile : list)
        {
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
            if(mobile != null && mobile.getStock().equals(Stock.AVAILABLE) &&
                    mobile.getModel().equals(model))
            {
                mobile.setStockQuantity(mobile.getStockQuantity() - 1);

                if(mobile.getStockQuantity() == 0)
                {
                    mobile.setStock(Stock.OUT_OF_STOCK);
                }

                if(!(purchasedList.contains(mobile)))
                {
                    purchasedList.add(mobile);
                }
                else
                {
                    mobile.setPurchasedStock(mobile.getPurchasedStock() + 1);
                }
            }

            break;
        }
    }

    public void purchaseAndCustomer(CustomerAndPurchase customer)
    {
        purchasedMobile(customer.getModel());
        customerAndPurchasesList.add(customer);
        System.out.println
                (
                    "Customer Name: " + customer.getCustomerName() +
                    "       Phone Number: " + customer.getMobileNo() +
                    "       Purchased Mobile Model: " + customer.getModel() +
                    "       Price: " + customer.getPrice() +
                    "       Date: " + customer.getDate()
                );
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
        int stock = mobile.getStockQuantity() / 2;
        if(mobile != null && mobile.getStockQuantity() < stock)
        {
            lowStock.add(mobile);
        }

        return false;
    }

    @Override
    public void displayOutofStockMobile()
    {
        try{
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((bufferedReader.readLine()) != null)
        {
            for (Mobile mobile : list)
            {
                if(OutOfStock(mobile))
                {
                    System.out.println(mobile.getModel());
                }
            }break;
        }

    }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void displayLowStockMobile()
    {
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((bufferedReader.readLine()) != null)
            {
                for (Mobile mobile : list)
                {
                    if(LowStock(mobile))
                    {
                        System.out.println(mobile.getModel());
                    }
                }break;
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void displayMonthlyFrequentlyPurchasedItem(int limit, int month)
    {
        try {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((bufferedReader.readLine()) != null)
        {
            for (Mobile mobile : list)
            {
                if (mobile != null && mobile.getMonthlySales(month) > limit)
                {
                    System.out.println(mobile.getModel());
                    System.out.println("\n");
                }
            }break;
        }

    }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

@Override
    public void displayWeeklyFrequentlyPurchasedItem(int limit, int week)
    {
        try {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((bufferedReader.readLine()) != null)
        {
            for (Mobile mobile : list)
            {
                if (mobile != null && mobile.getWeeklySales(week) > limit)
                {
                    System.out.println(mobile.getModel());
                    System.out.println("\n");
                }
            }break;
        }

    }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public  void createFile(File file)
    {
        if(!file.exists())
        {
            try
            {
                file.createNewFile();
            }

            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
    public void storeDataToFile(File file)
    {
        createFile(file);
        try
        {
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Mobile mobile : list)
            {
                bufferedWriter.write(mobile.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Mobile Data Stored  Successfully In File: "+file.getName());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

//    public void readFromFile(File file)
//    {
//        String line;
//        try
//        {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            while ((bufferedReader.readLine()) != null)
//            {
//                int i = 0;
//                System.out.println(line);
//                i++;
//            }
//
//        }
//        catch (FileNotFoundException e)
//        {
//            throw new RuntimeException(e);
//        }
//        catch (IOException e)
//        {
//            throw new RuntimeException(e);
//        }
//    }
//

    public void dailySales()
    {
        double[] sales=new double[30];
        int revenuestartdate=customerAndPurchasesList.get(0).getDate().getDate();
        for(int i =0;i<customerAndPurchasesList.size()-1;)
        {
            if(customerAndPurchasesList != null )
            {
                sales[revenuestartdate]+=customerAndPurchasesList.get(i).getPrice();
                i++;
                CustomerAndPurchase obj1=customerAndPurchasesList.get(i-1);
                    CustomerAndPurchase obj2=customerAndPurchasesList.get(i);
                    boolean l=date.iisRecent(obj1.getDate(),obj2.getDate());
                    if(l==true){
                        sales[revenuestartdate]+= customerAndPurchasesList.get(i).getPrice();
                        System.out.println(revenuestartdate +"   " + sales[revenuestartdate]);
                    }else if(l==false){
                        revenuestartdate=customerAndPurchasesList.get(i).getDate().getDate();

                        sales[revenuestartdate]+=customerAndPurchasesList.get(i).getPrice();
                        System.out.println(revenuestartdate +"   " + sales[revenuestartdate]);

                    }
                }
            }
//        for(int m=0;m<30;m++){
//            System.out.println(sales[m]);
//        }
        }


    }





