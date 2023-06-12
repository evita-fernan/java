package mascotaapp;

import mascotaapp.entidades.Mascota;

import java.util.Scanner;

public class MascotaAPP {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Mascota m1 = new Mascota();

        m1.apodo = "Yoyo";
        m1.nombre = read.next();
        m1.tipo = "Perro";
        m1.edad = 16;
        m1.raza = "pupe";
        m1.cola = true;
        m1.color = "Bicolor";

        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo + " " + m1.nombre);

    }
}
