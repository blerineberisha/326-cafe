package berisha.cafe;

/**
 * This is the croissant class, which extends pastry.
 *
 */
public class Croissant extends Pastry {
    @Override
    public String getDescription() {
        return super.getDescription() + "Croissant ";
    }

    @Override
    public double getCost() {
        return super.getCost() + .95;
    }
}
