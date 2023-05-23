package scanner.examples;
import java.util.Scanner;
public class WhileExample {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una nota");
        int nota = read.nextInt();

        while (nota < 0 || nota > 10 ) {

            System.out.println("La nota no es correcta. Ingrese una nota entre 0 y 10");
            nota = read.nextInt();

        }

        System.out.println("La nota es correcta");
    }
}
