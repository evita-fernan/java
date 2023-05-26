package Exercises1to5;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en celsius para convertir a grados fahrenheit");
        double celsius = read.nextDouble();
        double fahrenheit;

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es "+ fahrenheit);

    }
}
