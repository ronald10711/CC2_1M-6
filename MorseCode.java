import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCode {

    static int z;

    public static void main(String[] args) {

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--..",
            "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", " ", "\\s", "   ", "\\s\\s\\s"};
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "", "", "\\s", " "};

        System.out.println("Welcome Bro!");
        System.out.println("");
        System.out.println("Enter 0 to exit. ");
        System.out.println("Enter E to convert English to Morse\n"
                + "Enter M to convert Morse to English.");
        System.out.print(">> ");
        Scanner input = new Scanner(System.in);
        String morsess = input.nextLine();

        switch (morsess) {
            case "E": {
                System.out.println("Enter what you want to convert in morse.");
                System.out.print(">> ");
                String userInput = input.nextLine();
                System.out.println("Converting " + userInput + " to morse code.");
                userInput = userInput.toUpperCase();

                for (int i = 0; i < userInput.length(); i++) {
                    char x = userInput.charAt(i);
                    if (x == ' ') {
                        System.out.print("  ");
                    } else {
                        System.out.print(morse[x - 'A'] + " ");
                    }

                }
                System.out.println("");
                break;
            }
            case "M": {
                System.out.println("Enter what you want to convert in english.");
                System.out.print(">> ");
                String userInput = input.nextLine();
                System.out.println("Converting " + userInput + " to english.");
                Pattern morsePatt = Pattern.compile("[\\.-]++");
                Matcher morseMatch = morsePatt.matcher(userInput);
                while (morseMatch.find()) {
                    int x;
                    x = Arrays.asList(morse).indexOf(morseMatch.group());
                    System.out.printf(alphabet[x]);

                }
            }
            System.out.println("");
            break;
            default:
                System.out.println("SAD!");
        }

    }
}