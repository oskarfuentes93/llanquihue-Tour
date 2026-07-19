package util;

// Excepcion personalizada del sistema.
// Se lanza cuando un dato no cumple las reglas de validacion,
// por ejemplo un texto vacio o un precio invalido leido desde el archivo .txt.
// Al extender Exception se convierte en una excepcion "verificada" (checked):
// el codigo que la use esta obligado a manejarla con try-catch o declararla con throws.
public class ValidacionException extends Exception {

    // Constructor que recibe el mensaje que explica el error.
    // Ese mensaje se entrega a la superclase Exception con super(mensaje),
    // para poder recuperarlo despues con getMessage().
    public ValidacionException(String mensaje) {
        super(mensaje);
    }
}