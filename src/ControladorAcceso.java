public class ControladorAcceso {
    public void gestionarAcceso(MecanismoAutenticacion mecanismo, String identificador, String credencial) {
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando proceso de validación de acceso...");

        boolean accesoAprobado = mecanismo.validarIdentidad(identificador, credencial);

        if (accesoAprobado) {
            System.out.println(">>> Estado: ACCESO PERMITIDO. Bienvenido al sistema.");
        } else {
            System.out.println(">>> Estado: ACCESO DENEGADO. Verifique sus credenciales.");
        }
        System.out.println("--------------------------------------------------\n");
    }
}
