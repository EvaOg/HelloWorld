package arrays.guest_list;

import java.util.Scanner;

public class Main {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);
    static int option;

    public static void main(String[] args) {
        insertTestNames();


        do {
            displayMenu();
            if (option == 1) {
                displayGuests();
            } else if (option == 2) {
                addGuest();
            } else if (option == 3) {
                removeGuest();
            } else if (option == 4) {
                break;
            }

        } while (true);

    }

    static void displayGuests() {
        System.out.println("______________________ \n - Guests - \n ");
        boolean noGuest = true;
        for (int i = 0; i < guests.length; i++) {
            //int number = Integer.parseInt(guests[i] +1);
            //System.out.println((guests[i] == null) ? " " : ((i +1) + ". " + guests[i]));
           // System.out.println((guests[i] == null) ? ((i +1) + "." + " --") : ((i +1) + ". " + guests[i]));

            if (guests[i] != null) {
                System.out.println((i +1) + ". " + guests[i]);
                noGuest = false;
            }

        }
        if (noGuest) {
            System.out.println("Guest list is empty");
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

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Enter Guest Name: ");
                String name = scanner.next();
                guests[i] = name;
                break;
            }
        }
    }

    static void removeGuest() {
        System.out.print("Enter Guest Name: ");
        String name = scanner.next();
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].equals(name)) {
                guests[i] = null;
                break;
            }
        }
    }

    static void insertTestNames(){
        for (int i = 0; i < guests.length; i++) {
                guests[0] = "Jane";
                guests[1] = "Olaf";
                guests[2] = "Mark";
                guests[3] = "Nick";
                guests[4] = "Jake";
        }

    }

}


