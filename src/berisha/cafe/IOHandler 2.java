package berisha.cafe;

import java.util.ArrayList;

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

    public static void processPayment() throws InterruptedException {
        System.out.println("Processing...");
        Thread.sleep(3000);
        System.out.println("Done!");
    }

    public static void printOrderOptions() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║             Options             ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. Order coffee                 ║");
        System.out.println("║ 2. Order Tea                    ║");
        System.out.println("║ 3. Order Softdrink              ║");
        System.out.println("║ 4. Order Menu                   ║");
        System.out.println("║ 5. Order Pastry                 ║");
        System.out.println("║ 6. Order Side                   ║");
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

    public static void printAllOrders(ArrayList<Order> allOrders) {
        for (Order o : allOrders) {
            System.out.println(o.getOrderId());
            for (Item item : o.getOrder()) {
                System.out.println("Item: " + item.getDescription());
                System.out.println("Price: " + item.cost());
            }
        }
    }

    public static void printAdminOptions(){
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║             Options             ║");
        System.out.println("╟─────────────────────────────────╢");
        System.out.println("║ 1. View all orders              ║");
        System.out.println("║ 2. Delete an order              ║");
        System.out.println("║ 3. Delete all orders            ║");
        System.out.println("║ 4. Exit                         ║");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static void printItemsOfOrder(Order order) {
        System.out.println("╔═════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║ ORDER                                                                   ║");
        System.out.println("╟─────────────────────────────────────────────────────────────────────────╢");
        System.out.println("║ Nr.  Item                                                      Price    ║");
        System.out.println("╠═════════════════════════════════════════════════════════════════════════╣")
        ;
        for (Item item : order.getOrder()) {
            String toPad = (String.format("%-20s", item.getDescription() + String.format("%50s", item.cost() + " CHF")));
            String padded = String.format("%-45s", toPad);
            System.out.println("║ " + order.getOrderId() + ".   " + padded + "  ║" );

        }
        System.out.println("╚═════════════════════════════════════════════════════════════════════════╝");
    }
}
