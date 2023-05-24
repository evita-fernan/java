package subprogram.examples;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una palabra finalizada con .");
        String word = read.nextLine();

        String wordCodified = codifyWord(word);
        System.out.println(wordCodified);
    }

    public static String codifyWord (String word) {
        int len = word.length();
        String letterCodified = "";

        for (int i = 0; i < len; i++) {
            char letter = word.charAt(i);
            String codify = String.valueOf(letter);
            switch (Character.toLowerCase(letter)) {
                case 'a':
                    codify = "@";
                case 'e':
                    codify = "#";
                case 'i':
                    codify = "$";
                case 'o':
                    codify = "%";
                case 'u':
                    codify = "*";
            }
            letterCodified = letterCodified.concat(codify);
        }

        return letterCodified;
    }
}
