package berisha.cafe;

/**
 * The tea class, which is currently not extended by any other class.
 * By default it returns "Chai tea" in the description and +3 in the cost, this can also be extended, by
 * making chai tea its own class, extending tea and adding a variety of tea sorts.
 */
public class Tea extends Beverage{
    @Override
    public String getDescription() {
        return super.getDescription() + " Chai tea ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3;
    }
}
