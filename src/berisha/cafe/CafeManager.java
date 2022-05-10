package berisha.cafe;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * This is the café manager class with which the program can be started and
 * the admin options are implemented.
 */
public class CafeManager {
    static ArrayList<Order> allOrders = new ArrayList<>();
    static AtomicInteger orderId = new AtomicInteger(0);
    public static void chooseStartAction() {
        IOHandler.printCup();
        IOHandler.printStartMenu();
        Scanner input = new Scanner(System.in);
        int choice = IOHandler.isInteger(input.next());
        while (choice != 4) {
            switch (choice) {
                case 1 -> adminOptions();
                case 2 -> createOrder();
                case 3 -> System.exit(0);
            }
            IOHandler.printStartMenu();
            choice = IOHandler.isInteger(input.next());
        }
    }

    /**
     * this method starts the entire process of the app.
     */
    public static void startCafe(){
        initOrders();
        chooseStartAction();
    }

    /**
     * initialises two orders, so the order list is not empty upon start.
     */
    public static void initOrders() {
        Order order = new Order(orderId);
        order.addItem(new WhippedCream(new Coffee()));
        order.addItem(new Ice(new Tea()));
        Beverage coffee = new Espresso();
        Order newOrder = new Order(orderId);
        newOrder.addItem(coffee);
        allOrders.add(order);
        allOrders.add(newOrder);
    }


