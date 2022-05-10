package berisha.cafe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class CafeAppTest {
    @Test
    public void testCostMethod(){
        Menu testMenu = new Menu(new Sandwich(), new NoSide(), new NoPastry(), new WhippedCream(new Coffee()));
        Assertions.assertEquals(testMenu.getCost(), 10.3);
    }

    @Test
    public void testDescription(){
        Beverage vanillaCoffee = new Vanilla(new Coffee());
        Assertions.assertNotEquals(vanillaCoffee.getDescription(), "Coffee with caramel flavor");
    }

    @Test
    public void testCalculatePrice(){
        Menu menu = new Menu(new Sandwich(), new NoSide(), new Croissant(), new Espresso());
        Assertions.assertEquals(menu.getCost(),8.65);
    }

    @Test
    public void testCalculateChange(){
        Menu menu = new Menu(new Sandwich(), new NoSide(), new Croissant(), new Espresso());
        Order order = new Order(new AtomicInteger(0));
        order.addItem(menu);
        double change = order.calculateChange(10);
        Assertions.assertNotEquals(change, 1.5);
    }

    @Test
    public void testStringValidation(){
        String toCheck = "check!";
        String checked = "check";
        Assertions.assertNotEquals(toCheck, checked);
    }

    @Test
    public void testIntValidation(){
        Assertions.assertNotEquals(4.5, IOHandler.isInteger("4.5"));
    }

    @Test
    public void testDoubleValidation(){
        Assertions.assertEquals(14.3, IOHandler.isDouble("14.3"));
    }
}
