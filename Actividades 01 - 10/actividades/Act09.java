// Mostrar los numeros impares del 1 al N

package actividades;
import java.util.Scanner;

public class Act09{
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
