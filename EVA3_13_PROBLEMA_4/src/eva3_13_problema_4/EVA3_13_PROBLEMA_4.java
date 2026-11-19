/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_4;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA3_13_PROBLEMA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dias[] ={"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        Scanner captu = new Scanner(System.in);
         int[][] asistencia = new int[3][7];

        // Capturar asistencias
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEstudiante " + (i + 1));

            for (int j = 0; j < 7; j++) {
                System.out.print("Dia " + (j + 1) + " (1=Asistencia, 0=Inasistencia): ");
                asistencia[i][j] = captu.nextInt();
            }
        }
        // Contar asistencias e inasistencias
        for (int i = 0; i < 3; i++) {

            int asistencias = 0;
            int inasistencias = 0;

            for (int j = 0; j < 7; j++) {

                if (asistencia[i][j] == 1) {
                    asistencias++;
                } else {
                    inasistencias++;
                }
            }
            System.out.println("\nEstudiante " + (i + 1));
            System.out.println("Asistencias: " + asistencias);
            System.out.println("Inasistencias: " + inasistencias);
        }
    }
    
}
