package guest_list;

import java.util.Scanner;

public class Main {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);
    static int option;

    public static void main(String[] args) {

        do {
            displayMenu();

            if (option == 1) {
                displayGuests();
            } else if (option == 2) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Enter Guest Name: ");
                        String name = scanner.next();
                        guests[i] = name;
                        break;
                    }
                }
            } else if (option == 3) {
                System.out.print("Enter Guest Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        i = (guests.length - 1);
                        break;
                    }
                }
            } else if (option == 4) {
                break;
            }

        } while (true);

    }

    static void displayGuests() {
        System.out.println("______________________ \n - Guests - \n ");
        for (int i = 0; i < guests.length; i++) {
            //int number = Integer.parseInt(guests[i] +1);
            System.out.println((guests[i] == null) ? ((i +1) + "." + " --") : ((i +1) + ". " + guests[i]));
        }
    }

    static void displayMenu() {
        System.out.println("______________________ \n - Menu - \n ");
        System.out.println("1 - Display All Guests");
        System.out.println("2 - Add Guest");
        System.out.println("3 - Remove Guest");
        System.out.println("4 - Exit");
        System.out.println(" ");
        getOption();
    }

    static void getOption() {
        System.out.print("Option: ");
        option = scanner.nextInt();
    }
}
