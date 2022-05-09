package berisha.cafe;

/**
 * This is the Item interface, which essentially
 * gets the cost and description an Item
 */
public abstract class Item {
    private String description;
    abstract double getCost();

    String getDescription(){
        return description;
    }
}
