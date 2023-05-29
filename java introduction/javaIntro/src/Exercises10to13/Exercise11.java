package Exercises10to13;
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.println("Ingrese un numero");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = read.nextInt();

        System.out.println("Seleccione una opción:\n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \n Elija un numero:");
        int option = read.nextInt();

        switch (option) {
            case 1:
                System.out.println("La suma de los numeros ingresados es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta de los numeros ingresados es: " + restar(num1, num2));
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Ingrese una de las opciones ofrecidas");
        }
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
}