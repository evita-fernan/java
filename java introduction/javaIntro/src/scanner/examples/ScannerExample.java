package scanner.examples;

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Esta clase permite guardar los valores ingresados por consola");

        System.out.println("Ingrese su nombre");
        String name = read.nextLine();

        System.out.println("Ingrese su año de nacimiento");
        int year = read.nextInt();

        System.out.println("Su nombre es " + name + " y nació en el año " + year);
    }
}
