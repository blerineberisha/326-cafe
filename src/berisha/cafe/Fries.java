package berisha.cafe;

/**
 * This is the fries class. Fries are a side which can be ordered separately or in a menu.
 */
public class Fries extends Side {
    @Override
    String getDescription() {
        return super.getDescription() + "Fries";
    }

    @Override
    double getCost() {
        return super.getCost() + 2.95;
    }
}
