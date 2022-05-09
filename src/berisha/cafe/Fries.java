package berisha.cafe;

public class Fries extends Side {
    @Override
    String getDescription() {
        return super.getDescription() + "Fries";
    }

    @Override
    double getCost() {
        return super.getCost() + 2.95;
    }
}
