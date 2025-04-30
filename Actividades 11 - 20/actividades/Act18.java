// Leer edades hasta que se ingrese una negativa. Mostrar cuantas personas se ingresaron

package actividades;
import java.util.Scanner;

public class Act18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int suma = 1;
        System.out.print("Ingresá una edad: ");
        int edad = sc.nextInt();
        do {
            suma++;
            System.out.print("Ingresá una edad: ");
            edad = sc.nextInt();
        } while (edad > 0);
        System.out.println("Edades ingresadas: " + suma);
        sc.close();
    }
}