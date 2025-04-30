// Calculo del modulo: Pedir un número y determinar si es par o impar.

package practica;
import java.util.Scanner;

public class Act05{
	public static void main(String args[]) {
		System.out.print("Ingresá un numero: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Este numero es " + (n % 2 == 0 ? "par" : "impar"));
		sc.close();
	}
}
