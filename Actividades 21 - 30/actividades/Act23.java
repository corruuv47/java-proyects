// Mostrar el mayor número de un array de 6 elementos.

package actividades;
import java.util.Scanner;

public class Act23 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[6];
		int max = 0;
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Ingresá un numero: ");
			int n = sc.nextInt();
			numeros[i] = n;
			max = numeros[i] > max ? numeros[i] : max;
		}
		
		System.out.print("Array de números: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("");
		System.out.println("Número máximo: " + max);
		sc.close();
	}
}
