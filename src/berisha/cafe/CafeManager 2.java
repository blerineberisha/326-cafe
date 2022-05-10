package berisha.cafe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is responsible for managing all methods.
 *
 */
public class CafeManager {
    private final static ArrayList<Order> allOrders = new ArrayList<>();

    public static void start() {
        Scanner input = new Scanner(System.in);
        IOHandler.printStartMenu();
        switch (input.nextInt()) {
            case 1: //TODO: add Admin view
                break;
            case 2:

        }
    }

    public static void checkIfAdmin(){
        System.out.println("Please enter the admin password: ");
        Scanner input = new Scanner(System.in);
        while(!input.next().equals("admin123")){
            System.err.println("Incorrect password. Try again.");
        }
    }

    public static void adminOptions(){

    }

    public static void deleteOrder(){
        Scanner input = new Scanner(System.in);
        allOrders.remove(allOrders.get(input.nextInt()));
    }

    public static void deleteAllOrders(){
        allOrders.removeAll(allOrders);
    }
}
