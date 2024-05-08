package oop.oop_interfaces;

public class Prozessor {

    private String name;

    public Prozessor(String name) {
        this.name = name;
    }

    public void description(String description) {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return "Prozessor{" +
                "name='" + name + '\'' +
                '}';
    }
}
