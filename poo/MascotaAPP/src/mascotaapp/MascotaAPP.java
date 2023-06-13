package mascotaapp;

import mascotaapp.entidades.Mascota;

import java.util.Scanner;

public class MascotaAPP {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Mascota m1 = new Mascota("Yoga", read.next(), "Perro");

        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo + " " + m1.nombre + " " + m1.color);

    }
}
