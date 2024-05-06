package arrays;
import java.util.Arrays;
public class PasswordChecker {
    public static void main(String[] args) {

        /**
             * We want to check an array of chars if it contains a "good" / strong password. Good passwords shall meet the following
             * requirements:
             * <ul>
             *     <li>at least 8 characters</li>
             *     <li>at least two letters</li>
             *     <li>at least two digits</li>
             *     <li>at least one uppercase and one lowercase letter</li>
             *     <li>at least one special character</li>
             *     <li>at least one digit or special character in the middle of the password (not the first or last character)</li>
             * </ul>
        */

        // Testdaten!
        char[] passwort1 = {'A','x','B','1','&','a','8','c'};
        char[] passwort2 = {'1','p','a','s','s','w','0','r','t'};

        // Probiere, ob es sich um starke Passwörter handelt
        boolean result = istStarkesPasswort(passwort1);
        System.out.println(Arrays.toString(passwort1) + " ist ein starkes Passwort? " + result);
        System.out.println(Arrays.toString(passwort2) + " ist ein starkes Passwort? " + istStarkesPasswort(passwort2));
    }

    /**
     * Diese Methode prüft ein Passwort, welches sich in einem char Array befindet, ob es die oben genannten Kriterien
     * für starke Passwörter erfüllt
     * @param passwort char Array mit dem Passwort
     * @return true, wenn es sich um ein starkes Passwort handelt - ansonsten false
     */
    private static boolean istStarkesPasswort(char[] passwort) {
        boolean istStark = true;  // boolesches Flag = Flagge oben!

        // a) mindestens 8 Zeichen
        istStark = checkAchtZeichen(passwort);

        // b) mindestens zwei Buchstaben
        // c) mindestens zwei Ziffern
        // d) mindestens einen GROSSEN und einen kleinen Buchstaben
        // von Mohannad - das geht auch mit regulären Ausdrücken 🤯
        istStark = checkMinimumAnzahl(passwort, istStark);

        // e) mindestens ein Sonderzeichen
        // TODO: Sonderzeichen-Check implementieren (Lars hatte keine Lust dazu)

        // f) mindestens eine Ziffer und ein Sonderzeichen in der Mitte
        // Mazlums Idee 💡: !isDigit() && !isLetter() && !isSpace()
        istStark = checkDieMitte(passwort, istStark);


        return istStark;
    }

    private static boolean checkDieMitte(char[] passwort, boolean istStark) {
        String specialChars = "!?=,.:#";
        boolean specialInDerMitte = false;
        boolean zifferInDerMitte = false;
        for (int i = 1; i < passwort.length - 1; i++) {
            // Prüfe ob ein Sonderzeichen vorhanden ist
            char c = passwort[i];

            if (specialChars.contains( Character.toString(c)) ) {
                specialInDerMitte = true;
            }

            // Prüfe ob eine Ziffer vorhanden ist
            if ( Character.isDigit(c) ) {
                zifferInDerMitte = true;
            }
        }
        if (!specialInDerMitte || !zifferInDerMitte) {
            istStark = false;
        }
        return istStark;
    }

    private static boolean checkMinimumAnzahl(char[] passwort, boolean istStark) {
        int ctrBuchstaben = 0;
        int ctrZiffern = 0;
        boolean checkKlein = false;
        boolean checkGross = false;
        for (char c : passwort) {
            // Alternative if-Bedingung
            /*if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
                ctr++;
            }*/

            // Zähle die Buchstaben
            if (Character.isLetter(c)) {
                ctrBuchstaben++;
                // prüfe ob ein grosser oder kleiner Buchstabe vorhanden ist
                if (Character.isUpperCase(c)) {
                    checkGross = true;
                } else {
                    checkKlein = true;
                }
            }

            // Zähle die Ziffern
            if (Character.isDigit(c)) {
                ctrZiffern++;
            }

        }
        // b) und c)
        if (ctrBuchstaben < 2 || ctrZiffern < 2) {
            istStark = false;  // Flagge runter! ⛳
        }

        // d)
        if (!checkGross || !checkKlein) {
            istStark = false; // Flagge runter! ⛳
        }
        return istStark;
    }


    private static boolean checkAchtZeichen(char[] passwort) {
        boolean istStark = true;
        if (passwort.length < 8) {
            istStark = false; // Flagge runter! Und die bleibt unten 😎
            // return false;  // von Erwin - und das ist besser! 😍
        }
        return istStark;

    }


}
