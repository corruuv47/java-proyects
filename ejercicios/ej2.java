// Sacar el promedio de un alumno, nos da un double nosotros lo convertimos a int
package ejercicios;
import java.util.Scanner;

public class ej2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar nombre del alumno: ");
        String alumno = sc.nextLine();

        System.out.print("Ingresar nota 1 del alumno: ");
        int nota1 = sc.nextInt();
        System.out.print("Ingresar nota 2 del alumno: ");
        int nota2 = sc.nextInt();

        double promedio = (nota1 + nota2) / 2;
        System.out.println(alumno + " tiene un promedio de: " + (int) promedio);
        sc.close();
    }
}