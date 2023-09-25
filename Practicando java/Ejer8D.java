import java.util.Scanner;

public class Ejer8D {
    public static void main(String args[]) {
        // VARIABLES
        int cajones_cerv = 0, cajones_gase = 0;
        String continuar = "N";
        String opcion = "";
        final double MONTO_CERV = 50.00;
        final int CAPACIDAD = 6;
        int cantidadTotal_gas = 0, cantidadTotal_cerv = 0;
        int cantidadTodos = 0;
        double porcentaje = 0.00;
        double montoTotalcerv = 0.00;
        int cajonesxcapacidad = 0;

        // ENTRADAS
        Scanner entrada = new Scanner(System.in);

        // BUCLE PRINCIPAL
        while (!opcion.equals("D")) {
            System.out.println("** M E N U **");
            System.out.println("A: Cargar cajones de cerveza");
            System.out.println("B: Cargar cajones de gaseosa");
            System.out.println("C: Reportes");
            System.out.println("D: Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextLine();

            // PROCESOS
            if (opcion.equals("A")) {
                System.out.println("Cargue cajones de cerveza");
                cajones_cerv = entrada.nextInt();
                cantidadTotal_cerv = cantidadTotal_cerv + cajones_cerv;
            } else if (opcion.equals("B")) {
                System.out.println("Cargue cajones de gaseosa");
                cajones_gase = entrada.nextInt();
                cantidadTotal_gas = cantidadTotal_gas + cajones_gase;
            }

            // SUMA TODOS LOS CAJONES
            cantidadTodos = cantidadTotal_cerv + cantidadTotal_gas;

            // porcentaje
            if (cantidadTodos != 0) {
                porcentaje = (cajones_cerv * 100) / cantidadTodos;
            } else {
                porcentaje = 0.0;
            }

            // monto calculo
            cajonesxcapacidad = cajones_cerv * CAPACIDAD;
            montoTotalcerv = MONTO_CERV * cajonesxcapacidad;

            // SALIDAS
            if (opcion.equals("C")) {
                System.out.println("Cantidad Total Cerveza: " + cajones_cerv);
                System.out.println("Cantidad Total Gaseosa: " + cajones_gase);
                System.out.println("Cantidad Total de Cajones: " + cantidadTodos);
                System.out.println("Porcentaje cajones cerveza sobre el total: " + porcentaje);
                System.out.println("Monto cajones cerveza: " + montoTotalcerv);
            }

            // Limpiar el búfer después de leer un entero
            entrada.nextLine();
        }

        System.out.println("Fin del programa.");
    }
}
