package Exercises15to21;
import java.util.Scanner;
public class Exercise17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo para dimensionar un vector");
        int n = read.nextInt();
        int [] vector = new int[n];

        completeVector(n, vector);
        countDigits(n, vector);
    }

    public static void completeVector(int n, int [] vector){
        int min = 0;
        int max = 50;
        for (int i = 0; i < n; i++) {
            //In the following formula we create a program that generates random numbers between a minimum and a maximum value
            vector[i] = (int) ((Math.random() * ((max - min) + 1)) + min);
            System.out.println(vector[i]);
        }
        System.out.println("Vector de tamanio " + n + " completado con valores aleatorios entre "  + min + " y " + max);
    }

    public static void countDigits(int n, int[] vector) {
        int counter = 0;
        for (int i=0; i<n; i++){
            if(vector[i] <= 10){
                counter++;
            }
            System.out.println("La cantidad de numeros con digito 1 son " + counter);
            if((vector[i]> 10) && (vector[i]<=20)){
                counter++;
            }
            System.out.println("La cantidad de numeros con digito 1 son " + counter);
        }
    }
}
