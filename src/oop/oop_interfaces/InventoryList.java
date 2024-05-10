package oop.oop_interfaces;

public class InventoryList {
    public static void main(String[] args) {

    //creating objects and then an arr from objects
        //Variant 1

        Monitor monitor1 = new Monitor("Dell");
        Keyboard keyboard1 = new Keyboard("Logi");
        Processor processor1 = new Processor("Intel Xeon");
        Processor processor2 = new Processor("CPU");

        Description[] inventoryList = new Description[4];

        inventoryList[0] = monitor1;
        inventoryList[1] = keyboard1;
        inventoryList[2] = processor1;
        inventoryList[3] = processor2;

      //Variant 2  List<InventoryList> inventory .. and them add to the List


    // call method description and give it a string as a param
        monitor1.description("Super monitor!");
        keyboard1.description("Super keyboard!");
        processor1.description("Super processor!");
        processor2.description("Super processor!");

    }
}