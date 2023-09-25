import java.util.Scanner;

public class ejer_7 {
    public static void main(String args[]) {
        // variables
        double monto_total = 0.00, costo = 0.00;
        String respuesta = "";
        final double COSTO_ADI = 1000;
        String nombre = "";
        int modalidad = 0;
        String detalle = "";
        String software_nube = "";

        // Entradas
        Scanner entrada = new Scanner(System.in);
        while (nombre==""){
            System.out.print("Ingrese su nombre: ");
            nombre = entrada.nextLine();

            if(nombre==""){
                System.out.println("Error! Ingres eun nombre valido");
            }
        }
        while (modalidad<1 || modalidad>3){
            System.out.println("MODALIDADES");
            System.out.println("1: Personal");
            System.out.println("2: Familiar");
            System.out.println("3: Empresarial");
            System.out.print("Ingrese la modalidad: ");
            modalidad = entrada.nextInt();

            if (modalidad<1|| modalidad>3){
                System.out.println("Error! Ingrese un valor valido");
            }
        }
        
        // PROCESOS
        entrada.nextLine();
        if (modalidad == 1) {
            costo = 5000;
            monto_total = costo + COSTO_ADI;
            detalle = "Incluye procesador de texto, planilla de cálculo y software de presentaciones. dispositivos";
        } else if (modalidad == 2) {
            costo = 6000;
            System.out.println("Desea adquirir software en la nube: ");
            software_nube = entrada.nextLine();

            if (software_nube.equals("SI")) {
                respuesta = software_nube;
                monto_total = COSTO_ADI+costo;
            } else if (software_nube.equals("NO")) {
                respuesta = software_nube;
                monto_total = costo;
            }
            detalle = "Incluye software de correo electrónico, procesador de texto, planilla de cálculo y software de presentaciones, e incluye 5 usuarios";
        } else if (modalidad == 3) {
            System.out.println("Desea adquirir software en la nube: ");
            software_nube = entrada.nextLine();
            costo=10000;
            if (software_nube.equals("SI")) {
                respuesta = software_nube;
                monto_total = costo + COSTO_ADI;
            } else if (software_nube.equals("NO")) {
                respuesta = software_nube;
                monto_total=costo;
            }
            detalle ="Incluye software de correo electrónico, procesador de texto, planilla de cálculo,software de presentaciones, y software de videoconferencias. Incluye 10 usuarios.";
        }

        // salidas
        System.out.println("Nombre del usuario es: " + nombre);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("Software en la nube: " + software_nube);
        System.out.println("Monto total: " + monto_total);
        System.out.println("Detalles de la modalidad: ");
        System.out.println(detalle);
    }
}
