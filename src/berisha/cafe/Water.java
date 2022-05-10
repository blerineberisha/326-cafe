package berisha.cafe;

/**
 * This is the class for the only softdrink offered in my café.
 * It only extends Beverage and uses the description and cost.
 * This is extendable by creating a Softdrink class, making water
 * extend it and adding more softdrinks to this project.
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
