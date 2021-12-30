package pr16.exceptons;

public class EmptyOrderListException extends NullPointerException {
    public EmptyOrderListException(){
        super("Нет ни одного заказа!");
    }
}
