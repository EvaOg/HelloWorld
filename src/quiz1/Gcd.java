package quiz1;

import java.util.Scanner;



public class Gcd {

    public static int gcd(int p, int q) {
        if(q == 0) {
            return p;
        }
        int r = p % q;
        return gcd (q, r);
    }

    public static void main(String[] args) {

        //Write a program that takes two `int` as input and outputs their gcd.

        System.out.println("Enter a  first number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("Enter a  first number: ");
        int input2 = sc.nextInt();


        System.out.println(gcd(input,input2));
    }
}
