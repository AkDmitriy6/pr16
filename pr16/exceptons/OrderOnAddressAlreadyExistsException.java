package pr16.exceptons;

import pr16.customers.Address;

public class OrderOnAddressAlreadyExistsException extends IllegalArgumentException {
    Address address;
    public OrderOnAddressAlreadyExistsException(Address address) {
        super("Заказ на адрес "+address.toString()+" уже обрабатывается!");
    }
}
