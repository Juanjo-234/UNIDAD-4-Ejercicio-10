//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ControladorAcceso controlador = new ControladorAcceso();

    MecanismoAutenticacion authPassword = new AuthPasswordTradicional("admin_user", "Secr3t$2026");
    MecanismoAutenticacion authBiometrica = new AuthBiometrica("hash_huella_98765xyz");
    MecanismoAutenticacion authOAuth = new AuthOAuthProveedor("Google Identity");

    controlador.gestionarAcceso(authPassword, "admin_user", "Secr3t$2026");

    controlador.gestionarAcceso(authPassword, "admin_user", "clave_erronea");

    controlador.gestionarAcceso(authBiometrica, "Dispositivo_Mobile_#12", "hash_huella_98765xyz");

    controlador.gestionarAcceso(authOAuth, "usuario_google@gmail.com", "token_valid_abc98765");
}

