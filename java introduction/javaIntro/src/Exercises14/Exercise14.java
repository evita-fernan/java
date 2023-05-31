package Exercises14;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros = read.nextDouble();
        System.out.println("Seleccione la moneda a convertir (escoja el numero):\n1. Dolares \n2. Yenes \n3. Libras");
        int option = read.nextInt();
        String type = "";

        switch (option) {
            case 1:
                type = "dolars";
                currencyConvertion(euros,type);
                break;
            case 2:
                type = "yenes";
                currencyConvertion(euros, type);
                break;
            case 3:
                type = "pounds";
                currencyConvertion(euros, type);
                break;
        }

    }

    public static void currencyConvertion (double euros, String type){
        double result = 0;
        String dolars = "dolars";
        String yenes = "yenes";
        String pounds = "pounds";

        if(dolars.equals(type)){
            result = euros * 1.28611;
            System.out.println("La cantidad de " + euros + " € son " + result + " dolares");
        }
        else if(yenes.equals(type)){
            result = euros * 129.852;
            System.out.println("La cantidad de " + euros + " € son " + result + " yenes");
        }
        else if(pounds.equals(type)){
            result = euros * 0.86;
            System.out.println("La cantidad de " + euros + " € son " + result + " libras");
        }
    }
}
