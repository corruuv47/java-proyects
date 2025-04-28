// Motrar todos los numeros del 1 al N (ingresado por usuario)

package acts01;
import java.util.Scanner;

public class Ejer07{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Decime un numero: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print((i+1) + " ");
        }
        sc.close();
    }
}
