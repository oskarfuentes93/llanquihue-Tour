package model;

// Superclase comun para las entidades operativas de la agencia.
// Aporta atributos y comportamiento compartido a sus subclases.
public class RecursoAgencia {

    // Atributos protegidos: accesibles desde esta clase y sus subclases.
    protected String nombre;
    protected String identificador;

    // Constructor que inicializa los atributos comunes.
    public RecursoAgencia(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    // Getters para acceder a los atributos desde otras clases.
    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    // Metodo toString(): entrega una representacion en texto del objeto.
    // Al estar en la superclase, las tres subclases (GuiaTuristico, Vehiculo,
    // ColaboradorExterno) lo heredan automaticamente, sin repetir codigo.
    // @Override indica que se esta sobrescribiendo el toString() original
    // que toda clase hereda de la clase Object de Java.
    @Override
    public String toString() {
        return "RecursoAgencia{"
                + "nombre='" + nombre + '\''
                + ", identificador='" + identificador + '\''
                + '}';
    }
}