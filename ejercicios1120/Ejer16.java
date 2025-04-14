package ejercicios1120;
import java.util.Scanner;

public class Ejer16{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrsá un numero: ");
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			sum += n;
			System.out.print("Ingrsá otro numero: ");
			n = sc.nextInt();
		}
		System.out.println("La suma es: " + sum);
		sc.close();
	}
}
