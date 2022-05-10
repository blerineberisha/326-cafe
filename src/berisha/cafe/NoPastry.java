package berisha.cafe;

/**
 * This is a class for no pastry at all, which can be used so the object is not null,
 * even if the user decides to not order a pastry.
 */
public class NoPastry extends Pastry{
    @Override
    double getCost() {
        return super.getCost();
    }

    @Override
    String getDescription() {
        return super.getDescription() + "none";
    }
}
