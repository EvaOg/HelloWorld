package oop.oop_petshop;

public class Pet {
    // Fields / properties
    private String name;
    private int age;

    // Methods
    // - Constructor
    public Pet(String name, int age) {
        // super(); // call Object Konstruktor (done automatically)
        this.name = name;
        this.age = age;
    }

    // - other methods
    public void cuddle() {
        System.out.println("It feels so cosy to be cuddled 🤗");
    }

    @Override
    public String toString() {
        return "Pet " + name + ",  " + age + " years old.";
    }
}
