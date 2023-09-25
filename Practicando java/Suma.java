import java.util.Scanner;

public class Suma{
    public static void main(String args []){
        Scanner entrada = new Scanner (System.in);

        String nombre ="";
        int num1=0,num2=0,resultado=0;

        System.out.print("Cual es tu nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Dame el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Dame el segundo numero: ");
        num2 = entrada.nextInt();

        resultado = num1+num2;

        System.out.print("Hola "+nombre+ " El resultado de la suma es: "+resultado);
        

    }
}