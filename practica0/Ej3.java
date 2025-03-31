// Autenticación de usuario: Pedir un nombre de usuario y contraseña, y verificar si
// coinciden con un usuario y contraseña guardado.

package practica0;
import java.util.Scanner;

public class Ej3{
	public static void main(String args[]) {
		String mi_user = "Corruuuu04";
		String mi_contraseña = "02-06-2007";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre de usuario: ");
		String user = sc.nextLine();
		System.out.print("Contraseña: ");
		String contraseña = sc.nextLine();
		if(user.equals(mi_user) && contraseña.equals(mi_contraseña)) System.out.println("Accediendo al Sistema");
		else System.out.println("Nombre de usuario o contraseña son incorrectos.");
		sc.close();
	}
}
