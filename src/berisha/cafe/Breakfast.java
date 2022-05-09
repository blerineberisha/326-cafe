package berisha.cafe;

public class Breakfast extends Food{
    @Override
    String getDescription() {
        return super.getDescription() + "scrambled eggs and croque monsieur";
    }

    @Override
    double getCost() {
        return super.getCost() + 9.25;
    }
}
