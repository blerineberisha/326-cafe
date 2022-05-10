package berisha.cafe;

/**
 * Super-class for all drinks resp. beverage created in this
 * project.
 * Here we implement the methods from the item class.
 */
public class Beverage implements Item {

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Drink: ";
    }
}
