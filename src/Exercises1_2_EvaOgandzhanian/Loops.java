package Exercises1_2_EvaOgandzhanian;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {

    public static void main(String[] args) {
        Scanner triangles = new Scanner(System.in);


        System.out.print("How large should the triangles be?");
        int size = triangles.nextInt();

        System.out.print("How many triangles would you like?");
        int number = triangles.nextInt();


        for (int amountOfTrees = 0; amountOfTrees < number; amountOfTrees++) {
            for (int rowsInTree = 1; rowsInTree <= size; rowsInTree++) {

                for (int starsInLine = 1; starsInLine <= rowsInTree; starsInLine++) {
                    System.out.print("*");
                }

                System.out.println("");
            }
            System.out.println("");
        }

        guessNumber();
    }

    public static void guessNumber() {
        Scanner guessNumber = new Scanner(System.in);

        int number = ThreadLocalRandom.current().nextInt(1, 101);

        int input;

        do {
            System.out.print("Guess the number: ");
            input = guessNumber.nextInt();

            if(input == number) {
                System.out.println("This is the number!");
            }
            else if (input < number) {
                System.out.println("The number is greater then this one. Try again.");

            }
            else {
                System.out.println("The number is less then this one. Try again.");
            }
        } while (input != number);

    }
}
