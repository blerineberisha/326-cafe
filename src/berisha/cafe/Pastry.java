package berisha.cafe;

public abstract class Pastry extends Food {
    @Override
    double getCost() {
        return super.getCost();
    }

    @Override
    String getDescription() {
        return super.getDescription() + "Pastry, ";
    }
}
