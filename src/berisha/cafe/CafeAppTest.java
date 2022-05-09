package berisha.cafe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

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
}
