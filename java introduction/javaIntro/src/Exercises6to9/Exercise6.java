package Exercises6to9;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = read.nextInt();

        if (num % 2 == 0){
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
