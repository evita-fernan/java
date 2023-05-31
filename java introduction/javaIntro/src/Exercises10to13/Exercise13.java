package Exercises10to13;
import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int counter = 0;

        System.out.println("");
        System.out.println("Ingrese un numero entero positivo");
        counter = read.nextInt();

        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print("*");
            }
            System.out.println();
          if(i==0){
                System.out.println("*");
            } else if(i==(counter-1)){
                System.out.println("*");
            }
            else {
                System.out.print(" ");
            }
        }

    }
}
