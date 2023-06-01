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
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;

        for (int i = 0; i < n; i++){
            if(vector[i] < 20){
                counter1++;
            }
            else if((vector[i] >= 20) && (vector[i] < 30)){
                counter2++;
            }
            else if((vector[i] >= 30) && (vector[i] < 40)){
                counter3++;
            }
            else if((vector[i] >= 40) && (vector[i] < 50)){
                counter4++;
            }
            else if((vector[i] >= 50) && (vector[i] < 60)){
                counter5++;
            }
        }
        System.out.println("La cantidad de numeros con digitos 1 son " + counter1);
        System.out.println("La cantidad de numeros con digitos 2 son " + counter2);
        System.out.println("La cantidad de numeros con digitos 3 son " + counter3);
        System.out.println("La cantidad de numeros con digitos 4 son " + counter4);
        System.out.println("La cantidad de numeros con digitos 5 son " + counter5);

    }
}
