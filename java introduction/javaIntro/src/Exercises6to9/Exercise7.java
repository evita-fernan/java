package Exercises6to9;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String word = read.nextLine().toLowerCase();
        String eureka = "eureka";

        if(word.equals(eureka)){
            System.out.println("La palabra ingresada es CORRECTA");
        } else {
            System.out.println("La palabra ingresada es INCORRECTA");
        }

    }
}
