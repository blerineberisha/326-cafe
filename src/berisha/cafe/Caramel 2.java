package berisha.cafe;

/**
 * This is a decorator for beverages, mainly coffee
 * and tea, since there are lots of flavors for those
 * beverages. (People usually put this flavor in coffee
 * or tea, but it can still be put into other beverages!)
 * This class implements the methods from the
 * BeverageDecorator interface.
 */
public class Caramel implements BeverageDecorator {
    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with Caramel";
    }

    @Override
    public double getCost() {
        return beverage.cost() + 0.3;
    }
}