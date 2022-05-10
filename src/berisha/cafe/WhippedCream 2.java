package berisha.cafe;

/**
 * This is a decorator for beverages, mainly coffee.
 * (People usually put this flavor in coffee,
 * but it can still be put into other beverages!)
 * This class implements the methods from the
 * BeverageDecorator interface.
 */
public class WhippedCream implements BeverageDecorator {
    private Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + "with whipped cream";
    }

    @Override
    public double getCost() {
        return beverage.cost() + 0.6;
    }
}
