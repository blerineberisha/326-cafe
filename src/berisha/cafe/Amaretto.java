package berisha.cafe;

/**
 * This is a decorator for beverages, mainly coffee
 * and tea, since there are lots of flavors for those
 * beverages. (People usually put this flavor in coffee
 * or tea, but it can still be put into other beverages!)
 * This class implements the methods from the
 * BeverageDecorator interface.
 */
public class Amaretto implements BeverageDecorator {

    @Override
    public String getDescription(Beverage beverage) {
        return beverage.getDescription() + "with Amaretto";
    }

    @Override
    public double getCost(Beverage beverage) {
        return beverage.getCost() + 0.5;
    }
}
