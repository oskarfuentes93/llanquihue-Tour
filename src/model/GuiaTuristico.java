package model;

// Entidad que representa a un guia turistico de la agencia.
// Hereda de RecursoAgencia e implementa el contrato Registrable.
public class GuiaTuristico extends RecursoAgencia implements Registrable {

    // Atributo propio de esta entidad.
    private String idioma;

    // Constructor: usa super(...) para inicializar los atributos heredados
    // y luego inicializa el atributo propio.
    public GuiaTuristico(String nombre, String identificador, String idioma) {
        super(nombre, identificador);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    // Implementacion obligatoria del metodo de la interfaz Registrable.
    // Personaliza el mensaje para el tipo Guia Turistico.
    @Override
    public String mostrarResumen() {
        return "Guia Turistico: " + nombre
                + " | ID: " + identificador
                + " | Idioma: " + idioma;
    }
}