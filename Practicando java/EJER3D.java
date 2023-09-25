//importo libreria para el ingreso por teclado
import java.util.Scanner;

public class EJER3D {
    public static void main(String args[]){
        //variables
        int plataforma=0;
        String titulo="";
        int duracion=0;
        String calidad="";
        final double HORA=60;
        double monto_spotify=20;
        double monto_youtube=10;
        int cant_total_canciones=0;
        int cant_total_spo1=0;
        int cant_total_you2=0;
        double costo_total=0.00;
        int tiempo_minutos=0;
        double tiempo_horas=0.00;
        double costox_plataformaSpo=0.00;
        double costox_plataformaYou=0.00;

        Scanner entrada= new Scanner(System.in);

        //ENTRADAS

        //Plataforma
        while (plataforma<1 || plataforma>2){
            System.out.println("PLATAFORMA");
            System.out.println("1: Spotify");
            System.out.println("2: Youtube");
            System.out.print("Ingrese plataforma: ");
            plataforma=entrada.nextInt();

            if(plataforma<1 || plataforma>2){
                System.out.println("Plataforma incorrecta");
            }
        }
        


        //Titulo
        entrada.nextLine();
        System.out.println("Titulo cancion: ");
        titulo=entrada.nextLine();

        //Duracion
        System.out.println("Duracion (MINUTOS): ");
        duracion=entrada.nextInt();

        //PROCESOS
        if (plataforma==1){
            //conteo de canciones por plataforma
            cant_total_spo1=cant_total_spo1+1;

            //costo por plataforma
            costox_plataformaSpo=costox_plataformaSpo+monto_spotify;
        }

        if (plataforma==2){
            //Ingreso de calidad
            System.out.println("Calidad (HD - ULTRA HD)");
            calidad=entrada.nextLine();

            //conteo de canciones por plataforma
            cant_total_you2=cant_total_you2+1;

            //costo por plataforma
            costox_plataformaYou=costox_plataformaYou+monto_youtube;
        }
        //costo total
        costo_total=costo_total+(costox_plataformaSpo+costox_plataformaYou);

        //Cantidad total de canciones ingresadas
        cant_total_canciones=cant_total_spo1+cant_total_you2;

        //Tiempo en minutos
        tiempo_minutos=tiempo_minutos+duracion;


        //Tiempo en horas
        tiempo_horas=tiempo_minutos/HORA;

        //SALIDAS
        System.out.println("Cantidad total de canciones ingresadas: "+cant_total_canciones);
        System.out.println("Cantidad total por plataforma");
        System.out.println("Spotify: "+cant_total_spo1);
        System.out.println("Youtube: "+cant_total_you2);
        System.out.println("Costo total: "+costo_total);
        System.out.println("Costo por plataforma: ");
        System.out.println("Spotify: "+costox_plataformaSpo);
        System.out.println("Youtube: "+costox_plataformaYou);
        System.out.println("Tiempo total en miutos: "+tiempo_minutos);
        System.out.println("Tiempo en horas: "+tiempo_horas);
    }
}
