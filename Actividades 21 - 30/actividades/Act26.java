// Cargar 10 notas (0-10) y mostrar el promedio y la cantidad de alumnos desaprobados.

package actividades;
import java.util.Scanner;

public class Act26 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] alumnos = new String[10];
		int[] notas = new int[10];
		int aprobados = 0;
		int desaprobados = 0;
		int suma = 0;
		
		for(int i = 0; i < alumnos.length; i++) {
			System.out.print("Ingresá el nombre del alumno: ");
			String alumno = sc.next();
			alumnos[i] = alumno;
			for(int j = 0; j < 4; j++) {
				System.out.print("Ingresá la nota " + (j+1) + " de " + alumnos[i] + ": ");
				int nota = sc.nextInt();
				suma += nota;		
			}
			notas[i] = (suma / 4);
			suma = 0;
		}
		
		for(int i = 0; i < alumnos.length; i++) {
			aprobados = notas[i] >= 6 ? aprobados + 1 : aprobados;
			desaprobados = notas[i] < 6 ? desaprobados + 1 : desaprobados;
		}
		
		System.out.println("Posición\tAlumno/a\tNota Final\t¿Aprobó?");
		for(int i = 0; i < alumnos.length; i++) {
			System.out.print((i+1) + ". \t\t" + alumnos[i] + "\t\t" + notas[i] + "\t\t" + (notas[i] >= 6 ? "Sí" : "No"));
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("Cantidad de alumnos aprobados: " + aprobados + "/" + alumnos.length);
		System.out.println("Cantidad de alumnos desaprobados: " + desaprobados + "/" + alumnos.length);
		
		sc.close();
	}
}
