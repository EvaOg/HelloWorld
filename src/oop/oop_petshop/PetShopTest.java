package oop.oop_petshop;

public class PetShopTest {
    public static void main(String[] args) {
        Pet mia = new Pet("Mia", 2); // Furkans Katze 😸
        mia.cuddle();
//        System.out.println(mia);

        PetShop fettnapf = new PetShop("Fettnapf", 42);
//        System.out.println(fettnapf);

        fettnapf.printStock();
    }
}
