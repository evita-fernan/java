package Exercises6to9;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String word = read.nextLine();
        String first = word.substring(0,1).toLowerCase();
        System.out.println(first);

        if (first.equals("a")){
            System.out.println("La primera letra es una A, CORRECTO");
        } else {
            System.out.println("La primera letra no es una A, INCORRECTO");
        }
    }
}
