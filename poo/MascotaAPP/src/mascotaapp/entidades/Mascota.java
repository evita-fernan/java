package mascotaapp.entidades;

public class Mascota {
    //atributos
    private String nombre;
    private String apodo;
    //perro, conejo, gato, entre otros.
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;

    //constructor
    public Mascota(){

    }

    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }

    public void setNombre(String nombre){
        if(nombre.length() > 0){
            this.nombre = nombre;
        }
    }
}
