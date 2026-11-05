/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_menu2;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA3_5_MENU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] opciones = {"Ventas", "Clientes", "Proveedores", "Salir"};
        System.out.println("--------------MENU DEL SISTEMA------------");
        for (int i = 0; i < opciones.length; i++){
            System.out.println(i + " - " + opciones[i]);
            
        }
        Scanner captu = new Scanner (System.in);
        System.out.println("Selecciona una opción");
        int sel = captu.nextInt();
        
        switch(sel){
            case 0:
                System.out.println("Módulo de ventas");
            case 1:
                System.out.println("Módulo de clientes");
            case 2:
                System.out.println("Módulo de proveedores");
            case 3:
                System.out.println("Módulo del sistema");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
    
}
