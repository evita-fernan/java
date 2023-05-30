package Exercises10to13;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String special = "&&&&&";
        String caracter = "";

        do {
            System.out.println("Ingrese una cadena de no mas de 5 caracteres");
            caracter = read.nextLine();
            int qty = caracter.length();
            int counterCorrect = 0;
            int counterIncorrect = 0;

            if (qty > 5) {
                System.out.println("Se supero la cantidad maxima de caracteres permitidos. Reinicie el programa");
            }

            String first = caracter.substring(0, 1).toUpperCase();
            System.out.println("SOY FIRST " + first);
            String last = caracter.substring(qty - 1).toUpperCase();
            System.out.println("SOY LAST " + last);

        }
        while (!caracter.equals(special));

    }
}
