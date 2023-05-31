package Exercises14;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros = read.nextDouble();
        System.out.println("Seleccione la moneda a convertir (escoja el numero):\n1. Dolares \n2. Yenes \n3. Libras");
        int type = read.nextInt();
    }

    public static void currencyConvertion (double euros, String type){
        double result = 0;
        String dolars;
        String yenes;
        String pounds;


    }
}
