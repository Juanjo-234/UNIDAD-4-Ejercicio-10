public class AuthOAuthProveedor extends MecanismoAutenticacion{
    private String proveedorEsperado;

    public AuthOAuthProveedor(String proveedorEsperado) {
        this.proveedorEsperado = proveedorEsperado;
    }

    @Override
    public boolean validarIdentidad(String identificador, String credencial) {
        System.out.println("[AUTH OAUTH] Conectando con API de proveedor externo (" + proveedorEsperado + ") para token: " + credencial);
        boolean esValido = credencial != null && credencial.startsWith("token_valid_");
        if (esValido) {
            System.out.println("-> [ÉXITO] Token OAuth de " + proveedorEsperado + " validado por el servidor.");
        } else {
            System.out.println("-> [FALLO] Token OAuth expirado o inválido.");
        }
        return esValido;
    }
}
