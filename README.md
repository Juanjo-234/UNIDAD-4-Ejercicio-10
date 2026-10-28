Resolución del ejercicio N°10 de la unidad 4 de programación 2.
Interfaz Contrato (MecanismoAutenticacion):

Define la firma universal boolean validarIdentidad(String identificador, String credencial). Establece el estándar obligatorio para que cualquier método de autenticación presente o futuro valide credenciales y devuelva un estado lógico (true si es exitoso, false si falla).

Clases Concretas (Mecanismos de Validación):

AuthPasswordTradicional: Simula la validación clásica basada en la coincidencia de nombre de usuario y contraseña o clave de acceso cifrada.

AuthBiometrica: Simula la verificación mediante rasgos físicos únicos, como huella dactilar o reconocimiento facial.

AuthOAuthProveedor: Simula la autenticación federada con terceros (por ejemplo, inicio de sesión mediante tokens seguros de proveedores externos como Google o GitHub).

Clase Coordinadora (ControladorAcceso):

Actúa como el guardián o gestor central de seguridad del sistema. Recibe de forma polimórfica cualquier referencia de tipo MecanismoAutenticacion y despacha la validación de identidad para aprobar o denegar el acceso, permaneciendo totalmente desacoplado de las tecnologías específicas de validación.

Clase Principal (Main):

Se encarga de simular diversos intentos de inicio de sesión intercambiando dinámicamente los mecanismos de autenticación en tiempo de ejecución, reflejando el éxito o el rechazo de la operación por consola.
<img width="1063" height="732" alt="Captura de pantalla 2026-10-28 103454" src="https://github.com/user-attachments/assets/511c844d-dd38-4245-925e-e740b1eb801f" />
