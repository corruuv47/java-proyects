// 1 Pedir al usuario un nombre y devolver la longitud de caracteres que tiene la cadena .length()
// 2 Ese nombre mostrarlo en Mayusculas .toUpperCase() y minusculas .toLowerCase()
// 3 Pedir el apellido del usuario y concatenarlo en un nuevo String +
// 4 Devolver el indice del apellido del usuario.indexOf()
package actividades;
import java.util.Scanner;

public class Act05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Nombre ingresado: " + nombre + " " + apellido);
        System.out.println("Caracteres: " + nombre + ": " + nombre.length() + " | " + apellido + ": " + apellido.length());
        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase() + " " + apellido.toUpperCase());
        System.out.println("Nombre en minúsculas: " + nombre.toLowerCase() + " " + apellido.toLowerCase());
        System.out.println("Indice de apellido: " + apellido.indexOf(apellido));

        sc.close();
    }
}