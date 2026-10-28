public class AuthBiometrica extends MecanismoAutenticacion{
    private String hashHuellaRegistrada;

    public AuthBiometrica(String hashHuellaRegistrada) {
        this.hashHuellaRegistrada = hashHuellaRegistrada;
    }

    @Override
    public boolean validarIdentidad(String identificador, String credencial) {
        System.out.println("[AUTH BIOMÉTRICA] Escaneando huella dactilar/rostro para el dispositivo de ID: " + identificador);
        boolean esValido = this.hashHuellaRegistrada.equals(credencial);
        if (esValido) {
            System.out.println("-> [ÉXITO] Patrón biométrico verificado correctamente.");
        } else {
            System.out.println("-> [FALLO] No coincide el patrón biométrico.");
        }
        return esValido;
    }
}
