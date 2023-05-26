package Exercises1to5;
import java.util.Scanner;
import java.lang.*;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = read.nextInt();

        int doble = num * 2;
        System.out.println("El doble del numero ingresado es " + doble);

        int triple = num * 3;
        System.out.println("El triple del numero ingresado es " + triple);

        double raiz = Math.sqrt(num);
        System.out.println("La raiz cuadraada del numero ingresado es " + raiz);
    }
}
