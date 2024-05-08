package oop.oop_interfaces;

public class Keyboard {

    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public void description(String description) {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "name='" + name + '\'' +
                '}';
    }
}
