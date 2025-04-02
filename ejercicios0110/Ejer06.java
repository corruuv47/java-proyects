// Hasta el dia de ayer la seleccion Argentina tenia 22 golesafavor y 7 golesencontra
// Establecer los valores
// Asignar un operador de asignacion += 4 a la variable golesafavor
// y agregarle 1 a la variable golesencontra ++
// Mostrar la diferencia de goles de la seleccion

package ejercicios0110;
public class Ejer06{
    public static void main(String args[]){
        int goles_a_favor = 22;
        int goles_en_contra = 7;

        goles_a_favor += 4;
        goles_en_contra++;

        System.out.println("Actualización goles a favor: " + goles_a_favor);
        System.out.println("Actualización goles en contra: " + goles_en_contra);
        System.out.println("Actualización diferencia de gol: " + (goles_a_favor - goles_en_contra));
    }
}
