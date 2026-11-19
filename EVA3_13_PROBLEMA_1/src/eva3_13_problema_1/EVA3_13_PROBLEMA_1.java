/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_1;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA3_13_PROBLEMA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        int valores[] = new int [10];
        int contador = 0;
        System.out.println("Dime un número entre el 0 al 9: ");
        valor = captu.nextInt();
        captu.nextLine();
        
        
        
        for (int i = 0; i < 10; i++) {
            valores[i] = (int)(Math.random() * 10);
              System.out.print("[" + valores[i] + "]");
              if (valores[i] == valor){
                  contador++;
              }
          
            System.out.println(" El número " + valor + " está " + contador + " veces");
        }
        System.out.println("Tú número está: " + contador);
      
    }
    
}
