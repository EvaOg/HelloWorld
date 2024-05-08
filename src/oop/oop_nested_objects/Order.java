package oop.oop_nested_objects;

public class Order {
    private long orderNo;
    private String product;
    private Address billingAddress;
    private Address deliveryAddress;

    // Parameterized constructor
    public Order(long orderNo, String product, Address billingAddress, Address deliveryAddress) {
        this.orderNo = orderNo;
        this.product = product;
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;
    }

    // Getters and setters
    public long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    // toString() method
    @Override
    public String toString() {
        return "Order{" +
                "orderNo=" + orderNo +
                ", product='" + product + '\'' +
                ", billingAddress=" + billingAddress +
                ", deliveryAddress=" + deliveryAddress +
                '}';
    }
}
