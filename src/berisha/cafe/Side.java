package berisha.cafe;

public abstract class Side extends Food {
    @Override
    String getDescription() {
        return super.getDescription() + "with ";
    }

    @Override
    double getCost() {
        return super.getCost();
    }
}