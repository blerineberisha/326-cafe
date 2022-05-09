package berisha.cafe;

public class Coffee extends Beverage {
    @Override
    public String getDescription() {
        return super.getDescription() + " Coffee ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4;
    }
}
