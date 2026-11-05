/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author paola
 */
public class EVA3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[], x, y;//
        // int[] arreglo, x, y;//aquí todos las variables son arreglos porque los corchetes estan junto al "int"
        // int arreglo[], x, y;//aquí solo "arreglo" es arreglo porque los corchetes estan junto a la variable "arreglo"
        
        arreglo = new int[10];//arreglo con 10 enteros
        //arreglo [10] = 100; ERROR --> el 10 no es una posición válida porque se empieza a contar desde el 0
        //Entonces te estas pasando del límite
        
        //EL USO DE ARREGLOS VA LIGADO AL USO DE CICLOS.
        //EN PARTICUKAR EL CICLO FOR
        for(int i = 0; i < 10; i++){
            arreglo[i] = (int) (Math.random() * 100);//CASTING ----> COMPATIBLES            
        }
        for(int i = 0; i <10; i++){
            System.out.print(arreglo[i] + " - ");
            
        }
    }
    
}
