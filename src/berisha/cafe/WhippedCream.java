package berisha.cafe;

/**
 * This is a decorator for beverages, mainly coffee.
 * (People usually put this flavor in coffee,
 * but it can still be put into other beverages!)
 * This class implements the methods from the
 * BeverageDecorator interface.
 */
public class WhippedCream implements BeverageDecorator {
    @Override
    public String getDescription(Beverage beverage) {
        return beverage.getDescription() + "with whipped cream";
    }

    @Override
    public double getCost(Beverage beverage) {
        return beverage.getCost() + 0.6;
    }
}
