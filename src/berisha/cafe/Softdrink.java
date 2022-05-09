package berisha.cafe;

public class Softdrink extends Beverage {
    @Override
    public String getDescription() {
        return super.getDescription() + " Coffee ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }
}
