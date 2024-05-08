package oop.oop_interfaces;

public class Prozessor implements Description{

    private String name;

    public Prozessor(String name) {
        this.name = name;
    }

    public void description() {
        System.out.println("Prozessor: " + name);
    }


}
