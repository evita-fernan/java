package scanner.examples;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Indique el tipo de motor de 1 a 4");

        int tipoMotor = read.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un tipo valido para el tipo de bomba ingresado");
        }

    }

}
