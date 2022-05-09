package berisha.cafe;

public class NoPastry extends Pastry{
    @Override
    double getCost() {
        return super.getCost();
    }

    @Override
    String getDescription() {
        return super.getDescription() + "none";
    }
}
