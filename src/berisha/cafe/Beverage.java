package berisha.cafe;

/**
 * Super-class for all drinks resp. beverage created in this
 * project.
 * Here we implement the methods from the item class.
 */
public abstract class Beverage extends Item {

    public double getCost() {
        return 0;
    }

    public String getDescription() {
        return "Drink: ";
    }
}
