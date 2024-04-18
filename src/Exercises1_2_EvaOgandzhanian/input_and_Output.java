package Exercises1_2_EvaOgandzhanian;

import java.util.Scanner;

public class input_and_Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput + ", Welcome to the training!");

        geometry();
    }

    public static void geometry() {
        Scanner calculator = new Scanner(System.in);

        System.out.println("Please, enter a number for the var a");
        int a = calculator.nextInt();

        System.out.println("Please, enter a number for the var b");
        int b = calculator.nextInt();

        int area = a * b;
        int perimeter = 2 * (a + b);

        System.out.println("The area of the rectangle is " + area + " The perimeter of the rectangle is " + perimeter);

        formattingTextOutput();
    }


    public static void formattingTextOutput() {
        System.out.println("\t    _    _");
        System.out.println("\t   /=\\\"\"/=\\");
        System.out.println("\t  (=(0__0 |=)___");
        System.out.println("\t   \\_\\ _/_/     )");
        System.out.println("\t     /_/     _  /\\");
        System.out.println("\t    |/ |\\ |  | |");
        System.out.println("\t      ~    ~   ~");
    }
}

