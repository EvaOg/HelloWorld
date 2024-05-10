package string;

public class Test {
    public static void main(String[] args) {

                String meinGesichertesPasswort = encrypt("Hallo"); //Verschlüsselung "Hallo" -> "Icopt"
                System.out.println("Verschlüsselt: " + meinGesichertesPasswort); //Ausgabe "Icopt"
                String meinUnverschluesseltesPasswort = decrypt(meinGesichertesPasswort); //Entschlüsselung "Icopt" -> "Hallo"
                System.out.println("Entschlüsselt: " + meinUnverschluesseltesPasswort); //Ausgabe "Hallo"
            }

            public static String encrypt(String input) {
                char[] charArray = input.toCharArray(); //String wird zu Array bestehend aus Chars ["H","a","l","l",o"]
                char[] cryptoArray = new char[charArray.length]; //Leeres Array für das verschlüsselte PW erstellen

                for (int i = 0; i < charArray.length; i++) {
                    int asciiValue = (int) charArray[i]; //Aus "H" wird 72, aus "a" wird 97 usw.
                    int key = i + 1; // Der Index wird hier als Schlüssel verwendet (weiterführende Idee: random keys)
                    int asciiValueEncrypted = (asciiValue + key) % 128; // Durch Modulo entsteht kein Überlauf "H" : 72 + (key = 1) = 73
                    cryptoArray[i] = (char) asciiValueEncrypted; //Verschlüsselter Ascii-Wert wird wieder zum Char 73 -> "I" 99 ->"c"
                }

                return new String(cryptoArray);
            }

            public static String decrypt(String input) {
                char[] charArray = input.toCharArray();
                char[] decryptoArray = new char[charArray.length];

                for (int i = 0; i < charArray.length; i++) {
                    int asciiValue = (int) charArray[i];
                    int key = i + 1; // Verwende den Index (⬇ hier) als Schlüssel, wird abgezogen
                    int asciiValueDecrypted = (asciiValue - key + 128) % 128; // +128 vermeidet negative Werte
                    decryptoArray[i] = (char) asciiValueDecrypted;
                }

                return new String(decryptoArray);
            }
        }

