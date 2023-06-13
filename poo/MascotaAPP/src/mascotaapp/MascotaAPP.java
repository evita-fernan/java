package mascotaapp;

import mascotaapp.entidades.Mascota;

import java.util.Scanner;

public class MascotaAPP {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Mascota m1 = new Mascota("Yoga", read.next(), "Perro");
        m1.setNombre("Yoga");
        System.out.println(m1);
    }
}
