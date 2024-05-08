package oop.oop_interface;

public class PersonTest {
    public static void main(String[] args) {
        Person jane = new Person("Jane", 37, 50000);
        Person bob = new Person("Bob", 38, 50000);
        jane.sayHello();
        bob.sayHello();
    }

    //create new method that realize interface Greeting
    /*public static void outputGreeting (Person person) {
        person.sayHello();
    }*/

}
