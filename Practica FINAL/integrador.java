import java.util.Scanner;

public class integrador {
    public static void main(String args[]) {
        // Variables
        int agencia = -1, mes = 0, destino = 0;
        int cantidadMayores = 0, cantidadMenores = 0;
        double precio = 0.00;
        int cantidadPedidosA1 = 0, cantidadPedidosA2 = 0;
        double montoTotalD1 = 0.00, montoTotalD2 = 0.00, montoTotalD3 = 0.00;
        int cantidadTotalMayoresP = 0, cantidadTotalMenoresP = 0;
        double porcentajeMenores = 0.00, porcentajeJubilados = 0.00;
        // constantes
        int numero_pedido = -1, numeroPedido = 582;
        final double valorPorcenMenor = 0.85, valorPorcenJubi = 0.50;
        final int precioCosta = 100000;
        final double precioSierra = 199000.99;
        final double precioPatagonia = 299999.99;
        String continuar = "S";

        // Entradas
        Scanner entrada = new Scanner(System.in);
        while (continuar.equals("S")) {
            while (agencia < 1 || agencia > 2) {
                System.out.println("Ingrese Agencia (1-2)");
                agencia = entrada.nextInt();

                if (agencia < 1 || agencia > 2) {
                    System.out.println("Error! Agencia Invalida!");
                }
            }
            if (agencia == 1 || agencia == 2) {
                while (numero_pedido < 0) {
                    System.out.println("Numero de pedido: ");
                    numero_pedido = entrada.nextInt();

                    if (numero_pedido < 0) {
                        System.out.println("Error! Numero invalido");
                    }
                }
                while (mes < 0 || mes > 12) {
                    System.out.println("Ingrese mes");
                    mes = entrada.nextInt();
                    if (mes < 0 || mes > 12) {
                        System.out.println("Error! Invalido mes");
                    }
                }
                while (destino < 1 || destino > 3) {
                    System.out.println("Destino (1-3): ");
                    destino = entrada.nextInt();

                    if (destino < 1 || destino > 3) {
                        System.out.println("Error! Destino Invalido");
                    }
                }
                while (cantidadMayores <= 0) {
                    System.out.println("Cantidad de personas Mayores: ");
                    cantidadMayores = entrada.nextInt();

                    if (cantidadMayores <= 0) {
                        System.out.println("Error! Valor Invalido");
                    }
                }
                while (cantidadMenores <= 0) {
                    System.out.println("Cantidad de persoans Menores: ");
                    cantidadMenores = entrada.nextInt();

                    if (cantidadMenores <= 0) {
                        System.out.println("Error! Valor Invalido");
                    }
                }
                // PROCESOS
                if (destino == 1) {
                    // Calculo precioTotal, y porcentajeMenores
                    precio = cantidadMenores * precioCosta;

                    porcentajeMenores = precio * valorPorcenMenor;
                    porcentajeJubilados = precio * valorPorcenJubi;
                    // monto total
                    montoTotalD1 = montoTotalD1 + (porcentajeMenores + porcentajeJubilados);

                } else if (destino == 2) {
                    precio = cantidadMenores * precioSierra;

                    porcentajeMenores = precio * valorPorcenMenor;
                    porcentajeJubilados = precio * valorPorcenJubi;
                    // monto total
                    montoTotalD2 = montoTotalD2 + (porcentajeMenores + porcentajeJubilados);

                } else if (destino == 3) {
                    precio = cantidadMenores * precioPatagonia;

                    // cantidad de personas mayores y menores
                    cantidadTotalMayoresP = cantidadTotalMayoresP + cantidadMayores;
                    cantidadTotalMenoresP = cantidadTotalMenoresP + cantidadMenores;

                    porcentajeMenores = precio * valorPorcenMenor;
                    porcentajeJubilados = precio * valorPorcenJubi;
                    // monto total
                    montoTotalD3 = montoTotalD3 + (porcentajeMenores + porcentajeJubilados);
                }
                // cantidad de pedidos por agencia
                if (agencia == 1) {
                    cantidadPedidosA1 = cantidadPedidosA1 + 1;
                } else if (agencia == 2) {
                    cantidadPedidosA2 = cantidadPedidosA2 + 1;
                }
                // Numero de pedido
                numeroPedido = numeroPedido + 1;
                // consume el salto de linea, sino no me aparece el mensaje continuar
                entrada.nextLine();
                // Pregunto si desea continuar con el programa
                System.out.print("Desea continuar S/N:");
                continuar = entrada.nextLine();

                agencia=-1;
                numero_pedido=0;
                mes=0;
                destino=0;
                cantidadMayores=0;
                cantidadMenores=0;
            }
        }
        // SALIDAS
        System.out.println("Cantidad Total pedidos:");
        System.out.println("Agencia N1: " + cantidadPedidosA1);
        System.out.println("Agencia N2: " + cantidadPedidosA2);
        System.out.println("Cantidad personas PATAGONIA: ");
        System.out.println("Mayores: " + cantidadTotalMayoresP);
        System.out.println("Menores: " + cantidadTotalMenoresP);
        System.out.println("MONTOS TOTALES");
        System.out.println("Costa: " + montoTotalD1);
        System.out.println("Sierra: " + montoTotalD2);
        System.out.println("Patagonia: " + montoTotalD3);
        System.out.println("NUMERO DE PEDIDO: " + numeroPedido);

    }
}
