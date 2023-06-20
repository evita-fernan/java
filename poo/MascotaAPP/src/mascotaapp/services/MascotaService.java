package mascotaapp.services;

import mascotaapp.entidades.Mascota;

import java.util.Scanner;

public class MascotaService {

    private Scanner read = new Scanner(System.in);
    public Mascota crearMascota(){
        System.out.println("introducir nombre");
        String nombre = read.next();

        System.out.println("introducir apodo");
        String apodo = read.next();

        System.out.println("introducir tipo");
        String tipo = read.next();

       return new Mascota(nombre, apodo, tipo);
    }
}
