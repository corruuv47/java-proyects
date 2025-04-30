// Ingresar una letra y mostrar si corresponde a una opción: A. Atacar, B. Bloquear, C. Correr.
package actividades;
import java.util.Scanner;

public class Act13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresá una letra: ");
		String letter = sc.nextLine();
		if (letter.length() == 1) {
			switch (letter) {
			case "A":
				System.out.println("Atacando...");
				break;
			case "B":
				System.out.println("Bloqueando...");
				break;
			case "C":
				System.out.println("Corriendo...");
				break;
			default:
				System.out.println("ERROR.");
				break;
			}
		}
		sc.close();
		}
}
