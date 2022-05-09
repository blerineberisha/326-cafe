package berisha.cafe;

public class Salad extends Side {
    @Override
    String getDescription() {
        return super.getDescription() + "Salad";
    }

    @Override
    double getCost() {
        return super.getCost() + 4.2;
    }
}
