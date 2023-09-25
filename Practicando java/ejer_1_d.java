import java.util.Scanner;

public class ejer_1_d {
    public static void main(String args[]){
        // Variables
        String usuarioCorrecto = "usuario1";
        String contrasenaCorrecta = "asdasd";
        int intentos = 3;

        Scanner entrada = new Scanner(System.in);

        // Entradas
        while (intentos > 0) {
            System.out.print("Ingrese Usuario: ");
            String usuario = entrada.nextLine();

            if (!usuario.equals(usuarioCorrecto)) {
                System.out.println("Error! Usuario incorrecto");
                intentos--;
                continue;
            }

            System.out.print("Ingrese contraseña: ");
            String contrasena = entrada.nextLine();

            if (contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Acceso correcto");
                return;
            } else {
                System.out.println("Error! Contraseña incorrecta");
                intentos--;
            }
        }

        System.out.println("Has excedido el número máximo de intentos. Acceso denegado.");
    }
}
