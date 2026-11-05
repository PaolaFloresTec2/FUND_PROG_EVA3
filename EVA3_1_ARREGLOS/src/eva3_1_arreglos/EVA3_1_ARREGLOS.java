/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author paola
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //UN ARREGLO ES UNA ESCTRUCTURA DE TAMAÑO
        //ES UNA SECUENCIA DE VALORES
        //TODOS LOS DATOS SON DEL MISMO TIPO
        //NO CAMBIA DE TAMAÑO (INMUTABLE)
        //EL ACCESO ES POR ÍNDICES (ACCESO ALEATORIO)
        int[] arreglo;//solo declaré el arreglo
        //especificar el tamaño
        arreglo = new int[10];//a partir de aquí, importa conocer el tamaño de los datos    
        //int[] arreglo = new int[10];
        //ACCESO POR ÍNDICES
        //EN JAVA EL PRIMER ELEMENTO ESTÁ EN LA POSICIÓN CERO 0
        //EL ÚLTIMO ES LA POSICIÓN N - 1, DONDE N ES LA CANTIDAD DE ELEMENTOS
        // 0 1 2 3 4 5 6 7 8 9
        
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        arreglo[9] = 1000;
        
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        System.out.println("arreglo[2] = " + arreglo[2]);
        System.out.println("arreglo[3] = " + arreglo[3]);
        System.out.println("arreglo[4] = " + arreglo[4]);
        System.out.println("arreglo[5] = " + arreglo[5]);
        System.out.println("arreglo[6] = " + arreglo[6]);
        System.out.println("arreglo[7] = " + arreglo[7]);
        System.out.println("arreglo[8] = " + arreglo[8]);
        System.out.println("arreglo[9] = " + arreglo[9]);
    }
    
}
