package berisha.cafe;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * In this class we have the methods in which orders can be created.
 * Items can be added or removed. Orders can be cancelled.
 * The total price and the change are also calculated in this class.
 */
public class Order{
    private int orderId;
    private ArrayList<Item> order = new ArrayList<Item>();

    public Order(AtomicInteger orderId) {
        this.orderId = orderId.getAndIncrement();
    }

    public void addItem(Item item) {
        order.add(item);
    }

    public void removeItem(int index) {
        order.remove(order.get(index));
    }

    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }

    public double calculateChange(double paymentAmount) {
        double change = calculatePrice() - paymentAmount;
        change *= -1;
        change *= 100;
        change = Math.round(change);
        change /= 100;
        return change;
    }

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
