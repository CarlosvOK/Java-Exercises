import java.util.Scanner;

public class Ejer4D {
    public static void main(String args[]) {
        // Variables
        int carrera = 0;
        int alumnos = 0;
        int cant_alu_economia = 0;
        int cant_alu_turismo = 0;
        int cant_alu_informatica = 0;
        double porc_economia = 0.00;
        double porc_informatica = 0.00;
        double porc_turimos = 0.00;
        int total_alumnos = 0;
        String continuar = "S";

        while (continuar.equals("S")) {
            // ENTRADAS
            Scanner entrada = new Scanner(System.in);

            System.out.println("CARRERAS");
            System.out.println("1: Liceciatura en Turismo");
            System.out.println("2: Licenciatura en Informatica");
            System.out.println("3: Licenciatura en Economia");
            System.out.println("Ingrese una carrera: ");
            carrera = entrada.nextInt();

            entrada.nextLine();
            System.out.println("Ingrese cantidad de Alumnos");
            alumnos = entrada.nextInt();

            // PROCESOS
            if (carrera == 1) {
                // Cantidad de alumnos por carrera
                cant_alu_turismo = cant_alu_turismo + alumnos;
            } else if (carrera == 2) {
                cant_alu_informatica = cant_alu_informatica + alumnos;
            } else if (carrera == 3) {
                cant_alu_economia = cant_alu_economia + alumnos;
            }

            // consume el salto de linea, sino no me aparece el mensaje continuar
            entrada.nextLine();

            // Pregunto si desea continuar con el programa
            System.out.println("Desea continuar S/N:");
            continuar = entrada.nextLine();

            // INICIALIZAN VARIABLES
            carrera = 0;
            alumnos = 0;
        }
        
        // Total de alumnos de la universidad
        total_alumnos = total_alumnos + cant_alu_turismo + cant_alu_informatica + cant_alu_economia;

        porc_turimos = (cant_alu_turismo * 100.0) / total_alumnos;
        porc_informatica = (cant_alu_informatica * 100.0) / total_alumnos;
        porc_economia = (cant_alu_economia * 100.0) / total_alumnos;

        // SALIDAS
        System.out.println("Cantidad de alumnos");
        System.out.println("Licenciatura en Turismo: " + cant_alu_turismo);
        System.out.println("Licenciatura en Informatica: " + cant_alu_informatica);
        System.out.println("Licenciatura en Economia: " + cant_alu_economia);
        System.out.println("Cantidad de alumnos de la universidad: " + total_alumnos);
        System.out.println("Porcentaje de alumnos Turismo: " + porc_turimos);
        System.out.println("Porcentaje de alumnos Informatica: " + porc_informatica);
        System.out.println("Porcentaje de alumnos Economia: " + porc_economia);

    }
}
