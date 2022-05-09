package berisha.cafe;

public class Tea extends Beverage{
    @Override
    public String getDescription() {
        return super.getDescription() + " Coffee ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3;
    }
}
