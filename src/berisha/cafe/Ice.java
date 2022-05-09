package berisha.cafe;

/**
 * This is a decorator for all beverages. Every
 * beverage can contain ice.
 * This class implements the methods from the
 * BeverageDecorator interface.
 */
public class Ice extends BeverageDecorator {

    private Beverage beverage;

    public Ice(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "with ice";
    }


    public double getCost() {
        return beverage.getCost() + 0.2;
    }
}
