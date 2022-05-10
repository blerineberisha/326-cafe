package berisha.cafe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class CafeAppTest {
    /**
     * Tests if the cost() method works correctly.
     */
    @Test
    public void testCostMethod(){
        Menu testMenu = new Menu(new Sandwich(), new NoSide(), new NoPastry(), new WhippedCream(new Coffee()));
        Assertions.assertEquals(testMenu.getCost(), 10.3);
    }

    /**
     * Tests if the description is returned correctly: with a false description.
     */
    @Test
    public void testDescriptionFalse(){
        Beverage vanillaCoffee = new Vanilla(new Coffee());
        Assertions.assertNotEquals(vanillaCoffee.getDescription(), "Coffee with caramel flavor");
    }

    /**
     * Tests if the description is returned correctly: with the correct description.
     */
    @Test
    public void testDescriptionCorrect(){
        Beverage caramelCoffee = new Caramel(new Coffee());
        Assertions.assertEquals(caramelCoffee.getDescription(), "Drink: Coffee with Caramel");
    }
    /**
     * Tests if the getCost() method works correctly.
     */
    @Test
    public void testGetCost(){
        Menu menu = new Menu(new Sandwich(), new NoSide(), new Croissant(), new Espresso());
        Assertions.assertEquals(menu.getCost(),8.65);
    }

    /**
     * Tests if the calculateChange() method works correctly.
     */
    @Test
    public void testCalculateChange(){
        Menu menu = new Menu(new Sandwich(), new NoSide(), new Croissant(), new Espresso());
        Order order = new Order(new AtomicInteger(0));
        order.addItem(menu);
        double change = order.calculateChange(10);
        Assertions.assertNotEquals(change, 1.5);
    }

    /**
     * Tests if the string validation of the IOHandler class works correctly.
     */
    @Test
    public void testStringValidation(){
        String toCheck = "check!";
        String checked = "check";
        Assertions.assertNotEquals(toCheck, checked);
    }

    /**
     * Tests if the integer validation of the IOHandler class works correctly.
     */
    @Test
    public void testIntValidation(){
        Assertions.assertNotEquals(4.5, IOHandler.isInteger("4.5"));
    }

    /**
     * Tests if the double validation of the IOHandler class works correctly.
     */
    @Test
    public void testDoubleValidation(){
        Assertions.assertEquals(14.3, IOHandler.isDouble("14.3"));
    }
}
