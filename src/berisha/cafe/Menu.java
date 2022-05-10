package berisha.cafe;

/**
 * This is the menu class where different menus can be created.
 * I.e., createSandwichMenu() or createBreakfastMenu();
 */
public class Menu extends Food {
    private Food food;
    private Side side;
    private Pastry pastry;
    private Beverage beverage;

    public Menu(Food food, Side side, Pastry pastry, Beverage beverage) {
        this.food = food;
        this.side = side;
        this.pastry = pastry;
        this.beverage = beverage;
    }

    public static Menu createSandwichMenu() {
        Sandwich sandwich = new Sandwich();
        Beverage beverage = CafeManager.createCoffee();
        Side side = CafeManager.chooseSide();
        return new Menu(sandwich, side, new NoPastry(), beverage);
    }

    public static Menu createBreakfastMenu() {
        Breakfast breakfast = new Breakfast();
        Beverage beverage = CafeManager.createCoffee();
        Side side = new NoSide();
        Pastry pastry = new Croissant();
        return new Menu(breakfast, side, pastry, beverage);
    }

    @Override
    String getDescription() {
        return "Menu: " +
                food.getDescription() + ", " +
                side.getDescription() + ", " +
                pastry.getDescription() + ", " +
                beverage.getDescription();
    }

    @Override
    double getCost() {
        return food.getCost() +
                side.getCost() +
                pastry.getCost() +
                beverage.getCost();
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Pastry getPastry() {
        return pastry;
    }

    public void setPastry(Pastry pastry) {
        this.pastry = pastry;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
