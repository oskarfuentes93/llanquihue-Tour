package model;

// Clase que representa un Tour ofrecido por la agencia Llanquihue Tour.
// Cada objeto Tour guarda la información de un tour: su nombre, la comuna
// donde se realiza y su precio.
public class Tour {

    // Atributos privados: solo se pueden modificar a través de los métodos
    // get y set, no directamente desde otras clases.
    private String nombre;
    private String comuna;
    private int precio;

    // Constructor: permite crear un objeto Tour entregando los tres datos
    // de una sola vez.
    public Tour(String nombre, String comuna, int precio) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.precio = precio;
    }

    // Getters: permiten leer el valor de cada atributo desde fuera de la clase.
    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public int getPrecio() {
        return precio;
    }

    // Setters: permiten modificar el valor de cada atributo desde fuera de la clase.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // toString(): define cómo se va a "imprimir" un objeto Tour cuando
    // se use System.out.println(tour). En vez de mostrar la dirección
    // de memoria, muestra los datos del tour de forma legible.
    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                ", precio=" + precio +
                '}';
    }
}