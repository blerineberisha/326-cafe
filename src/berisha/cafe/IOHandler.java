package berisha.cafe;

import java.util.ArrayList;

/**
 * This class mainly handles the output of the project. ALl print methods can be found here.
 */
public class IOHandler {
    public static void printStartMenu() {
        System.out.println("\nWelcome to Blerinë's Café!");
        System.out.println("What would you like to do?");
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║             Options             ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. Admin view                   ║");
        System.out.println("║ 2. Order                        ║");
        System.out.println("║ 3. Exit                         ║");
        System.out.println("╚═════════════════════════════════╝");
    }


    public static void printOrderOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║             Options             ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. Order coffee                 ║");
        System.out.println("║ 2. Order Tea                    ║");
        System.out.println("║ 3. Order Water                  ║");
        System.out.println("║ 4. Order Menu                   ║");
        System.out.println("║ 5. Order Pastry                 ║");
        System.out.println("║ 6. Order Side                   ║");
        System.out.println("║ 7. Finish order                 ║");
        System.out.println("║ 8. Cancel order                 ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void printCoffeeOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║              Coffees            ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. with Amaretto flavor         ║");
        System.out.println("║ 2. with Caramel flavor          ║");
        System.out.println("║ 3. without flavor               ║");
        System.out.println("║ 4. with Ice                     ║");
        System.out.println("║ 5. with Vanilla flavor          ║");
        System.out.println("║ 6. with whipped cream           ║");
        System.out.println("║ 7. Espresso                     ║");
        System.out.println("║ 8. Back to menu                 ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void printBeverageOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║            Beverages            ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. Tea                          ║");
        System.out.println("║ 2. Coffee                       ║");
        System.out.println("║ 3. Softdrink                    ║");
        System.out.println("║ 4. Back to menu                 ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void printSideOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║               Sides             ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. Salad                        ║");
        System.out.println("║ 2. Fries                        ║");
        System.out.println("║ 3. None                         ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void printMenuOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║               Menus             ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. Sandwich                     ║");
        System.out.println("║ 2. Breakfast                    ║");
        System.out.println("║ 3. None                         ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void printFoodOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║               Foods             ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. Sandwich                     ║");
        System.out.println("║ 2. scr. eggs & croque monsieur  ║");
        System.out.println("║ 3. None                         ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void printMenuCreationOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║          Menu options           ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. Preset                       ║");
        System.out.println("║ 2. Custom                       ║");
        System.out.println("║ 3. None                         ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void printCup() {
        System.out.println("                                      ██    ██    ██                            ");
        System.out.println("                            ██      ██  ██                                      ");
        System.out.println("                            ██    ██    ██                                      ");
        System.out.println("                              ██  ██      ██                                    ");
        System.out.println("                              ██    ██    ██                                    ");
        System.out.println();
        System.out.println("                          ████████████████████                                  ");
        System.out.println("                          ██                ██████                              ");
        System.out.println("                          ██                ██  ██                              ");
        System.out.println("                          ██                ██  ██                              ");
        System.out.println("                          ██                ██████                              ");
        System.out.println("                            ██            ██                                    ");
        System.out.println("                        ████████████████████████                                ");
        System.out.println("                        ██                    ██                                ");
        System.out.println("                          ████████████████████                                  ");
    }


    public static void printItemsOfOrder(Order order) {
        System.out.println("╔═════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║ ORDER                                                                   ║");
        System.out.println("╟─────────────────────────────────────────────────────────────────────────╢");
        System.out.println("║ ID   Item                                                               ║");
        System.out.println("╠═════════════════════════════════════════════════════════════════════════╣")
        ;
        for (Item item : order.getOrder()) {
            String padded = String.format("%-65s", item.getDescription());
            System.out.println("║ " + order.getOrderId() + ".   " + padded + "  ║");

        }
        System.out.println("╟─────────────────────────────────────────────────────────────────────────╢");
        System.out.println("║                                                            Total        ║");
        System.out.println("║                                                               " + order.calculatePrice() + "   CHF ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════╝");
    }

    public static void printAllOrders(ArrayList<Order> orders) {
        for (Order order : orders) {
            printItemsOfOrder(order);
        }
    }

    public static void printAdminOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║           ADMIN VIEW            ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. View all orders              ║");
        System.out.println("║ 2. Delete an order              ║");
        System.out.println("║ 3. Delete all orders            ║");
        System.out.println("║ 4. Back to customer view        ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void pastry() {
        System.out.println("Would you like a croissant with this?");
        System.out.println("Please enter 'y' or 'n'.");
    }
}
