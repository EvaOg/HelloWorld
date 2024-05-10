package oop.oop_interfaces;

public class Processor implements Description{

    private String name;

    public Processor(String name) {
        this.name = name;
    }

    /*public void description() {
        System.out.println("Processor: " + name);
    }*/

    public void description(String description) {
        System.out.println("Processor " + name + ": " + description);
    }


}
