package berisha.cafe;

/**
 * In this class, we define decorator methods that are meant to be implemented.
 * These methods are specifically for beverages, i.e., coffees, teas and softdrinks.
 */
public abstract class BeverageDecorator extends Beverage {
    public abstract String getDescription();

    public abstract double getCost();
}
