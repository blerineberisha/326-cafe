package berisha.cafe;

/**
 * This is a decorator for all beverages. Every
 * beverage can contain ice.
 * This class implements the methods from the
 * BeverageDecorator interface.
 */
public class Ice implements BeverageDecorator {
    @Override
    public String getDescription(Beverage beverage) {
        return beverage.getDescription() + "with ice";
    }

    @Override
    public double getCost(Beverage beverage) {
        return beverage.getCost() + 0.2;
    }
}