    /**
     * checks if the correct admin password has been entered.
     */
    public static void checkIfAdmin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        while (!IOHandler.validateString(input.next()).equals("admin123")) {
            System.err.println("Incorrect password. Try again.");
        }
    }

    /**
     * If the correct password is entered, one can delete an order or even all orders, an can look at all orders.
     */
    public static void adminOptions() {
        checkIfAdmin();
        Scanner input = new Scanner(System.in);
        IOHandler.printAdminOptions();
        int choice = IOHandler.isInteger(input.next());
        while (choice != 4) {
            switch (choice) {
                case 1 -> IOHandler.printAllOrders(allOrders);
                case 2 -> deleteAnOrder();
                case 3 -> allOrders.removeAll(allOrders);
            }
            IOHandler.printAdminOptions();
            choice = IOHandler.isInteger(input.next());
        }

    }

    /**
     * with this method an order can be deleted, via the order id (since that is also the index in the all order list)
     */
    public static void deleteAnOrder() {
        Scanner input = new Scanner(System.in);
        IOHandler.printAllOrders(allOrders);
        System.out.println("Enter the order ID of the order you'd like to delete: ");
        int index = IOHandler.isInteger(input.next());
        allOrders.remove(allOrders.get(index));
    }

    /**
     * with this class an order can be created and directly added to the all orders list.
     */
    public static void createOrder() {
        Scanner input = new Scanner(System.in);
        IOHandler.printOrderOptions();
        Order newOrder = new Order(orderId);
        int choice = IOHandler.isInteger(input.next());
        while (choice != 9) {
            switch (choice) {
                case 1 -> newOrder.addItem(createCoffee());
                case 2 -> newOrder.addItem(new Tea());
                case 3 -> newOrder.addItem(new Water());
                case 4 -> newOrder.addItem(createMenu());
                case 5 -> newOrder.addItem(new Croissant());
                case 6 -> newOrder.addItem(chooseSide());
                case 7 -> payingForFood(newOrder);
                case 8 -> {
                    allOrders.remove(newOrder);
                    startCafe();
                }
            }
            allOrders.add(newOrder);
            IOHandler.printOrderOptions();
            choice = IOHandler.isInteger(input.next());
        }
    }

    /**
     * @return returns differently flavored coffee, which are all defined in the coffee class.
     */
    public static Beverage createCoffee() {
        Scanner input = new Scanner(System.in);
        IOHandler.printCoffeeOptions();
        Beverage beverage = null;
        int choice = IOHandler.isInteger(input.next());
        switch (choice) {
            case 1 -> beverage = Coffee.createAmarettoCoffee();
            case 2 -> beverage = Coffee.createCaramelCoffee();
            case 3 -> beverage = new Coffee();
            case 4 -> beverage = Coffee.createIcedCoffee();
            case 5 -> beverage = Coffee.createVanillaCoffee();
            case 6 -> beverage = Coffee.createCoffeeWithWhippedCream();
            case 7 -> beverage = new Espresso();
            default -> System.out.println("Going back to menu...");
        }
        return beverage;
    }

    /**
     * @return returns menu, whether the user creates a custom menu or chooses a preset menu.
     */
    public static Menu createMenu() {
        Scanner input = new Scanner(System.in);
        IOHandler.printCoffeeOptions();
        IOHandler.printMenuCreationOptions();
        Menu menu = null;
        switch (IOHandler.isInteger(input.next())) {
            case 1 -> menu = choosePresetMenu();
            case 2 -> menu = createCustomMenu();
            default -> System.out.println("Going back to menu...");
        }
        return menu;
    }

    /**
     * @return returns side the user chooses, from selection.
     */
    public static Side chooseSide() {
        Side side = null;
        Scanner input = new Scanner(System.in);
        IOHandler.printSideOptions();
        int choice = IOHandler.isInteger(input.next());
        switch (choice) {
            case 1 -> side = new Fries();
            case 2 -> side = new Salad();
            default -> {
                side = new NoSide();
                System.out.println("No side selected");
            }
        }
        return side;
    }

    /**
     * @return returns preset menu the user chooses.
     */
    public static Menu choosePresetMenu() {
        Menu menu = null;
        IOHandler.printMenuOptions();
        Scanner input = new Scanner(System.in);
        int choice = IOHandler.isInteger(input.next());
        switch (choice) {
            case 1 -> menu = Menu.createBreakfastMenu();
            case 2 -> menu = Menu.createSandwichMenu();
            case 3 -> System.out.println("No menu selected");
        }
        return menu;
    }

    /**
     * @return returns the menu the user has created with given beverages, sides, pastry or food.
     */
    public static Menu createCustomMenu() {
        Beverage beverage = createCoffee();
        Side side = chooseSide();
        Food food = chooseFood();
        IOHandler.pastry();
        Scanner input = new Scanner(System.in);
        if (!IOHandler.validateString(input.next()).toLowerCase().equals("y")) {
            return new Menu(food, side, new NoPastry(), beverage);
        } else {
            return new Menu(food, side, new Croissant(), beverage);
        }
    }

    /**
     * @return returns the food the user chooses from the options.
     */
    public static Food chooseFood() {
        IOHandler.printFoodOptions();
        Scanner input = new Scanner(System.in);
        Food food = null;
        IOHandler.printMenuOptions();
        int choice = IOHandler.isInteger(input.next());
        switch (choice) {
            case 1 -> food = new Sandwich();
            case 2 -> food = new Breakfast();
            default -> System.out.println("No food selected");
        }
        return food;
    }

    /**
     * @param order to calculate the total price and calculate the change, we need the entire order
     *              so we can calculate the order's cost and the change accordingly (and rounds the cost).
     */
    public static void payingForFood(Order order) {
        Scanner input = new Scanner(System.in);
        System.out.println("To pay: CHF " + order.calculatePrice());
        System.out.println("Please input your payment amount: ");
        double paymentAmount = IOHandler.isDouble(input.next());
        double change = order.calculateChange(paymentAmount);
        while (change < 0) {
            System.err.println("Not enough money. Please try again: ");
            paymentAmount = IOHandler.isDouble(input.next());
            change = order.calculateChange(paymentAmount);
        }
        if (change >= 0) {
            System.out.println("Here's your change: CHF " +  change);
        }
        System.out.println("Have a lovely day :)");
        System.out.println("─────────────────────────────────");
        System.out.println("Would you like to continue?");
        System.out.println("Please enter 'y' or 'n'.");
        if (IOHandler.validateString(input.next()).toLowerCase().equals("y")) {
            chooseStartAction();
        } else {
            System.exit(0);
        }
    }
}
