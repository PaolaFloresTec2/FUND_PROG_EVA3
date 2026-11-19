/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglos_multi;

/**
 *
 * @author paola
 */
public class EVA3_10_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //UN ARREGLO PUEDE TENER MULTIPLES DIMENSIONES:
        
        //ARREGLO DE UNA DIMENSIÓN
        int datos[] = new int[10];//[][][][][][][]...
        
        //ARREGLOS DE DOS DIMENSIONES (MATRIZ)
           //1 = FILAS
           //2= COLUMNAS
        int matriz[][] = new int[5][5];
        /*
        [][][]
        [][][]
        [][][]
        */
        for (int i = 0; i < matriz.length; i++) {//FILAS
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]"); 
            }
            System.out.println("");
        }
    }
    
}
