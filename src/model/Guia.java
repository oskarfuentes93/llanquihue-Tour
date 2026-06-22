package model;

// Clase que representa a un Guía turístico de Llanquihue Tour.
// Cada guía tiene un nombre y un número de teléfono de contacto.
public class Guia {

    // Atributos privados: solo accesibles mediante getters y setters.
    private String nombre;
    private String telefono;

    // Constructor: permite crear un objeto Guia con sus datos de una vez.
    public Guia(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters: permiten leer cada atributo desde fuera de la clase.
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters: permiten modificar cada atributo desde fuera de la clase.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // toString(): muestra los datos del guía de forma legible al imprimir.
    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}