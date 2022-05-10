package berisha.cafe;

public interface BeverageDecorator {
    String getDescription(Beverage beverage);

    double getCost(Beverage beverage);
}
