// Alumno Aprobado: Determinar si un alumno cumple con el 80% de asistencia(faltas>15) y
// un promedio mayor a 6 para aprobar una materia (&&).

package practica0;
import java.util.Scanner;

public class Ej6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresá las faltas del alumno: ");
		int faltas = sc.nextInt();
		System.out.print("Ingresá la nota final del alumno: ");
		int nota = sc.nextInt();
		System.out.println("El alumno está " + (faltas <= 15 && nota >= 6 ? "aprobado." : "desaprobado."));
		sc.close();
	}
}
