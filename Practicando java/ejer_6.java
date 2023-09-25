import java.util.Scanner;

public class ejer_6 {
    public static void main(String args[]) {
        // variables
        int aviso = -1, cant_linea = -1;
        double cant_pag = -1.00;
        double costo_total = 0.00;
        final double PRECIOLINEA = 350.00, COMISION = 0.1765;
        double COMISIONR = 17.65;
        double total_abonar = 0.00;
        final double FIJOPL = 100.00, FIJON1 = 1000, FIJON2 = 5000, FIJON3 = 10000, FIJON = 500;
        double porc = 0.00;

        Scanner entrada = new Scanner(System.in);
        // ENTRADAS
        while (aviso < 0 || aviso > 2) {
            System.out.print("Tipo de aviso 1:Por Linea - 2: Notables: ");
            aviso = entrada.nextInt();

            if (aviso < 0 || aviso > 2) {
                System.out.println("Error. Ingrese aviso valido");
            }
        }
        // procesos
        if (aviso == 1) {
            while (cant_linea < 0) {
                System.out.println("Ingrese cantidad de linea: ");
                cant_linea = entrada.nextInt();

                if (cant_linea < 0) {
                    System.out.println("Error. Ingrese una cantidad de lineas correcta");
                }
            }
            costo_total = (cant_linea * PRECIOLINEA) + FIJOPL;// 800
            porc = (COMISION * costo_total);
            total_abonar = costo_total + porc;
        } else if (aviso == 2) {
            while (cant_pag < 0) {
                System.out.println("Ingrese la cantidad de paginas del aviso: ");
                cant_pag = entrada.nextDouble();
                if (cant_pag < 0) {
                    System.out.println("Error. Ingrese una catidad correcta de paginas");
                }
            }
            if (cant_pag == 2.5) {
                costo_total = FIJON1;// 1000
                porc = COMISION * costo_total;// 176.5
                total_abonar = costo_total + porc;// 1000+176.5
            } else if (cant_pag == 1.5) {
                costo_total = FIJON2;
                porc = COMISION * costo_total;
                total_abonar = costo_total + porc;
            } else if (cant_pag == 1) {
                costo_total = FIJON3;
                porc = COMISION * costo_total;
                total_abonar = costo_total + porc;
            } else {
                costo_total = FIJON;
                porc = COMISION * costo_total;
                total_abonar = costo_total + porc;
            }
        }
        // SALIDAS
        // Costo de la publicacion
        System.out.println("El costo total del aviso es: " + costo_total);
        // Costo de comision sobre el monto facturado
        System.out.println("El costo de comisiones es de: " + COMISIONR);
        // TOTAL ABONAR DEL USUARIO
        System.out.println("El total abonar es: " + total_abonar);
    }
}