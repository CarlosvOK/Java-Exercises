// Importación de Librerias

import java.util.Scanner;

public class maximo {

    public static void main(String[] args) {

        // Declaración de variables

        int nro = -1, maximo = 0;

        // Ingreso de numeros enteros

        while (nro != 0) {
            // Ingreso de datos por teclado

            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese un número entero positivo:");

            nro = entrada.nextInt();

            // Determino si el número actual es el máximo

            if (nro > maximo) {

                maximo = nro;

            }else if(nro<minimo){
                minimo=numero;
            }

        }

        // Salida por pantalla

        System.out.println("El máximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);

    }

}