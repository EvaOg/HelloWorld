package oop.oop_petshop;

public class Feline extends Pet {
    // fields / properties
    private boolean isPottyTrained;

    public Feline(String name, int age, boolean isPottyTrained) {
        super(name, age);
        this.isPottyTrained = isPottyTrained;
    }


    //  method
    public void purr() {
        System.out.println("Purrrrrrrrr");
    }

    @Override
    public String toString() {

        return super.toString() + " 🐱‍👤";
    }
}
