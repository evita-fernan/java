package Exercises1to5;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o una frase");
        String word = read.nextLine();
        System.out.println("La frase es mayuscula es: ");
        System.out.println(word.toUpperCase());
        System.out.println("La frase es minuscula es: ");
        System.out.println(word.toLowerCase());
    }
}
