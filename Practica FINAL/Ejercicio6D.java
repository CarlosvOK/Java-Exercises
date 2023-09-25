import java.util.Scanner;

public class Ejercicio6D {
    public static void main(String args[]) {
        // Variables y constantes
        int numeroFactura = -1;
        int numeroArticulo = 0;
        int cantidadVendida = -1;
        double precioUnitario = 0.00;
        double montoTotalSinIva = 0.00;
        double montoIva1 = 0.00;
        double montoIva2 = 0.00;
        double montoConIva1 = 0.00;
        double montoConIva2 = 0.00;
        final double IVA = 0.21;
        final double porc = 0.21;
        double facturaTotal = 0.0;
        double facturasMayores = 0;
        double porcentajeA = 0.00;
        double porcentajeB = 0.00;
        int cantidadVendidaB = 0;
        double facturaArticulo1 = 0.00;
        double facturaArticulo2 = 0.00;
 
        Scanner entrada = new Scanner(System.in);
        //ENTRADAS
        //VALOR PARA TERMINAR CUADO SE INGRESE EL NUMERO 0
        while (numeroFactura != 0) {
            System.out.print("Ingrese el numero de factura(0 para finalizar): ");
            numeroFactura = entrada.nextInt();
            //VAIDACION DE DATO CON NUMERO NEGATIVO
            if (numeroFactura < 0) {
                System.out.println("Error! Factura Invalida");
            } else if (numeroFactura != 0) {
                numeroArticulo = 0;
                //INGRESO DE DATO POR TECLADO POR EL USUARIO
                while (numeroArticulo < 1 || numeroArticulo > 3) {
                    System.out.println("Ingrese numero de articulo 1=A  - 2=B  -  3=C:  ");
                    numeroArticulo = entrada.nextInt();
                    if (numeroArticulo < 1 || numeroArticulo > 3) {
                        System.out.println("Error! Dato Invalido");
                    }
                }
                //INGRESE DE DATO POR TECLADO
                while (cantidadVendida < 0) {
                    System.out.println("Cantidad Vendida: ");
                    cantidadVendida = entrada.nextInt();
                    if (cantidadVendida < 0) {
                        System.out.println("Error! Cantidad Invalida");
                    }
                }
                //INGRESE DE DATO POR TECLADO
                while (precioUnitario <= 0) {
                    System.out.println("Precio Unitario: ");
                    precioUnitario = entrada.nextDouble();
                    if (precioUnitario <= 0) {
                        System.out.println("Error! Precio Invalido");
                    }
                }
                // PROCESOS
                //DETERMINO EN QUE NUMERO DE FACTURA SE ENCUENTRA EL USUARIO
                if (numeroArticulo == 1) {
                    // monto sin iva
                    montoTotalSinIva = montoTotalSinIva + precioUnitario;
                    // 21% del monto
                    montoIva1 = montoTotalSinIva * porc;
                    // El Iva
                    montoConIva1 = montoTotalSinIva + montoIva1;
                    // suma factura
                    facturaArticulo1 = facturaArticulo1 + montoConIva1;
                } else if (numeroArticulo == 2) {
                    // calculo el iva
                    montoIva2 = precioUnitario * IVA;
                    // monto total iva
                    montoConIva2 = montoIva2 + precioUnitario;
                    // CANTIDAD VENDIDA ARTICULO B
                    cantidadVendidaB = cantidadVendidaB + cantidadVendida;
                    // suma factura
                    facturaArticulo2 = facturaArticulo2 + montoConIva2;
                }
                // suma de facturas totales
                facturaTotal = facturaArticulo1 + facturaArticulo2;

                // FACTURAS MAYORES A 3000
                if (montoConIva1 > 3000 || montoConIva2 > 3000) {
                    facturasMayores = facturasMayores + 1;
                }

                // PORCENTAJES
                porcentajeA = (montoConIva1 / facturaTotal) * 100;
                porcentajeB = (montoConIva2 / facturaTotal) * 100;

                numeroFactura = -1;
                numeroArticulo = 0;
                cantidadVendida = -1;
                precioUnitario = 0.00;
            }
        }
        // SALIDAS
        System.out.println("MONTO TOTALES X FACTURA");
        System.out.println("Factura A");
        System.out.println("Monto total: " + montoTotalSinIva);
        System.out.println("IVA: " + montoIva1);
        System.out.println("Monto total Iva incluido: " + montoConIva1);
        System.out.println("");
        System.out.println("Factura B");
        System.out.println("Monto total IVA incluido: " + montoConIva2);
        System.out.println("Articulos vendidos B: " + cantidadVendidaB);
        System.out.println("");
        System.out.println("Facturacion total: " + facturaTotal);
        System.out.println("Porcentaje factura A: "+porcentajeA);
        System.out.println("Porcentaje factura B: "+porcentajeB);

    }
}
