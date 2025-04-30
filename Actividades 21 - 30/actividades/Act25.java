// Invertir el contenido de un array de 6 elementos (sin usar otro array).

package actividades;
import java.util.Scanner;

public class Act25 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[6];
		int temp = 0;
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Ingresá un numero: ");
			int n = sc.nextInt();
			numeros[i] = n;
		}
		
		System.out.print("Array de numeros normal: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < numeros.length / 2; i++) {
            temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
		
		System.out.print("Array de numeros invertido: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		
		sc.close();
	}
}
