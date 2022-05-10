package berisha.cafe;

/**
 * The sandwich class which extends food.
 * Here, a sandwich instance can be created, and you can get the cost and description of
 * the food item.
 */
public class Sandwich extends Food {
    @Override
    String getDescription() {
        return super.getDescription() + "Sandwich";
    }

    @Override
    double getCost() {
        return super.getCost() + 5.7;
    }
}
