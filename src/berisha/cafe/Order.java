package berisha.cafe;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * In this class we have the methods in which orders can be created.
 * Items can be added or removed. Orders can be cancelled.
 * The total price and the change are also calculated in this class.
 */
public class Order {
    private int orderId;
    private ArrayList<Item> order = new ArrayList<Item>();

    public Order(AtomicInteger orderId) {
        this.orderId = orderId.getAndIncrement();
    }

    /**
     * Method to add an item to the order
     *
     * @param item the item to be added to the order.
     */
    public void addItem(Item item) {
        order.add(item);
    }

    /**
     * @param paymentAmount amount of money the user wants to pay
     * @return returns the change for the amount of money the user wants to pay
     */
    public double calculateChange(double paymentAmount) {
        double change = calculatePrice() - paymentAmount;
        change *= -1;
        change *= 100;
        change = Math.round(change);
        change /= 100;
        return change;
    }

    /**
     * Method to calculate the price of an order
     *
     * @return returns a double that is the total price
     */
    public double calculatePrice() {
        double total = 0;
        for (Item item : order) {
            total += item.getCost();
        }
        total *= 100;
        total = Math.round(total);
        total /= 100;
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Item> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Item> order) {
        this.order = order;
    }
}
