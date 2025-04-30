// Menu de opciones: jugar, ver estadisticas, configuracion, salir. Repetir hasta que elija salir

package actividades;
import java.util.Scanner;

public class Act19{
    public static void main(String args[]){
        String[] menu = {"Jugar", "Estadísticas", "Configuración", "Salir"};
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < menu.length; i++){
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.print("¿Qué desea hacer?: ");
        int option = sc.nextInt();
        do{
            System.out.println("Lo sentimos opcion corrompida elija otra!!!!!!!!");
            for(int i = 0; i < menu.length; i++){
                System.out.println((i+1) + ". " + menu[i]);
            }
            System.out.print("¿Qué desea hacer?: ");
            option = sc.nextInt();
        } while(option != 4);
        System.out.println("Tenga un buen día! :)");
        sc.close();
    }
}