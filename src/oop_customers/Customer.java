package oop_customers;

public class Customer {

    private int id;
    private String name;
    private String address;
    private String postcode;
    private String city;
    private String email;


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Customer() {
        this.id = -1;
        this.name = "";
        this.address = "";
        this.postcode = "";
        this.city = "";
        this.email = "";
    }

    public Customer(int id, String name, String postcode, String address, String city, String email) {
        this.id = id;
        this.name = name;
        this.postcode = postcode;
        this.address = address;
        this.city = city;
        this.email = email;
        this.address = this.validateAddress();
        this.name = this.validateName();
        this.email = this.validateEmail();
        this.postcode = this.validatePostcode();
        this.id = this.validateId();
    }


    private int validateId() {
            return (name != null && this.id < 0) ? this.id = 0 : this.id;
        }

    private String validateName() {
            return (name != null && this.name.isEmpty()) ? this.name = "unknown" : name;
    }

    private String validateAddress() {
        return (name != null && address.length() > 20) ? address.substring(0, 20) : address;
    }

    private String validatePostcode() {
            if ((postcode.length() == 5) && (postcode.matches("\\d+"))) {
                return postcode;
            } else {
                return postcode = "00000";
            }
        }

    private String validateEmail() {
            //return email.length() >= 0 ? city = "unknown" : city;

            if (email.length() < 5 || !email.contains("@") || !email.contains(".") ||
                    email.indexOf(".") < email.indexOf("@")) {
                return "";
            } else {
                return email;
            }
        }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.email = this.validateEmail();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.id = this.validateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.name = this.validateName();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        this.address = this.validateAddress();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
        this.postcode = this.validatePostcode();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        this.city = this.validateName();
    }

}
