// Pedir contraseñas hasque que se escriba "latzina123"
package actividades;
import java.util.Scanner;

public class Act17{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String contra = "latzina123";
		System.out.print("Ingresar contraseña: ");
		String contraseña = sc.nextLine();
		while (!contraseña.equals(contra)) {
			System.out.print("Ingresar contraseña: ");
			contraseña = sc.nextLine();
		}
		if (contraseña.equals(contra)) System.out.println("Accediendo al sistema...");
		sc.close();
	}
}