package exercises1_2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner timeCalculator = new Scanner(System.in);

        System.out.println("Please, enter a number of seconds");
        int enteredNumber = timeCalculator.nextInt();
        int years = enteredNumber / (365 * 24 * 3600);
        int remainSec = enteredNumber % (365 * 24 * 3600);
        int days = remainSec/(24*3600);
        remainSec = remainSec % (24*3600);
        int hours = remainSec / 3600;
        remainSec = remainSec % 3600;
        int minutes = remainSec / 60;
        int sec = remainSec % 60;

        System.out.println( years + " years and " + days + " days and " + hours + " hours and " + minutes + " minutes and " + sec + "seconds");
        cylinder();
    }

    public static void cylinder() {
        Scanner cylinder = new Scanner(System.in);

        double pi = 3.14;

        System.out.println("Please, enter the circumference");
        double c = cylinder.nextDouble();

        System.out.println("Please, enter the height");
        double h = cylinder.nextDouble();

        // Calc. diameter of the lid
        double d = c / pi;

        // Calc. area of the lid
        double al = pi * ( d / 2 ) * ( d / 2 );

        // Calc. area of the casing
        double ac = c * h;

        // Calc. total required sheet area
        double at = 2 * al + ac;

        // Calculate volume
        double volume = al * h;

        System.out.println("The area of the cylinder is " + at + ". The volume of the can is " + volume);

        oneLineCode();
    }

    public static void oneLineCode() {
        System.out.println((Math.sqrt(3.5 + 15.5) * 5 / 3) - ((15.5 + 10) * (15.5 - 4.1)));
        // the result should be -283.4351684274322
    }
}
