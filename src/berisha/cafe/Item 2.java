package berisha.cafe;

/**
 * This is the Item interface, which essentially
 * gets the cost and description an Item
 */
public interface Item {
    default double cost() {
        return 0;
    }

    default String getDescription() {
        return null;
    }
}
