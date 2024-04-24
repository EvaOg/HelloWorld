package Computer2;

import java.util.ArrayList;

public class ComputerShop {

    ComputerTest computerTest = new ComputerTest();
    private ArrayList<Computer> computers = new ArrayList<>();

    public void setComputer(Computer computer) {
        computers.add(computer);
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
