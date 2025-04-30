// Código que ingresa un nombre por entrada estándar e imprime el nombre ingresado.

package actividades;
import java.util.Scanner;

public class Act01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
        sc.close();
    }
}