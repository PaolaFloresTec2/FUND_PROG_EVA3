/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        boolean valorEncontrado = false;
        int[] valores = new int [10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print("{" + valores[i] + "}");
        }
        
        do{
            //pedir el valor
            System.out.println("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO : ");
            valor = captu.nextInt();
            captu.nextLine();
            //recorrer todos los valores del arreglo
            for (int i = 0; i < valores.length; i++) {
                if(valor == valores[i]){//EL VALOR ESTA EN EL ARREGLO
                    System.out.println("ENCONTRASTE EL VALOR: ESTA EN LA POSICIÓN: " + i);
                    valorEncontrado = true;
                    break;
                }
            }
            //buscar
            //si esta en el arreglo, salimos del ciclo
            if(valorEncontrado)
                break;
        }while(true);
    }   
}
