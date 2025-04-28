// Mostrar el factorial de un numero 

package actividades;
import java.util.Scanner;

public class Act11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresá un numero: ");
        int n = sc.nextInt();
        int resultado = 1;
        for(int i = n; i > 0; i--){
            resultado *= n;
        }
        System.out.println(n + "! = " + resultado);
        sc.close();
    }
}
