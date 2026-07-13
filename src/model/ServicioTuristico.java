package model;

// Clase base (superclase) que representa un servicio turístico genérico
// ofrecido por la agencia Llanquihue Tour.
// Las clases RutaGastronomica, PaseoLacustre y ExcursionCultural
// heredarán de esta clase para reutilizar estos atributos y comportamientos.
public class ServicioTuristico {
    // Atributos comunes a todos los servicios turísticos.
    protected String nombre;
    protected int duracionHoras;

    // Constructor: inicializa los atributos comunes.
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    // Método que será sobrescrito por cada subclase para mostrar
    // información específica de cada tipo de servicio.
    public void mostrarInformacion() {
        System.out.println("Servicio turístico: " + nombre + " (" + duracionHoras + " horas)");
    }

    // toString(): muestra los datos básicos del servicio.
    // Las subclases sobrescribirán este método para agregar su propia información.
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras;
    }
}