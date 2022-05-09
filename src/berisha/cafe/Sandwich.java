package berisha.cafe;

public class Sandwich extends Food {
    @Override
    String getDescription() {
        return super.getDescription() + "Sandwich";
    }

    @Override
    double getCost() {
        return super.getCost() + 5.7;
    }
}
