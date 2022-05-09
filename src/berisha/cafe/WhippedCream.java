package berisha.cafe;

/**
 * This is a decorator for beverages, mainly coffee.
 * (People usually put this flavor in coffee,
 * but it can still be put into other beverages!)
 * This class implements the methods from the
 * BeverageDecorator interface.
 */
public class WhippedCream extends BeverageDecorator {

    private Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "with whipped cream";
    }

    public double getCost() {
        return beverage.getCost() + 0.6;
    }
}
