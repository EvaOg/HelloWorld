package oop_constructors;

public class Car {

    private String color;
    private int power;
    private String driverName;

    public String getColor() {
        return color;
    }

    public Car() {
        this.color = "";
        this.power = 0;
        this.driverName = "";
    }

    public int getPower() {
        return power;
    }

    public String getDriverName() {
        return driverName;
    }
}
