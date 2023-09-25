import java.util.Scanner;

public class salario_sabiendo {
    public static void main(String args[]) {

        // Declaro variables
        String nombre = "",max_nombre="",min_nombre="";
        int salario = -1;
        int max_salario=0;
        int min_salario=999999999;
        String continuar = "S";

        //PROCESO
        while (continuar=="S") {
            // Ingreso de datos por teclado
            Scanner entrada = new Scanner(System.in);
            

            //⁡⁢⁣⁢Validacion e ingreso de nombre⁡
            while (nombre ==""){
                System.out.print("Ingrese su nombre: ");
                nombre = entrada.nextLine();

                if (nombre==""){
                    System.out.println("ERROR! Ingrese un nombre valido");
                }
            }



            //⁡⁢⁣⁢Validacion e ingreso de salario⁡
            while (salario<0){
                // Ingreso de salario
                System.out.print("Ingrese su salario: ");
                salario = entrada.nextInt();

                if (salario<0){
                    System.out.println("ERROR! Ingrese un numero valido");
                }
            }

            //Determino el valor maximo
            if (salario>max_salario){
                max_salario=salario;//Nuevo maximo
                max_nombre=nombre;
            }
            //Determino el valor minimo
            if (salario<min_salario){
                min_salario=salario;//Nuevo minimo
                min_nombre=nombre;
            }

            // Consumir el salto de línea
            entrada.nextLine();

            // Pregunto si desea continuar
            System.out.print("¿Desea continuar? (S/N): ");
            continuar = entrada.nextLine();

            //INICIALIZACION DE VARIABLES
            nombre="";
            salario=-1;
        }

        // Salida por pantalla
        System.out.println("El salario mas alto fue el de: "+max_nombre);
        System.out.println("El valor del salario maximo es de:  "+max_salario);
        System.out.println("El salario mas bajo fue el de:  "+min_nombre);
        System.out.println("El valor del salario minimo es de:  "+min_salario);
    }
}


