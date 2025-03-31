// Verificación de edad: Escribir un programa que determine si una persona puede votar
// (mayor de 16 años) si está obligado a votar (mayor de 18 años) o si no puede votar.

package practica0;
import java.util.Scanner;

public class Ej2{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresá tu edad: ");
		int edad = sc.nextInt();
		if (edad >= 16) System.out.println(edad < 18 ? "No estás obligado a votar" : "Estás obligado a votar");
		else System.out.println("No podes votar, aún sos menor");
		sc.close();
	}
}
