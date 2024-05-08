package oop.oop_petshop;

public class Hamster extends Pet {

    private boolean isAwake;

    public Hamster(String name, int age, boolean isAwake) {
        super(name, age);
        this.isAwake = isAwake;
    }

    public void runAsHell() {
        System.out.println("Running 🐹");
    }
}
