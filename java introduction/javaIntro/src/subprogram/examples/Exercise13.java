package subprogram.examples;
import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args) {
        String [] equipo = new String[5];
        Scanner read = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingrese el nombre de su compañero");
            equipo[i] = read.nextLine();
        }

        for (int i = 0; i <= 4; i++) {
            if (i == 0){
            System.out.print("[ " + equipo[i] + ", ");
        } else if (i != 4){
                System.out.print(equipo[i] + ", ");
            }
           else {
                System.out.print(equipo[i] + " ]");
            }
        }
    }

}
