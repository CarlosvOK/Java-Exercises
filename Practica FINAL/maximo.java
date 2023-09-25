import java.util.Scanner;

public class maximo {
    public static void main(String args[]){
        //variables
        int numero=0;
        int maximo=0;
        long minimo=9999999;
        String continuar="S";

        Scanner entrada=new Scanner(System.in);

        while (continuar.equals("S")){
            //entradas
            System.out.println("Ingrese numero: ");
            numero=entrada.nextInt();

            entrada.nextLine();

            System.out.println("Continuar S/N: ");
            continuar=entrada.nextLine();

            if(numero>maximo){
                maximo=numero;
            }else if(numero<minimo){
                minimo=numero;
            }
            
            numero=0;
        }
        
        System.out.println("El maximo es: "+maximo);
        System.out.println("El minimo es: "+minimo);

    }
}