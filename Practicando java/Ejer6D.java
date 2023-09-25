import java.util.Scanner;
public class Ejer6D {
    public static void main(String args[]) {
        // Variables
        int factura = 0;
        int num_art = 0;
        int num_fac = -1;
        int cant_vendidas = -1;
        int canttidadFacturasMayores = 0;
        int riva = 21;
        int cant_venB = 0;
        int precio_uni = 0;
        double montoTotalIVAIncluido = 0.00;
        double montoIVA = 0.00;
        final double IVA = 0.21;
        double montoTotalFacturaA = 0.00;
        double montoTotalFacturaB = 0.00;
        double montoTotalFacturaC = 0.00;
        double fact_total = 0.00;
        double porc = 0.00;

        Scanner entrada = new Scanner(System.in);
        // ENTRADAS

        
        
        while (num_fac != 0) {
            System.out.println("Numero de Factura: ");
            num_fac = entrada.nextInt();
            while (factura < 3) {
                factura++;
                // Numero de articulo
                System.out.println("Numero de articulo");
                System.out.println("1: A");
                System.out.println("2: B");
                System.out.println("3: C");

                while (num_art<1 || num_art>3){
                    System.out.println("Ingrese Numero: ");
                    num_art = entrada.nextInt();

                    if(num_art<1 || num_art>3){
                        System.out.println("Error, Numero invalido");
                    }
                }
                // Cantidad vendida
                while (cant_vendidas<0){
                    System.out.println("Cantidad vendidas: ");
                    cant_vendidas = entrada.nextInt();

                    if(cant_vendidas<0){
                        System.out.println("Error! Cantidad invalida");
                    }
                }
                while (precio_uni<1){
                    // Precio Unitario
                    System.out.println("Precio Unitario (SIN IVA): ");
                    precio_uni = entrada.nextInt();
                    if(precio_uni<1){
                        System.out.println("Error! Precio invalido");
                    }
                }

                // PROCESOS
                if (num_fac == 1) {
                    montoIVA = precio_uni * IVA;
                    montoTotalIVAIncluido = precio_uni + montoIVA;
                    montoTotalFacturaA = montoTotalFacturaA + montoTotalIVAIncluido;
                }/* else if(num_fac==2){
                    montoIVA = precio_uni*IVA;
                    montoTotalIVAIncluido= precio_uni+montoIVA;
                    montoTotalFacturaB=montoTotalFacturaB+montoTotalIVAIncluido;
                } */

                // FACTURAS mayores a 3000
                if (montoTotalIVAIncluido > 3000) {
                    canttidadFacturasMayores = canttidadFacturasMayores + 1;
                }
            }

            // Reiniciar variables para la siguiente factura
            factura = 0;
            montoTotalIVAIncluido = 0.00;
            montoIVA = 0.00;
        }
        // SALIDAS
        System.out.println("Monto Totales");
        System.out.println("Factura A: " + montoTotalIVAIncluido);
        System.out.println("Factura B: " + montoTotalFacturaB);
        System.out.println("Precio Unitario: " + precio_uni);
        System.out.println("El IVA: " + riva);
        System.out.println("Facturas mayores $3000: "+canttidadFacturasMayores);
    }
}
