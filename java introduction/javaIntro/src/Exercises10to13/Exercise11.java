package Exercises10to13;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int option;
        String res = "S";

        System.out.println("Ingrese un numero");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = read.nextInt();

        String decision = "N";

        do {
            System.out.println("Seleccione una opción:\n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \n Elija un numero:");
            option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.println("La suma de los numeros ingresados es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros ingresados es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("La división de los numeros ingresados es: " + dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Desea salir del programa? responda S o N");
                    decision = read.next().toUpperCase();

                    if (decision.equals(res)) {
                        System.out.println("INGRESEEE");
                        break;
                    }
                /*default:
                    System.out.println("Ingrese una de las opciones ofrecidas");*/
            }
        } while ( (option != 5) || (decision.equals("N")));
    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }
    public static int restar(int num1, int num2){
        int resta;
        resta = num1 - num2;
        return resta;
    }
    public static int multiplicar(int num1, int num2){
        int multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;
    }
    public static double dividir(int num1, int num2){
        double division;
        division = num1 / num2;
        return division;
    }
}