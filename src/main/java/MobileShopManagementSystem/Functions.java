package MobileShopManagementSystem;

public interface Functions
{
    void addPhone(Object object);
    void fetchPhone(String model);
   void displayListOfMobile();
    void DisplayListOfMobileByCompany(Company company);
    void UpdatePrice(String Model,double Price);
    void DisplayListOfMobileByPrice(double lowerPrice, double upperPrice);
    void DisplayListOfMobileByCompanyAndPrice(Company company, double lowerPrice, double upperPrice);
    void UpdateStock(String model, int stockQunatity);
    void purchasedMobile(String model);
    boolean OutOfStock(Mobile mobile);
    boolean LowStock(Mobile mobile);
    void displayOutofStockMobile();
    void displayLowStockMobile();
    void displayMonthlyFrequentlyPurchasedItem(int limit, int month);
    void displayWeeklyFrequentlyPurchasedItem(int limit, int week);

}
