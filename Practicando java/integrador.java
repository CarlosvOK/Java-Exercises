import java.util.Scanner;

public class integrador {
    public static void main(String[] args) {
        //Declaracion de variables
        int num_pedido = 0;
        String continuar = "S";
        int agencia = 0, mes=0, destino=0;
        double monto_m = 0, monto_j=0;
        double monto_costa=0.00,monto_sierra = 0.00,monto_patagonia=0.00;
        int cant_jubilados = -1, cant_menores = -1;
        int cant_total_jubilados = 0, cant_total_menores = 0;
        int cant_total_ag1 = 0, cant_total_ag2=0;
        double porc_menores = 0.00, porc_jubilados = 0.00;
        final double COSTA = 100000.00, SIERRA = 199000.99, PATAGONIA = 299999.99;

        // ENTRADAS
        while (continuar.equals("S")) {//.equals es un metodo para comparar cadenas
            Scanner entrada = new Scanner(System.in);
            while (agencia < 1 || agencia > 2) {
                System.out.print("Ingrese una agencia entre el 1 - 2: ");
                agencia = entrada.nextInt();

                if (agencia < 1 || agencia > 2) {
                    System.out.println("Error, Ingrese un valor valido");
                }
            }
            if (agencia == 1 || agencia ==2) {
                while (mes < 1 || mes > 12) {
                    System.out.print("Ingrese un dia del mes del 1-12: ");
                    mes = entrada.nextInt();

                    if (mes < 1 || mes > 12) {
                        System.out.println("Error! Ingrese un valor valido");
                    }
                }
                while (destino < 1 || destino > 3) {
                    System.out.print("Ingrese su destino: ");
                    destino = entrada.nextInt();

                    if (destino < 1 || destino > 3) {
                        System.out.println("Error, ingrese un valor valido");
                    }
                }
                // Ingreso de personas mayores
                while (cant_jubilados < 0) {
                    System.out.print("Ingrese cantidad de mayores: ");
                    cant_jubilados = entrada.nextInt();

                    // Condicion de error
                    if (cant_jubilados < 0) {
                        System.out.println("Error, ingrese un valor valido");
                    }
                }
                while (cant_menores < 0) {
                    System.out.print("Ingrese cantidad de menores: ");
                    cant_menores = entrada.nextInt(); 

                    if (cant_menores < 0) {
                        System.out.println("Error, Ingrese un valor valido");
                    }
                }
                //PROCESOS A REALIZAR DURANTE EL ALGORITMO
                if (destino == 1) {//COSTA
                    // porcentaje de descuento segun el precio
                    porc_menores = COSTA * 0.85;
                    porc_jubilados = COSTA * 0.50;
                    
                    monto_m = porc_menores * cant_menores;
                    monto_j = porc_jubilados * cant_jubilados;

                    monto_costa=monto_costa+(monto_j+monto_m);
                } else if (destino == 2) {//SIERRA
                    
                    porc_menores = SIERRA * 0.85;
                    porc_jubilados = SIERRA * 0.50;

                    monto_m = porc_menores * cant_menores;
                    monto_j = porc_jubilados * cant_jubilados;
     
                    monto_sierra=monto_sierra+(monto_j+monto_m);

                } else if (destino == 3) {// PATAGONIA
                    // porcentaje de descuento segun el precio
                    porc_menores = PATAGONIA * 0.85; 
                    porc_jubilados = PATAGONIA * 0.50;

                    // cantidad total de personas mayores DE PATAGONIA
                    cant_total_jubilados = cant_total_jubilados + cant_jubilados;
                    // cantidad total de personas menores DE PATAGONIA
                    cant_total_menores = cant_total_menores + cant_menores;

                    // Descuento por personas
                    monto_m = porc_menores * cant_menores;
                    monto_j = porc_jubilados * cant_jubilados;
                    //monto total con descuentos incluidos
                    monto_patagonia=monto_patagonia+(monto_j+monto_m);
                }
                //calculo de cantidad de pedidos por agencia
                if (agencia==1){
                    //cantidad de pedidos de la agencia NUMERO 1
                    cant_total_ag1 = cant_total_ag1 + 1;
                }else if(agencia==2){
                    //cantidad de pedidos de la agencia NUMERO 1
                    cant_total_ag2=cant_total_ag2+1;
                }

                // Numero de pedido autoincremental
                num_pedido = num_pedido + 1;

                //consume el salto de linea, sino no me aparece el mensaje continuar
                entrada.nextLine();
                
                // Pregunto si desea continuar con el programa
                System.out.print("Desea continuar S/N:");
                continuar = entrada.nextLine();

                //Inicializacion de variables
                agencia = 0;
                destino = 0;
                mes = 0;
                cant_jubilados = 0;
                cant_menores = -1;
            }
        }
        //SALIDAS
        System.out.println();
        System.out.println("El numero del pedido es :"+ num_pedido);
        System.out.println("Cantidad total de pedidos por agencia:");
        System.out.println("Agencia N1: "+cant_total_ag1);
        System.out.println("Agencia N2: "+cant_total_ag2);
        System.out.println("Cantidad total de personas mayores y menores para patagonia: ");
        System.out.println("Mayores: "+cant_total_jubilados);
        System.out.println("Menores: "+cant_total_menores);
        System.out.println("Monto total facturado por destino: ");
        System.out.println("1: COSTA = " +monto_costa);
        System.out.println("2: SIERRA = " +monto_sierra);
        System.out.println("3: PATAGONIA = " +monto_patagonia);
    }
}
