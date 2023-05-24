package subprogram.examples;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una palabra finalizada con .");
        String word = read.nextLine();
    }

    public static String codify (String word) {
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char letter = word.charAt(i);
            switch (letter) {
                case 'a':
                    return "@";
                case 'e':
                    return "#";
                case 'i':
                    return "$";
                case 'o':
                    return "%";
                case 'u':
                    return "*";
                default:
                    return "q";
            }
        }
        return "a";
    }
}
