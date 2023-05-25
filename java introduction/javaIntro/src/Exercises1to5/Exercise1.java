package Exercises1to5;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println("La suma de los numeros es " + (a+b) );
    }
}
