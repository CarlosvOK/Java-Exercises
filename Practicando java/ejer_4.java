import java.util.Scanner;

public class ejer_4{
    public static void main(String []args){
        //declaracion de variables
        
        String nombre="";
        float total_monto=0;
        int cant_fija=5000;
        int km_razon1=30, km_razon2=60;
        int km=0,tope=300;

        //declaro la variable para el ingreso de datos
        Scanner entrada = new Scanner (System.in);
        while (nombre==""){
             //Ingreso de datos; El nombre
            System.out.print("Ingrese su nombre: ");
            nombre=entrada.nextLine();

            if (nombre==""){
                System.out.println("Error! Ingrese un valor valido");
            }
        }
        while (km < 1 || km > 2){
            //Ingrese de datos; El kilometraje
            System.out.print("Ingrese el kilometraje: ");
            km=entrada.nextInt();

            if (km < 1 || km > 10){
                System.out.println("Error! Ingrese un valor valido");
            }
        }

        if (km<tope){//tope=300
            total_monto=cant_fija;//total_monto=0 despues, cant_fija=5000
        }else if(km>tope && km<1000){
            total_monto=cant_fija+(km-tope)*km_razon1;
        }else if(km>1000 && km<2000){
            total_monto=cant_fija+(km-1000)*km_razon1;
        }else if(km>2000){
            total_monto=cant_fija+(km-1000)*km_razon2;
        }
        //Salida por pantalla
        System.out.println("Su nombre es: "+nombre);
        System.out.print("El saldo a pagar segun, "+ km +"km"+", es de: "+ total_monto);
    }

}
