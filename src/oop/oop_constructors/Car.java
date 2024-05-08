package oop.oop_constructors;

public class Car {



    private String color;
    private int power;
    private String driverName;


 //Add a constructor without arguments, which assigns default values for all properties.
 // For example, strings are set to the empty string and integers are set to 0.
    public Car() {
        this.color = "";
        this.power = 0;
        this.driverName = "";
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public String getDriverName() {
        return driverName;
    }
}
