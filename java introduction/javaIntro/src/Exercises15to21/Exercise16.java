package Exercises15to21;
import java.util.Scanner;
import java.lang.Math;
/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */


public class Exercise16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo para dimensionar el vector");
        int n = read.nextInt();
        int[] vector = new int[n];

        System.out.println("Escoja un numero");
        int num = read.nextInt();

        fullVector(n, vector);
        searchNumber(vector, num);
    }
    public static void fullVector(int n, int [] vector){
        int min = 0;
        int max = 10;
        for (int i = 0; i < n; i++) {
            //In the following formula we create a program that generates random numbers between a minimum and a maximum value
            vector[i] = (int) ((Math.random() * ((max - min) + 1)) + min);
            System.out.println(vector[i]);
        }
        System.out.println("Vector de tamanio " + n + " completado con valores aleatorios entre "  + min + " y " + max);
    }

    public static void searchNumber(int[] vector, int num){
        
    }
}
