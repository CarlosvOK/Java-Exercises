import java.util.Scanner;

public class virtual {
    public static void main(String[] args) {
        // Variables y constantes
        int numeroVenta = -1;
        String productoNombre = "";
        int ventasCantidad = 0;
        double precioUnitario = 0.00;
        int cantVentasR = 0;
        double montoTotalVentas = 0.00;
        double promedioVentas = 0.00;
        int cant_productos = 0;
        int MaxVenta = 0;
        String MaxproductoNombre = "";

        Scanner entrada = new Scanner(System.in);
        System.out.println(" *** Menu de productos ***");
        System.out.println("1: SmartPhone");
        System.out.println("2: Televisor");
        System.out.println("3: Laptop");

        

        while (numeroVenta != 0) {

            System.out.println("Numero de venta: ");
            numeroVenta = entrada.nextInt();
            
            System.out.println("Nombre del producto: ");
            productoNombre = entrada.nextLine();

            System.out.println("Cantidad de productos vendidos: ");
            ventasCantidad = entrada.nextInt();

            System.out.println("Precio Unitario: ");
            precioUnitario = entrada.nextDouble();

            if (productoNombre.equals("SmartPhone") || productoNombre.equals("Televisor") || productoNombre.equals("Laptop")) {
                cant_productos = cant_productos + ventasCantidad;

                // Total de ventas
                cantVentasR = cantVentasR + ventasCantidad;

                // Monto total en pesos
                montoTotalVentas = montoTotalVentas + (precioUnitario * ventasCantidad);

                // Promedio de ventas por producto
                promedioVentas = montoTotalVentas / cantVentasR;

                // Producto más vendido
                if (ventasCantidad > MaxVenta) {
                    MaxVenta = ventasCantidad;
                    MaxproductoNombre = productoNombre;
                }
            }

            numeroVenta = -1;
            productoNombre = "";
            ventasCantidad = 0;
            precioUnitario = 0;
            entrada.nextLine(); // Consumir el salto de línea después de ingresar el precio unitario
        }
        // SALIDAS
        System.out.println("Monto total ventas en pesos: " + montoTotalVentas);
        System.out.println("Promedio de ventas por producto: " + promedioVentas);
        System.out.println("Producto más vendido: " + MaxproductoNombre);
    }
}

