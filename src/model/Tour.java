package model;

// Clase que representa un Tour ofrecido por la agencia Llanquihue Tour.
// Cada Tour tiene un nombre, comuna, precio y un Guía asignado (composición).
public class Tour {

    // Atributos privados.
    private String nombre;
    private String comuna;
    private int precio;

    // Composición: un Tour "tiene un" Guia asignado.
    // Esto significa que el objeto Guia vive dentro del objeto Tour.
    private Guia guia;

    // Constructor: crea un Tour con todos sus datos, incluyendo el guía.
    public Tour(String nombre, String comuna, int precio, Guia guia) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.precio = precio;
        this.guia = guia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public int getPrecio() {
        return precio;
    }

    public Guia getGuia() {
        return guia;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    // toString(): muestra todos los datos del tour, incluyendo el guía.
    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                ", precio=" + precio +
                ", guia=" + guia +
                '}';
    }
}