package subprogram.examples;
import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        itIsAMultiple(num1, num2);

    }

    public static void itIsAMultiple (int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de " + num2);
        } else {
            System.out.println("El numero " + num1 + " no es multiplo de " + num2);
        }
    }
}
