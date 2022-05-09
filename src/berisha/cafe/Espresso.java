package berisha.cafe;

/**
 * This is the espresso class. Since espresso is fairly uncomplicated, I figured no decorator option is necessary.
 */
public class Espresso extends Coffee {
    @Override
    public double getCost() {
        return super.getCost()-2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "espresso";
    }
}
