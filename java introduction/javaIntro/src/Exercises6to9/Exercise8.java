package Exercises6to9;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String word = read.nextLine();
        int qty = word.length();

        if(qty == 8){
            System.out.println("La cantidad de letras ingresadas es correcta (8)");
        } else {
            System.out.println("La cantidad de letras ingresadads no es correcta (es  menor o mayor a 8)");
        }
    }
}
