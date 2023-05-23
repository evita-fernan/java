package scanner.examples;
import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int j = 0;

        do {
            System.out.println("");
            System.out.println("Ingrese un numero");
            num = read.nextInt();
            j++;
            System.out.print(num + " ");
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
        } while (j < 4);
    }
}
