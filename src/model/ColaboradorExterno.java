package model;

// Entidad que representa a un colaborador externo de la agencia.
// Hereda de RecursoAgencia e implementa el contrato Registrable.
public class ColaboradorExterno extends RecursoAgencia implements Registrable {

    // Atributo propio de esta entidad.
    private String servicio;

    public ColaboradorExterno(String nombre, String identificador, String servicio) {
        super(nombre, identificador);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador Externo: " + nombre
                + " | RUT: " + identificador
                + " | Servicio: " + servicio;
    }
}