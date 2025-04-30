// Contar cuántos números pares hay en un array de 10 elementos.

package actividades;
import java.util.Scanner;

public class Act24 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int par = 0;
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Ingresá un numero: ");
			int n = sc.nextInt();
			numeros[i] = n;
			par = numeros[i] % 2 == 0 ? par + 1 : par;
		}
		
		System.out.print("Array de números: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("");
		System.out.println("Cantidad de números pares: " + par);
		sc.close();
	}
}
