package oop.car;

public class Main {
    public static void main(String[] args) {
      Door dd = new Door();
      dd.close();
      dd.name = "Driver's door";
      dd.printStatus();

      Door pd = new Door();
      pd.open();
      pd.name = "Passenger's door";
      pd.printStatus();
    }
}
