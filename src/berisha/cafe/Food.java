package berisha.cafe;

/**
 * With this class food items can be created.
 */
public abstract class Food extends Item {

    @Override
    String getDescription() {
        return super.getDescription() + "Food: ";
    }

    @Override
    double getCost() {
        return 0;
    }
}
