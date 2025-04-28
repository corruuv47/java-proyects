// Solicitar una clave numerica. Reintentar hasta acertar

package actividades;
import java.util.Scanner;

public class Act21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Create una clave: ");
        int tuClave = sc.nextInt();

        System.out.print("Ingresá la clave: ");
        int ingresaClave = sc.nextInt();

        do {
            System.out.println("Acceso denegado.");
            System.out.print("Ingresá la clave: ");
            ingresaClave = sc.nextInt();
        } while (ingresaClave != tuClave);
        System.out.println("Accediendo...");
        sc.close();
    }
}