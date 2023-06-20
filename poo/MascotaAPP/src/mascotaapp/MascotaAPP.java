package mascotaapp;

import mascotaapp.entidades.Mascota;
import mascotaapp.services.MascotaService;

import java.util.Scanner;

public class MascotaAPP {
    public static void main(String[] args) {

        /*
        Scanner read = new Scanner(System.in);

        Mascota m1 = new Mascota("Yoga", read.next(), "Perro");
        m1.setNombre("Yoyo");
        m1.pasear(100,4);

         */

        MascotaService sm = new MascotaService();

        Mascota m1 = sm.crearMascota();

        System.out.println(m1.toString());


    }
}
