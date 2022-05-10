package berisha.cafe;

/**
 * This is a class for no side at all, which can be used so the object is not null,
 * even if the user decides to not order a side.
 */
public class NoSide extends Side{
    @Override
    String getDescription() {
        return super.getDescription() + "nothing";
    }

    @Override
    double getCost() {
        return super.getCost();
    }
}
