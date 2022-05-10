package berisha.cafe;

/**
 * This is the class for the breakfast food option. There is only one so far, but it is extendable!
 */
public class Breakfast extends Food{
    @Override
    String getDescription() {
        return super.getDescription() + "scrambled eggs and croque monsieur";
    }

    @Override
    double getCost() {
        return super.getCost() + 9.25;
    }
}
