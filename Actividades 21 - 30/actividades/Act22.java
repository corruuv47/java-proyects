// Sumar todos los elementos de un array de 5 enteros ingresados por teclado.

package actividades;
import java.util.Scanner;

public class Act22{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("Ingresá un numero: ");
			int n = sc.nextInt();
			numeros[i] = n;
		}
		System.out.print("Array de números: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		sc.close();
	}
}
