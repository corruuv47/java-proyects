// Mostrar la tabla de multiplicar completa del 1 al 10 

package ejercicios0110;

public class Ejer10{
    public static void main(String args[]){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}
