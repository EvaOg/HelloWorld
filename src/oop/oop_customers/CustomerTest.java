package oop.oop_customers;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer(-1, "John", "12345", "Berlin Lenin str 12", "Berlin", "john@gmail.com");

        System.out.println();
        customer.setEmail("dfdg");
        System.out.println(customer.toString());
    }
}
