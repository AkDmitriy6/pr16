package pr16.orders.managers;

import pr16.menu.MenuItem;
import pr16.orders.Order;

public interface OrderManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    double ordersCostSummary();
    int ordersQuantity();
}
