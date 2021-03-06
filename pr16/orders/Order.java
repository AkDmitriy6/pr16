package pr16.orders;

import pr16.customers.Customer;
import pr16.exceptons.AlcoholForNotMatureCustomerException;
import pr16.menu.MenuItem;

public interface Order {
    boolean add(MenuItem item) throws AlcoholForNotMatureCustomerException;
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem item);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    double costTotal();
    Customer getCustomer();
    void setCustomer(Customer newCustomer) throws AlcoholForNotMatureCustomerException;
}
