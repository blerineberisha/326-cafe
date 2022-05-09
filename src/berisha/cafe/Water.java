package berisha.cafe;

/**
 * This is the class for the only softdrink offered in my café.
 * It only extends Beverage and uses the description and cost.
 */
public class Water extends Beverage {
    @Override
    public String getDescription() {
        return super.getDescription() + " Water ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.2;
    }
}
