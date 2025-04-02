// Pedir al usuario 15 numeros y devolver cuanto de esos numeros son pares y cuantos son impares

package ejercicios1120;
import java.util.Scanner;

public class Ejer12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 15; i++){
            System.out.print("Ingresá el número " + (i+1) + "/15: ");
            int n = sc.nextInt();
            System.out.println(n + " es un numero " + (n % 2 == 0 ? "par." : "impar."));
        }
        sc.close();
    }
}

