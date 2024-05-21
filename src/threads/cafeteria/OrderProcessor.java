package threads.cafeteria;

import exercises1_2.Arrays;

public class OrderProcessor implements Runnable {
    String ordertoCook;

    public OrderProcessor(String order) {
    this.ordertoCook = order;
    }


    @Override
    public void run() {
        System.out.println("The " + ordertoCook + " is ready");
    }
}
