// Hacer un Menú: 1. Sumar, 2. Restar, 3. Multiplicar – pedir dos números y aplicar operación.

package ejercicios1120;
import java.util.Scanner;

public class Ejer14{
	public static void main(String args[]){
		String[] arreglo = {"Sumar", "Restar", "Multiplicar", "Dividir"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa. ¿Qué quieres hacer?");
		for(int i = 0; i < 4; i++) System.out.println((i+1) + ". " + arreglo[i]);
		
		System.out.print("Ingresar opción: ");
		int menu = sc.nextInt();
		
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
		default:
			System.out.println("Andá a cagar");
		}
		
		sc.close();
		}
}