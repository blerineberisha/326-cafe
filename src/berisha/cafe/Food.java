package berisha.cafe;

public abstract class Food extends Item {

    @Override
    String getDescription() {
        return super.getDescription() + "Food: ";
    }

    @Override
    double getCost() {
        return 0;
    }
}
