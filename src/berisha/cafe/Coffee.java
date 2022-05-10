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

    //creates a coffee with amaretto flavoring
    public static Beverage createAmarettoCoffee(){
        Beverage amaretto = new Coffee();
        amaretto = new Amaretto(amaretto);
        return amaretto;
    }

    //creates a coffee with caramel flavoring
    public static Beverage createCaramelCoffee(){
        Beverage caramel = new Coffee();
        caramel = new Caramel(caramel);
        return caramel;
    }

    //creates an iced coffee
    public static Beverage createIcedCoffee(){
        Beverage iced = new Coffee();
        iced = new Ice(iced);
        return iced;
    }

    //creates a coffee with vanilla flavoring
    public static Beverage createVanillaCoffee(){
        Beverage vanilla = new Coffee();
        vanilla = new Vanilla(vanilla);
        return vanilla;
    }

    //creates a coffee with whipped cream
    public static Beverage createCoffeeWithWhippedCream(){
        Beverage whipped = new Coffee();
        whipped = new WhippedCream(whipped);
        return whipped;
    }
}
