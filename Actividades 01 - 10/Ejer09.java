// Mostrar los numeros impares del 1 al N

package acts01;
import java.util.Scanner;

public class Ejer09{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Decime un numero: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if (i % 2 != 0) System.out.print(i + " ");
        }
        sc.close();
    }
}
