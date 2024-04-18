package Exercises1_2_EvaOgandzhanian;

import java.util.Scanner;

public class Oop {


    public static class Calculator {

        // Class Variable
        private static int classValue;

        // Instance variable
        private int currentValue;

        // Constructor
        public Calculator(int startValue){
            currentValue = startValue;
        }

        public void printValue() {
            System.out.println(currentValue);
        }

        // Methode
        public void plus(int value) {
            currentValue += value;
        }

        public void minus(int value) {
            currentValue -= value;
        }

        public void multiply(int value) {
            currentValue *= value;
        }

        public void divide(int value) {
            currentValue /= value;
        }

        public int getResult() {
            return currentValue;
        }

    }

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator( 0);
        myCalculator.printValue();


        myCalculator.plus(8);
        myCalculator.multiply(2);
        myCalculator.divide(4);
        System.out.println(myCalculator.getResult());
    }

}
