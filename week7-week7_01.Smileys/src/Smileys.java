
import java.io.*;

public class Smileys {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");

        printWithSmileys(getInput("Enter text:"));
    }

    private static void printWithSmileys(String characterString) {
        printBorder(characterString.length());
        printMiddle(characterString);
        printBorder(characterString.length());
    }
    private static String getInput(String prompt) throws IOException {
        System.out.println(prompt);
        return reader.readLine();
    }

    private static void printBorder(int inputLength) {
        int nSmile = (inputLength % 2 == 0) ? (inputLength + 6) / 2 : (inputLength + 7) / 2;
        for (int i = 0; i < nSmile; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

    private static void printMiddle(String input) {
        String out = ":) " + input;
        out += (input.length() % 2 == 0) ? " :)" : "  :)";
        System.out.println(out);
    }

}
