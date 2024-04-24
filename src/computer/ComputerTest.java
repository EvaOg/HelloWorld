package computer;

import java.util.ArrayList;

public class ComputerTest {

    //Create a ComputerTest class that creates the computer object
    // ...and prints its properties on the console.


    //Computer computer = new Computer();
    private ArrayList<Computer> computers = new ArrayList<>();

    public ComputerTest() {

        Computer c1 = new Computer("ASUS Laptop Vivobook", "15.6", "Windows 11", "Intel Celeron N4120", "16", "2", "240 GB", "Laptop", "3200MHz", 450, 980);
        Computer c2 = new Computer("ASUS Laptop Zenbook", "14", "Windows 11", "Intel Core 5", "16", "3", "240 GB", "Laptop", "3200MHz", 500, 1100);
        Computer c3 = new Computer("HP Stream Laptop", "11.6", "Windows 11", "Intel Core 7", "8", "2", "240 GB", "Laptop", "3200MHz", 350, 840);


        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        }

    public String toString() {
        for (Computer c : computers) {
            System.out.println(STR."""
            The computer Properties:
            \tName: \{c.getName()}
            \tScreen size: \{c.getScreenSize()} Inches
            \tOperating system: \{c.isOperatingSystem()}
            \tProcessor: \{c.getProcessor()}
            \tRAM: \{c.getRAM()}GB
            \tnumberUsbPorts: \{c.getNumberUsbPorts()}
            \tHard Drive Size: \{c.getHardDriveSize()}GB
            \tType: \{c.getType()}
            \tProcessor Speed: \{c.getProcessorSpeed()}
            \tPurchase Price: \{c.getPurchasePrice()} Euro
            \tPurchase Price: \{c.getSellingPrice()} Euro
            \tProfit: \{c.calculateProfit(c.getSellingPrice(), c.getPurchasePrice())} Euro
            \t""");
            }
        return null;
    }


}
