public class AuthPasswordTradicional extends MecanismoAutenticacion{
    private String usuarioRegistrado;
    private String passwordHasheada;

    public AuthPasswordTradicional(String usuarioRegistrado, String passwordHasheada) {
        this.usuarioRegistrado = usuarioRegistrado;
        this.passwordHasheada = passwordHasheada;
    }

    @Override
    public boolean validarIdentidad(String identificador, String credencial) {
        System.out.println("[AUTH PASSWORD] Verificando credenciales de texto plano/hash para: " + identificador);
        boolean esValido = this.usuarioRegistrado.equals(identificador) && this.passwordHasheada.equals(credencial);
        if (esValido) {
            System.out.println("-> [ÉXITO] Contraseña correcta.");
        } else {
            System.out.println("-> [FALLO] Usuario o contraseña incorrectos.");
        }
        return esValido;
    }
}
