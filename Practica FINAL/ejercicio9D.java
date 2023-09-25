import java.util.Scanner;

public class ejercicio9D {
    public static void main(String args[]) {
        // VARIABLES Y CONSTANTES
        int codigoDeposito = 0;
        String modeloAuto = "";
        String CONTINUAR = "S";
        int unidades = 0;
        int movimientosStock = 0;
        double monto1 = 0, monto2 = 0, monto3 =0;
        int stockDepositoAu1 = 0, stockDepositoAu2 = 0, stockDepositoAu3 = 0;
        final double vehiculo1 = 500.000, vehiculo2 = 600.000, vehiculo3 = 750.000;
        int totalStockDeposito1 = 0, totalStockDeposito2 = 0, totalStockDeposito3 = 0;
        int stockMaximo = 0;
        double totalValorizado = 0.00;
        double sumaMontoValorizado3=0.00, sumaMontoValorizado2=0.00, sumaMontoValorizado1=0.00;
        double promedioVentas=0.00;

        Scanner entrada = new Scanner(System.in);

        // ENTRADAS
        while (CONTINUAR.equals("S")) {
            while (codigoDeposito < 1 || codigoDeposito > 3) {
                System.out.println("--DEPOSITOS--");
                System.out.println("1 - NORTE");
                System.out.println("2 - CENTRO");
                System.out.println("3 - SUR");
                System.out.println("");
                System.out.println("Ingrese Codigo Deposito: ");
                codigoDeposito = entrada.nextInt();
                entrada.nextLine();
                if (codigoDeposito < 1 || codigoDeposito > 3) {
                    System.out.println("Error! Codigo Invalido");
                }
            }
            while (modeloAuto.equals("")) {
                System.out.println("MODELOS VEHICULOS");
                System.out.println("A");
                System.out.println("B");
                System.out.println("C");
                System.out.println("Ingrese modelo de vehiculo: ");
                modeloAuto = entrada.nextLine();
                if (modeloAuto.equals("")) {
                    System.out.println("Error! Modelo invalido");
                }
            }
            while (unidades <1) {
                System.out.println("Ingrese Cantidad Unidades: ");
                unidades = entrada.nextInt();
                if (unidades <1) {
                    System.out.println("Error! Cantidad Invalida");
                }
            }
            entrada.nextLine();

            System.out.println("Desea continuar S/N: ");
            CONTINUAR = entrada.nextLine();

            // PROCESOS
            if (codigoDeposito == 1) {
                if (modeloAuto.equals("A")) {
                    monto1 = vehiculo1 * unidades;//500.000*1=500.000
                    stockDepositoAu1 = stockDepositoAu1 + unidades;//1
                } else if (modeloAuto.equals("B")) {
                    monto1 = vehiculo2 * unidades;
                    stockDepositoAu2 = stockDepositoAu2 + unidades;
                } else if (modeloAuto.equals("C")) {
                    monto1 = vehiculo3 * unidades;
                    stockDepositoAu3 = stockDepositoAu3 + unidades;
                }
                sumaMontoValorizado1=sumaMontoValorizado1+monto1;//500.000
                totalStockDeposito1 = stockDepositoAu1 + stockDepositoAu2 + stockDepositoAu3;//1

            } else if (codigoDeposito == 2) {
                if (modeloAuto.equals("A")) {
                    monto2 = vehiculo1 * unidades;
                    stockDepositoAu1 = stockDepositoAu1 + unidades;
                } else if (modeloAuto.equals("B")) {
                    monto2 = vehiculo2 * unidades;
                    stockDepositoAu2 = stockDepositoAu2 + unidades;
                } else if (modeloAuto.equals("C")) {
                    monto2 = vehiculo3 * unidades;
                    stockDepositoAu3 = stockDepositoAu3 + unidades;
                }
                sumaMontoValorizado2=sumaMontoValorizado2+monto2;
                totalStockDeposito2 = (stockDepositoAu1 + stockDepositoAu2 + stockDepositoAu3);
            } else if (codigoDeposito == 3) {
                if (modeloAuto.equals("A")) {
                    monto3 = vehiculo1 * unidades;
                    stockDepositoAu1 = stockDepositoAu1 + unidades;
                } else if (modeloAuto.equals("B")) {
                    monto3 = vehiculo2 * unidades;
                    stockDepositoAu2 = stockDepositoAu2 + unidades;
                } else if (modeloAuto.equals("C")) {
                    monto3 = vehiculo3 * unidades;
                    stockDepositoAu3 = stockDepositoAu3 + unidades;
                }
                sumaMontoValorizado3=sumaMontoValorizado3+monto3;
                totalStockDeposito3 = (stockDepositoAu1 + stockDepositoAu2 + stockDepositoAu3);
            }

            // MOVIMIENTOS DE STOCKS
            movimientosStock = movimientosStock + 1;

            // STOCK MAXIMA UNIDAD
            if (unidades > stockMaximo) {
                stockMaximo = movimientosStock;
            }

            //total valorizados de stock
            totalValorizado=sumaMontoValorizado1+sumaMontoValorizado2+sumaMontoValorizado3;//500.000

            // RETORNO DE VARIABLES
            codigoDeposito = 0;
            modeloAuto = "";
            unidades = 0;

            //promedio de ventas de unidades de vehiculos
            promedioVentas=totalValorizado/movimientosStock;
            
            System.out.println("");
            System.out.println("Stock valorizado Hasta ahora: "+totalValorizado);
            System.out.println("");

        }
        //SALIDAS
        System.out.println("Movimientos de stock: "+movimientosStock);
        System.out.println("Deposito 1 NORTE: "+totalStockDeposito1);
        System.out.println("Deposito 2 CENTRO: "+totalStockDeposito2);
        System.out.println("Deposito 3 SUR: "+totalStockDeposito3);
        System.out.println("Stock valorizado: "+totalValorizado);
        System.out.println("Promedio de ventas: "+promedioVentas);
        System.out.println("MAXIMO: "+stockMaximo);
    }
} 
