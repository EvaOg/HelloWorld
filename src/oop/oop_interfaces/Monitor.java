package oop.oop_interfaces;

public class Monitor implements Description{

    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    public void description(String description) {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                '}';
    }
}
