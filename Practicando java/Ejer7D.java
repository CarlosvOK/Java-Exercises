import java.util.Scanner;

public class Ejer7D {
    public static void main(String args[]) {
        // Variables
        String nombre = "";
        String apellido = "";
        String opcion = "S";
        String maxNombre = "";
        int aciertosMaximos = 0;
        int nro1 = 0, nro2 = 0, nro3 = 0;
        final double ACIERTOUno = 10000;
        int cantidadAciertos = 0;
        double monto = 0.00, monto1 = 0, monto2 = 0, monto3 = 0;
        double TotalLoteria = 0.00;
        int cantidadTotalAciertos = 0;
        double montoGanado = 0;

        Scanner entrada = new Scanner(System.in);
        while (opcion.equals("S")) {
            // ENTRADAS
            while (nombre.equals("")) {
                System.out.println("Su nombre: ");
                nombre = entrada.nextLine();

                if (nombre.equals("")) {
                    System.out.println("Error Nombre");
                }
            }

            while (apellido.equals("")) {
                System.out.println("Su apellido: ");
                apellido = entrada.nextLine();

                if (apellido.equals("")) {
                    System.out.println("Error Apellido");
                }
            }

            System.out.println("Numero 1: ");
            nro1 = entrada.nextInt();

            System.out.println("Numero 2: ");
            nro2 = entrada.nextInt();

            System.out.println("Numero 3: ");
            nro3 = entrada.nextInt();

            // PROCESOS
            cantidadAciertos = 0;

            if (nro1 == 20 && nro2 == 31 && nro3 == 5) {
                monto = ACIERTOUno;
                cantidadAciertos = 3;
            } else {
                if (nro1 == 20) {
                    cantidadAciertos=cantidadAciertos+1;
                    monto1 = 5000;
                }
                if (nro2 == 31) {
                    cantidadAciertos=cantidadAciertos+1;
                    monto2 = 3000;
                }
                if (nro3 == 5) {
                    cantidadAciertos=cantidadAciertos+1;
                    monto3 = 2000;
                }
            }

            if (cantidadAciertos > aciertosMaximos) {
                aciertosMaximos = cantidadAciertos;
                maxNombre = nombre;
            }

            // Monto ganado
            montoGanado = monto + monto1 + monto2 + monto3;

            // Total de monto de la loteria
            TotalLoteria += montoGanado;

            // Cantidad de aciertos
            cantidadTotalAciertos += cantidadAciertos;

            // SALTO DE LINEA
            entrada.nextLine();

            // Pregunto si desea continuar con el programa
            System.out.print("Desea continuar S/N:");
            opcion = entrada.nextLine();

            nombre = "";
            apellido = "";
            nro1 = 0;
            nro2 = 0;
            nro3 = 0;

            System.out.println("El monto ganado: " + montoGanado);
            System.out.println("Cantidad de aciertos: " + cantidadAciertos);
        }
        // SALIDAS
        System.out.println("Total de premios: " + TotalLoteria);
        System.out.println("Cantidad total de aciertos: " + cantidadTotalAciertos);
        System.out.println("El nombre del jugador que más aciertos tuvo: " + maxNombre);
    }
}
