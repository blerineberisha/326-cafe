package berisha.cafe;

/**
 * The salad class that extends the side class.
 * Here a salad can be created, and you can get the cost and description of the side.
 */
public class Salad extends Side {
    @Override
    String getDescription() {
        return super.getDescription() + "Salad";
    }

    @Override
    double getCost() {
        return super.getCost() + 4.2;
    }
}
