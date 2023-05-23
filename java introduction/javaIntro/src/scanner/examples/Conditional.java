package scanner.examples;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = read.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = read.nextInt();

        if (num1>25 && num2 > 25) {
            System.out.println("Ambos numeros son mayor que 25");
        }
        else if (num1 > 25) {
            System.out.println("El numero 1 es mayor que 25");
        }
        else if (num2 > 25){
            System.out.println("El numero 2 es mayor que 25");
        }
        else {
            System.out.println("Ninguno de los numeros ingresados son mayor que 25");
        }
    }
}
