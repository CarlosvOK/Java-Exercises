import java.util.Scanner;

public class parcial {
    public static void main(String args[]) {
        // Variables y constantes
        int numeroPedido = 0;
        int agencia = 0;
        int mes = 0;
        String destino = "";
        int cantidadMayores = -1;
        int cantidadMenores = -1;
        String opcion = "S";
        double montoMenores = 0.00, montoMayores = 0.00;
        final double montoCosta = 100000.00, montoSierra = 250000.00;
        double porcMenores = 0.00, porcMayores = 0.00;
        double totalPagarMenores = 0.00, totalPagarMayores = 0.00;
        int cantidadPedidosA1 = 0, cantidadPedidosA2 = 0;
        int totalMayoresB = 0, totalMenoresB = 0;
        double montoTotalCosta = 0.00, montoTotalSierra = 0.00;
        double promedioMayoresB = 0.00;
        final double porcMenor = 0.85, porcMayor = 0.50;

        // Scanner
        Scanner entrada = new Scanner(System.in);

        // ENTRADAS
        System.out.println("*****Terminal de Viajes*****");
        System.out.println("SISTEMA DE INGRESO DE DATOS");
        System.out.println();
        System.out.println("Viaje x Persona COSTA: 100.000.00");
        System.out.println("Viaje x Persona SIERRA: 250.000.00");
        System.out.println();
        while (opcion.equals("S")) {
            // INGRESO AGENCIA
            while (agencia < 1 || agencia > 2) {
                System.out.print("INGRESE LA AGENCIA (1-2): ");
                agencia = entrada.nextInt();
                // VALIDACIOND DE AGENCIA
                System.out.println();
                if (agencia < 1 || agencia > 2) {
                    System.out.println("Error! Agencia Invalido");
                }
            }
            if (agencia == 1 || agencia == 2) {
                // INGRESO DE MES
                while (mes < 1 || mes > 12) {
                    System.out.print("INGRESE EL MES: ");
                    mes = entrada.nextInt();
                    // VALIDACION DE MES
                    if (mes < 1 || mes > 12) {
                        System.out.println();
                        System.out.println("Error! Mes invalido");
                    }
                }

                System.out.println();

                // INGRESO DE DESTINO
                while (destino.equals("")) {
                    entrada.nextLine();
                    System.out.print("INGRESE SU DESTINO (A-B): ");
                    destino = entrada.nextLine();
                    // VALIDACION DE DESTINO
                    if (destino.equals("")) {
                        System.out.println();
                        System.out.println("Error! Destino invalido");
                    }
                }
                System.out.println();
                // INGRESO DE PERSONAS MENORES
                while (cantidadMenores < 0) {
                    System.out.print("CANTIDAD DE MENORES: ");
                    cantidadMenores = entrada.nextInt();
                    // VALIDACION DE MENORES
                    if (cantidadMenores < 0) {
                        System.out.println();
                        System.out.println("Error! Cantidad Invalidad");
                    }
                }
                // ingreso de personas mayores
                while (cantidadMayores < 0) {
                    System.out.print("CANTIDAD DE MAYORES: ");
                    cantidadMayores = entrada.nextInt();
                    // VALIDACIOn
                    if (cantidadMayores < 0) {
                        System.out.println();
                        System.out.println("Error! Cantidad Invalidad");
                    }
                }

                // PROCESOS
                if (destino.equals("A")) {
                    montoMenores = cantidadMenores * montoCosta;//100.000.00
                    montoMayores = cantidadMayores * montoCosta;//100.000.00

                    porcMenores = montoMenores * porcMenor;//100.000.00 * 0.85
                    porcMayores = montoMayores * porcMayor;//100.000.00 * 0.50

                    totalPagarMenores = montoMenores - porcMenores;//100.000.00 - 85.000
                    totalPagarMayores = montoMayores - porcMayores;//100.000.00 - 50.000

                    // MONTO TOTAL DESTINO A
                    montoTotalCosta = montoTotalCosta + (totalPagarMenores + totalPagarMayores); //50.000

                } else if (destino.equals("B")) {
                    montoMenores = cantidadMenores * montoSierra;
                    montoMayores = cantidadMayores * montoSierra;

                    porcMenores = montoMenores * porcMenor;
                    porcMayores = montoMayores * porcMayor;

                    totalPagarMenores = montoMenores - porcMenores;
                    totalPagarMayores = montoMayores - porcMayores;

                    // MONTO TOTAL DESTINO B
                    montoTotalSierra = montoTotalSierra + (totalPagarMenores + totalPagarMayores);
                }

                // cantidad de pedidos por agencia
                if (agencia == 1) {
                    cantidadPedidosA1 = cantidadPedidosA1 + 1;
                } else if (agencia == 2) {
                    cantidadPedidosA2 = cantidadPedidosA2 + 1;
                }

                // CANTIDAD DE PERSONAS MAYORES Y MENORES DEL DESTINO B
                totalMayoresB = totalMayoresB + cantidadMayores;
                totalMenoresB = totalMenoresB + cantidadMenores;

                // PROMEDIO
                if(cantidadPedidosA2>0 & destino.equals("B")){
                    promedioMayoresB =totalMayoresB/cantidadPedidosA2 ;
                }
                
                // NUMERO AUTOINCREMENTAL
                numeroPedido = numeroPedido + 1;

                // PREGUNTO SI DECEA CONTINUAR
                entrada.nextLine();
                System.out.println("Desea continunar S/N: ");
                opcion = entrada.nextLine();

                // INICIALIZACION DE VARIABLES
                agencia = 0;
                mes = 0;
                destino = "";
                cantidadMayores = -1;
                cantidadMenores = -1;
            }
        }
        // SALIDAS
        System.out.println();
        System.out.println("******* RESULTADOS DE SU PROCESO DE COMPRA *******");
        System.out.println();
        System.out.println("NUMERO DE PEDIDO" + numeroPedido);
        System.out.println();
        System.out.println("CANTIDAD TOTAL DE PEDIDOS AGENCIA 1: " + cantidadPedidosA1);
        System.out.println("CANTIDAD TOTAL DE PEDIDOS AGENCIA 2: " + cantidadPedidosA2);
        System.out.println("CANTIDAD TOTAL DE PERSONAS MAYORES DESTINO B: " + totalMayoresB);
        System.out.println("CANTIDAD TOTAL DE PERSONAS MENORES DESTINO B: " + totalMenoresB);
        System.out.println();
        System.out.println("MONTO TOTAL DESTINO A: " + montoTotalCosta);
        System.out.println("MONTO TOTAL DESTINO B: " + montoTotalSierra);
        System.out.println();
        System.out.println("PROMEDIO PERSONAS MAYORES DESTINO B: " + promedioMayoresB);
    }
}
