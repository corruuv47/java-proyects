// Dado un numero de segundos(int) convertirlo a minutos(double) utilizar el modulo-%
package ejercicios0110;
import java.util.Scanner;

public class Ejer04{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar la cantidad de segundos (s) que desees: ");
        int segundos = sc.nextInt();
        System.out.println(segundos + "s -> " + (double) (segundos / 60) + "m");

        sc.close();
    }
}