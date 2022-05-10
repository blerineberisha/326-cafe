package berisha.cafe;

/**
 * This is a decorator for all beverages. Every
 * beverage can contain ice.
 * This class implements the methods from the
 * BeverageDecorator interface.
 */
public class Ice implements BeverageDecorator {
    private Beverage beverage;

    public Ice(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + "with ice";
    }

    @Override
    public double getCost() {
        return beverage.cost() + 0.2;
    }
}
