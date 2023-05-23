package scanner.examples;
import java.util.Scanner;
public class DoWhileExample {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int num;
        do {
            System.out.println("Ingrese un numero");
            num = read.nextInt();
            if (num == 0){
                System.out.println("Se capturo el numero 0");
                break;
            }
            sum += num;
            i++;
            System.out.println(i);
        } while (i < 5);

        System.out.println("La suma de los numeros ingresados es " + sum);
    }
}
