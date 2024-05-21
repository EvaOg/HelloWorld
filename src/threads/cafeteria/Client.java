package threads.cafeteria;

import java.util.Random;

public class Client implements Runnable {
String order;
String[] menu = {"soup", "salad", "fish", "meet"};

    @Override
    public void run() {
        Random rn = new Random();
        order = menu[rn.nextInt(menu.length)];
        System.out.println("I order: " + order);
    }
}
