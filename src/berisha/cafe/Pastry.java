package berisha.cafe;

/**
 * The pastry class that extends food.
 * Only the croissant object uses the pastry class so far,
 * could be extended.
 * Here you can create pastry objects and get the cost and description of the pastry.
 */
public abstract class Pastry extends Food {
    @Override
    double getCost() {
        return super.getCost();
    }

    @Override
    String getDescription() {
        return super.getDescription() + "Pastry, ";
    }
}
