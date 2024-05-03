package all_methods;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 3: ");
        int input3 = sc.nextInt();


        switch (input3){
            case 1:
                System.out.println("Case1: " + input3);
                break;
            case 2:
                System.out.println("Case2: " + input3);
                break;
            case 3:
                System.out.println("Case3: " + input3);
                break;
            default:
                System.out.println("Wrong number!");
        }

    }
}
