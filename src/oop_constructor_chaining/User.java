package oop_constructor_chaining;

public class User {
    private String name;
    private String country;
    private int age;


    public User() {
    }

    public User(String name) {
        this();
        this.name = name;
    }

    public User(String name, String country) {
        this(name);
        this.country = country;
    }

    public User(String name, String country, int age) {
        this(name, country);
        this.age = age;
    }

}

