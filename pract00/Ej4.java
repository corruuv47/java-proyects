// Validación de número positivo: Comprobar si un número ingresado es positivo, negativo o cero.

package pract00;
import java.util.Scanner;

public class Ej4{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresá un numero: ");
		int n = sc.nextInt();
		if (n != 0) System.out.println(n > 0 ? "Este numero es positivo" : "Este numero es negativo");
		else System.out.println("Este numero es el cero");
		sc.close();
	}
}
