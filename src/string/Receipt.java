package string;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        /*In this exercise, you are writing a console application which asks the user for details to a product and prints a receipt for the purchase.
        We ask for the product name, price, amount and whether it is food or not. When it is food, the tax is 7%, otherwise 19%.

        Example:
        Enter the product name: AAA Batteries
        Price per unit: 5
        Quantity bought: 4
        Food? (y / n): n
                --- RECEIPT ---
                Product: AAA Batteries
        Price per unit: 5
        Quantity bought: 4
        Total amount to pay, excluding tax: 20
        Total amount to pay, including tax: 23,80 Euro
        Of which is tax: 3,80 Euro
                ----------------
        Build the whole receipt as one String using StringBuilder and print it out.*/

        System.out.println("Enter a product name: ");
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();

        System.out.println("Enter a price per unit: ");
        String pricePerUn = sc.nextLine();

        System.out.println("Quantity bought: ");
        String quantityBought = sc.nextLine();

        System.out.println("Food? y/n: ");
        String isFood = sc.nextLine();
        System.out.println(isFood);


        ///////printing receipt

        double withoutTax = Integer.parseInt(pricePerUn) * Integer.parseInt(quantityBought);
        double tax = isFood.equals("y") ? ((withoutTax * 7.0) / 100) : ((withoutTax * 19.0) / 100);
        double inclTax = tax + withoutTax;
        System.out.println("");


        String receipt = "-------------------RECEIPT-------------------" + "\n" +
                "                 Product: " + productName + "\n" +
                "\tPrice per unit:" + pricePerUn + "\n" +
                "\tQuantity bought: " + quantityBought + "\n" +
                "\tTotal amount to pay, excluding tax: " +  withoutTax + "\n" +
                "\tTotal amount to pay, Total amount to pay, including tax: " +  inclTax + "\n" +
                "\tOf which is tax: " +  tax;


        System.out.println(receipt);







    }

}
