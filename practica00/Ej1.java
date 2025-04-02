// Comparar dos números: Solicitar dos números distintos y mostrar cual es el mayor, tener
// en cuenta el caso de que sean iguales.

package practica00;
import java.util.Scanner;

public class Ej1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresá un numero a:");
		int a = sc.nextInt();
		System.out.print("Ingresá un numero b:");
		int b = sc.nextInt();
		if(a != b) System.out.println(a > b ? "a es mayor que b" : "b es mayor que a");
		else System.out.println("a y b son equivalentes");
		sc.close();
	}
}