// Convertir una tempreatura Celcius(double) a Fahrenheit(int) (formula: 0 °C × 9/5) + 32 = 32 °F)
package ejercicios;
import java.util.Scanner;

public class ej3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar un valor de temperatura en ºC (Celcius): ");
        double temperatura = sc.nextDouble();

        System.out.println("Celcius a Fahrenheit: " + temperatura + "ºC -> " + (int) (temperatura * (9/5) + 32) + "ºF");
        System.out.println("Celcius a Kelvin: " + temperatura + "ºC -> " + (int) (temperatura + 273) + " K");

        sc.close();
    }
}