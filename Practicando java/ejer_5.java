import java.util.Scanner;
public class ejer_5 {
    public static void main(String args[]){
        //declaracion de variables
        String bebida="",tamaño="";
        String opcion="";
        String tamaño1="Lata de 300cm3";
        String tamaño2="Botella de 600cm3";
        String tamaño3="Botella de 1 Litro";
        double monto=0.00, iva=1.21, preciofinal=0.00;

        //Entradas
        System.out.print("Bienvenidos a la maquina expendedora");
        System.out.println("");
        System.out.println("Contamos con las siguientes bebidas");
        System.out.println("");
        System.out.println("1: COLA");
        System.out.println("2: NARANJA");
        System.out.println("3: LIMA LIMON");
        System.out.println();

        Scanner entrada= new Scanner(System.in);

        while (bebida==""){
            System.out.print("Ingrese el nombre de la bebida: ");
            bebida= entrada.nextLine();

            if(bebida==""){
                System.out.println("Error! Ingrese una bebida valida");
            }
        }
        while (monto<=0){
            System.out.print("Ingrese el monto a pagar: ");
            monto=entrada.nextDouble();
            if (monto<=0){
                System.out.println("Error! Ingrese un valor valido");
            }
        } 
        entrada.nextLine();
        //procesos
        if(bebida.equals("cola") || bebida.equals("naranja")){
            System.out.println("");
            System.out.println("--TAMAÑOS DE GASEASOSAS--");
            System.out.println("A. Lata de 300cm3");
            System.out.println("B. Botella de 600cm3");
            System.out.println("");
            System.out.println("Elija el tamaño de la bebida: ");
            tamaño=entrada.nextLine();

            if (tamaño.equals("A")){
                opcion=tamaño1;
                //precio de la gaseosa
                preciofinal=(monto*iva);
            }else if(tamaño.equals("B")){
                opcion=tamaño2;
                preciofinal=(monto*iva);
            }
        }else if(bebida.equals("lima limon")){
            System.out.println("Elige el tamaño de la bebida:");
            System.out.println("C. Botella de 1 Litro");
            tamaño = entrada.nextLine();
            if(tamaño.equals("C")){
                opcion=tamaño3;
                preciofinal=(monto*iva);
            }
        }
        //SALIDAS
        System.out.println("");
        System.out.println("Usted eligio la gaseasa: "+ bebida);
        System.out.println("El tamaño de su bebida es: "+opcion);
        System.out.println("El monto a pagar sobre el iva(21%) es: "+preciofinal);
    }
}
