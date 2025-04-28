// Agregar un bucle do-while para la Act14 para que el menu se repita, tambien agrega la opcion 4 para salir del menu.
package actividades;
import java.util.Scanner;

public class Act20{
	public static void main(String args[]){
        String[] arreglo = {"Sumar", "Restar", "Multiplicar", "Dividir", "Salir"};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido al programa. ¿Qué quieres hacer?");
        for(int i = 0; i < arreglo.length; i++) System.out.println((i+1) + ". " + arreglo[i]);
        
        System.out.print("Ingresar opción: ");
        int menu = sc.nextInt();
        
        
        do{
            
            System.out.print("Ahora, ingresa un número A: ");
            int a = sc.nextInt();
            System.out.print("Ahora, ingresa un número B: ");
            int b = sc.nextInt();
            
            switch(menu){
            case 1:
                System.out.println("La suma entre " + a + " y " + b + " es: " + (a+b));
                break;
            case 2:
                System.out.println("La resta entre " + a + " y " + b + " es: " + (a-b));
                break;
            case 3:
                System.out.println("El producto entre " + a + " y " + b + " es: " + (a*b));
                break;
            case 4:
                System.out.println("La división entre " + a + " y " + b + " es: " + (float) (a / b));
                break;
            case 5:
                System.out.println("Andá a cagar");
            default:
                System.out.println("Ingresá opción válida");
            }
            System.out.print("Ingresar opción: ");
            menu = sc.nextInt();
        } while (menu != 5);
        sc.close();
	}
}
