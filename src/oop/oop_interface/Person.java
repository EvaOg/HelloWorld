package oop.oop_interface;

public class Person implements Greeting {
    private String name;
    private int age;
    private int salary;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    @Override
    public void sayHello() {
        System.out.println("Hallo, " + name + "!");
    }
}
