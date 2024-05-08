package oop.oop_interfaces;

import all_methods.Arrays;

public class InventoryList {
    public static void main(String[] args) {


    //creating objects and then an arr from objects
        Monitor monitor1 = new Monitor("Dell");
        Keyboard keyboard1 = new Keyboard("Logi");
        Prozessor prozessor1 = new Prozessor("Intel Xeon");
        Prozessor prozessor2 = new Prozessor("CPU");

        Object[] inventoryList = new Object[4];

        inventoryList[0] = monitor1;
        inventoryList[1] = keyboard1;
        inventoryList[2] = prozessor1;
        inventoryList[3] = prozessor2;

    //printing the array
        /*for (Object item : inventoryList) {
            System.out.println(item);
        }*/

    // call method description and give it a string as a param
        monitor1.description();
        keyboard1.description();
        prozessor1.description();
        prozessor2.description();


    }
}