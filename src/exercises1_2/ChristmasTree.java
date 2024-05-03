package exercises1_2;


import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How large should the triangles be? ");
        int size = Integer.parseInt(sc.nextLine());

        System.out.print("How many triangles would you like? ");
        int amount = Integer.parseInt(sc.nextLine());
        //Äußere Schleife für Anzahl der Dreiecke
        for (int i = 0; i < amount; i++){
            //Innere Schleife für das jeweilige Dreieck, über die repeat Methode kann man die Ausgabe direkt mit println verbinden
            for (int j = 0; j <= size; j++){
                System.out.println("*".repeat(j));
            }
        }
    }


}

