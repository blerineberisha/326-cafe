package berisha.cafe;

/**
 * The side class which is extended by fries and salad (extendable).
 * Here you can create a side instance.
 */
public abstract class Side extends Food {
    @Override
    String getDescription() {
        return super.getDescription() + "with ";
    }

    @Override
    double getCost() {
        return super.getCost();
    }
}