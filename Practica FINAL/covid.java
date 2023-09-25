import java.util.Scanner;

public class covid {
    public static void main(String Args[]) {
        // variables y constantes
        String nombre = "";
        String apellido = "";
        String continuar = "S";
        int edad = 0;
        int dni = 0;
        String puestoTrabajo = "";
        int tipoVacuna = 0;
        double donacion = 0.00, maxDonacion = 0.00;
        double porcentaje = 0.00, PorMed = 0.85;
        double PorEnf = 0.50;
        double PorOtros = 0.30;
        int sumaEdades = 0;
        int vacunadosDias = 0;
        double precio = 0.00;
        double promedioEdades = 0.00;
        double montoAcumulado = 0.00;
        double descuento = 0.00, totalPagar = 0.00;
        final double PFIZER = 4000, SINOVAC = 6000, SINOPHARM = 8000, MODERNA = 10000;

        Scanner entrada = new Scanner(System.in);

        // ENTRADAS
        // INGRESE DE NOMBRE POR TECLADO
        while (continuar.equals("S")) {
            while (nombre.equals("")) {
                System.out.print("Nombre: ");
                nombre = entrada.nextLine();
                // VALIDACION DE NOMBRE
                if (nombre.equals("")) {
                    System.out.println("Error! Nombre invalido");
                }
            }
            // INGRESE DE APELLIDO POR TECLADO
            while (apellido.equals("")) {
                System.out.print("Apellido: ");
                apellido = entrada.nextLine();
                // VALIDACION DE APELLIDO
                if (apellido.equals("")) {
                    System.out.println("Error! Apellido invalido: ");
                }
            }

            // INGRESO DE EDAD
            while (edad <= 0) {
                System.out.print("Edad: ");
                edad = entrada.nextInt();
                if (edad <= 0) {
                    System.out.println("Error! Edad invalida");
                }
            }

            // Ingreso de DNI
            while (dni <= 0) {
                System.out.print("DNI: ");
                dni = entrada.nextInt();
                // VALIDACION DE DNI
                if (dni <= 0) {
                    System.out.println("Errror! DNI invalido");
                }
            }
            entrada.nextLine();
            // INGRESO PUESTO DE TRABAJO
            while (puestoTrabajo.equals("")) {
                System.out.print("Puesto de trabajo: ");
                puestoTrabajo = entrada.nextLine();
                if (puestoTrabajo.equals("")) {
                    System.out.println("Error! Puesto de trabajo invalido");
                }
            }

            while (tipoVacuna < 1 || tipoVacuna > 4) {
                System.out.print("Tipo vacuna: ");
                tipoVacuna = entrada.nextInt();
                if (tipoVacuna < 1 || tipoVacuna > 4) {
                    System.out.println("Error! Tipo de vacuna invalida");
                }
            }

            while (donacion <= 0) {
                System.out.print("Donacion: ");
                donacion = entrada.nextDouble();
                if (donacion <= 0) {
                    System.out.println("Error! Donacion invalida");
                }
            }
            entrada.nextLine();
            // PREGUNTO SI DECIA CONTINUAR
            System.out.println("Desea continuar S/N: ");
            continuar = entrada.nextLine();

            // PROCESOS
            if (puestoTrabajo.equals("medico")) {
                porcentaje = PorMed;
            } else if (puestoTrabajo.equals("enfermero")) {
                porcentaje = PorEnf;
            } else {
                porcentaje = PorOtros;
            }

            if (tipoVacuna == 1) {
                precio = PFIZER;
            } else if (tipoVacuna == 2) {
                precio = SINOVAC;
            } else if (tipoVacuna == 3) {
                precio = SINOPHARM;
            } else if (tipoVacuna == 4) {
                precio = MODERNA;
            }

            descuento = porcentaje * precio;// 5,100
            totalPagar = precio - descuento;// 6,000-5,100

            // SUMA DE EDADES PROMEDIO
            sumaEdades = sumaEdades + edad;

            // TOTAL VACUNADOS DURANTE EL DIA
            vacunadosDias = vacunadosDias + 1;

            // promedio de edades
            promedioEdades = sumaEdades / vacunadosDias;

            // MONEDERO VIRTUAL
            montoAcumulado = montoAcumulado + totalPagar;

            // DONACION MAS ALTA
            if (donacion > maxDonacion) {
                maxDonacion = donacion;
            }

            // REINICIO DE VARIABLES
            nombre = "";
            apellido = "";
            edad = 0;
            dni = 0;
            puestoTrabajo = "";
            tipoVacuna = 0;
            donacion = 0;

        }
        // SALIDAS
        System.out.println("");
        System.out.println("Promedio de edades: " + promedioEdades);
        System.out.println("Total de vacunados durante el dia: " + vacunadosDias);
        System.out.println("");
        System.out.println("SU FACTURA");
        System.out.println("Descuento: " + descuento);
        System.out.println("Monto acomulado: " + montoAcumulado);
        System.out.println("Maxima donacion: " + maxDonacion);

    }
}