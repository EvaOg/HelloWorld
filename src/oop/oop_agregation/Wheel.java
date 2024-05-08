package oop.oop_agregation;

public class Wheel {
    //Create the classes Wheel and Door, each with a private field weight.
    //Set the weight only from the constructor
    //Every class returns its weight from a public getter


    private float weight;

    public Wheel(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
