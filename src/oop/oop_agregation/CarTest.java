package oop.oop_agregation;

public class CarTest {
    public static void main(String[] args) {
        //Create the classes Wheel and Door, each with a private field weight.
        //Set the weight only from the constructor
        //Every class returns its weight from a public getter
        //Then complete the method getTotalWeight in the Car class. This should be the sum of all oop.car parts.
        //Use case: A oop.car weighs one ton, a wheel 100kg and a door 150kg.
        // Assuming, a oop.car has four doors and four wheels, we expect
        // a total weight of 2 tons.
       //Create a main method which implements this case and verify the results.


        Car car1 = new Car( new Wheel[]{}, new Door[]{}, 1000.0f);
        Wheel [] wheels = new Wheel[]{new Wheel(100.0f), new Wheel(100.0f), new Wheel(100.0f), new Wheel(100.0f)};
        Door []  doors = new Door[]{new Door(150f), new Door(150f), new Door(150f), new Door(150f)};

        System.out.println(car1.getTotalWeight());

    }
}
