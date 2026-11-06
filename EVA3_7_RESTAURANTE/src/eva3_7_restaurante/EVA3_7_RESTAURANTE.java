/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA3_7_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String[] menu = {"Hamburguesas", "Tortas", "Chilaquiles", "Gorditas", "Burritos", "Hotdog", "Pizza", "Bonelees", "Tacos", "Enchiladas"};
        //                     0             1            2          3             4          5         6         7         8           9
        double[] meno;
        meno = new double [10];
        
        meno[0] = Math.random() * 100;
        meno[1] = Math.random() * 100;
        meno[2] = Math.random() * 100;
        meno[3] = Math.random() * 100;
        meno[4] = Math.random() * 100;
        meno[5] = Math.random() * 100;
        meno[6] = Math.random() * 100;
        meno[7] = Math.random() * 100;
        meno[8] = Math.random() * 100;
        meno[9] = Math.random() * 100;
        
        System.out.println("--------------MENÚ PAOLA´S--------------");
        System.out.println("Hamburguesas: " + meno[0]);
        System.out.println("Tortas: " + meno[1]);
        System.out.println("Chilaquiles: " + meno[2]);
        System.out.println("Gorditas: " + meno[3]);
        System.out.println("Burritos: " + meno[4]);
        System.out.println("Hotdog: " + meno[5]);
        System.out.println("Pizza: " + meno[6]);
        System.out.println("Bonelees: " + meno[7]);
        System.out.println("Tacos: " + meno[8]);
        System.out.println("Enchiladas: " + meno[9]);
        
    }
    
}
