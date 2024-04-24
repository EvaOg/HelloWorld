package computer;

public class Computer {

    private String name; //
    private String screenSize;
    private String operatingSystem;  //Windows 11,   Windows 11 Pro

    private String processor; //Intel Core 5, Intel Core 7, Intel Xeon, Intel Core i5
    private String RAM; //16GB, 8GB
    private String numberUsbPorts; //
    private String hardDriveSize; //240 GB,
    private String type; // Comp, Laptop
    private String processorSpeed; // 3200MHz

    private int purchasePrice;
    private int sellingPrice;
    //private int profit;


    //The computer should have three constructors:
    // 1) a default constructor

    public Computer() {
        System.out.println("Computer");
    }

    // 2) a constructor with the minimum values of manufacturer name, screen size, and preinstalled operating system

    public Computer(String name, String screenSize, String operatingSystem) {
        this.name = name;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }


    // 3) a constructor requiring all values

    public Computer(
            String name,
            String screenSize,
            String operatingSystem,
            String processor,
            String RAM,
            String numberUsbPorts,
            String hardDriveSize,
            String type,
            String processorSpeed,
            int purchasePrice,
            int sellingPrice) {
        this.name = name;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.RAM = RAM;
        this.numberUsbPorts = numberUsbPorts;
        this.hardDriveSize = hardDriveSize;
        this.type = type;
        this.processorSpeed = processorSpeed;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }


    //Create getters and setters for each field of the class (all properties are private).

    public String getName() {
        return name;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String isOperatingSystem() {
        return operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRAM() {
        int ram = Integer.parseInt(RAM)*2;
        String RAM = String.valueOf(ram);
        return RAM;
    }

    public String getNumberUsbPorts() {
        return numberUsbPorts;
    }

    public String getHardDriveSize() {
        return hardDriveSize;
    }

    public String getType() {
        return type;
    }

    public String getProcessorSpeed() {
        return processorSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setHardDriveSize(String hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public void setNumberUsbPorts(String numberUsbPorts) {
        this.numberUsbPorts = numberUsbPorts;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProcessorSpeed(String processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int calculateProfit(int sellingPrice, int purchasePrice) {
        int profit = sellingPrice - purchasePrice;
        return profit;
    }

//Add a toString() method to the class, which returns the computer's properties as a string

    //What other properties could be relevant for the computer shop? Feel free to add them.
}
