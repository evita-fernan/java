package Exercises10to13;

import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limit = read.nextInt();
        int sum = 0;
        int temp = 1;
        while (sum <= limit) {
            System.out.println("Ingrese un numero");
            int num = read.nextInt();
            sum = sum + num;
            if (sum > limit) {
                System.out.println("La suma de los numeros ingresados supera al limite");
            }
        }
    }
}
