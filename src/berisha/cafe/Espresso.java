package berisha.cafe;

public class Espresso extends Coffee {
    @Override
    public double getCost() {
        return super.getCost()-2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "espresso";
    }
}
