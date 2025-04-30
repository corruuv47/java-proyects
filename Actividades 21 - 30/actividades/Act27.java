package actividades;
import java.util.Scanner;

public class Act27 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[8];
		int repetidos = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Ingresá numeros: ");
			int n = sc.nextInt();
			numeros[i] = n;
		}
		
		System.out.println("");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		    for (int j = i + 1; j < numeros.length; j++) {
		        if (numeros[i] == numeros[j]) repetidos++;
		    }
		}
		
		System.out.println("");
		System.out.println((repetidos >= 1 ? "Sí, hay números repetidos: " : "No, no hay números repetidos: ") + repetidos + " veces.");
		sc.close();
	}
}
