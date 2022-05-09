package berisha.cafe;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private int orderId;
    private double serviceFee;
    private ArrayList<Item> order = new ArrayList<Item>();

    public Order(AtomicInteger orderId, double serviceFee, ArrayList<Item> order) {
        this.orderId = orderId.getAndIncrement();
        this.serviceFee = serviceFee;
        this.order = order;
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
        return calculatePrice() - paymentAmount;
    }

    public double calculatePrice() {
        double total = 0;
        for (Item item : order) {
            total += item.getCost();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public ArrayList<Item> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Item> order) {
        this.order = order;
    }
}
