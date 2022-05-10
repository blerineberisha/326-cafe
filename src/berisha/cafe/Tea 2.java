package berisha.cafe;

public class Tea extends Beverage{
    @Override
    public String getDescription() {
        return super.getDescription() + " Coffee ";
    }

    @Override
    public double cost() {
        return super.cost() + 3;
    }
}
