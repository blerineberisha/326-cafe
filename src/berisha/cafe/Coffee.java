package berisha.cafe;

/**
 * In this class we define and create coffees and return those instances.
 * All options with decorators or without are created here.
 */
public class Coffee extends Beverage {
    @Override
    public String getDescription() {
        return super.getDescription() + "Coffee ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4;
    }

    public static Beverage createAmarettoCoffee(){
        Beverage amaretto = new Coffee();
        amaretto = new Amaretto(amaretto);
        return amaretto;
    }

    public static Beverage createCaramelCoffee(){
        Beverage caramel = new Coffee();
        caramel = new Caramel(caramel);
        return caramel;
    }
    public static Beverage createIcedCoffee(){
        Beverage iced = new Coffee();
        iced = new Ice(iced);
        return iced;
    }

    public static Beverage createVanillaCoffee(){
        Beverage vanilla = new Coffee();
        vanilla = new Vanilla(vanilla);
        return vanilla;
    }

    public static Beverage createCoffeeWithWhippedCream(){
        Beverage whipped = new Coffee();
        whipped = new WhippedCream(whipped);
        return whipped;
    }
}
