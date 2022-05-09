package berisha.cafe;

public class NoSide extends Side{
    @Override
    String getDescription() {
        return super.getDescription() + "nothing";
    }

    @Override
    double getCost() {
        return super.getCost();
    }
}
