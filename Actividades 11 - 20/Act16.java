// Ingresar números hasta que el usuario ingrese un 0. Mostrar la suma total.

package actividades;
import java.util.Scanner;

public class Act16{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresá un numero: ");
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			sum += n;
			System.out.print("Ingresá otro numero: ");
			n = sc.nextInt();
		}
		System.out.println("La suma es: " + sum);
		sc.close();
	}
}
