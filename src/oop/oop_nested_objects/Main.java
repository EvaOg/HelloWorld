package oop.oop_nested_objects;

public class Main {
    public static void main(String[] args) {
        // Create address objects
        Address billingAddress = new Address("Lenina St 1", "12345", "Hamburg");
        Address deliveryAddress = new Address("Lenina St 2", "67890", "Hamburg");

        // Create an order object
        Order order1 = new Order(123456789, "Hello Fresh", billingAddress, deliveryAddress);

        // Print the order object
        System.out.println(order1);
    }
}
