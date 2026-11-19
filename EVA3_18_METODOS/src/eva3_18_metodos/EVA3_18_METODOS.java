/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author paola
 */
public class EVA3_18_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //LLAMAR O INVOCAR EL MÉTODO
        mostrarMensaje("Hola mundo!!!");
        
        //QUE HACER CON METODOS QUE REGRESAN VALORES
        //1. RECUPERAR EL VALOR PARA USARLO DESPUES
        int resultados = sumar(10, 20);
        System.out.println("Suma de 10 + 20 = " + resultados);
        //2. USARLO DIRECTAMENTE
        System.out.println("Suma de 10 + 20 = " + sumar(10, 20));
        //3. NO IMPORTA EL VALOR RETORNO
        sumar(10, 20);
        
    }
    
    //modificadores valor de retorno
                       //DEBE SER UN VERBO INFINITIVO
                         //VARIAS PALABRAS: iniciar en minúsculas, demas iniciar en Mayúsculas
    public static void mostrarMensaje(String mensaje)//CABERCERA
    {    //CUERP DEL MÉTODO O IMPLEMENTACIÓN
        System.out.println(mensaje);   
    }
    
    public static int sumar(int val1, int val2){
        int resu = val1 + val2;
        return resu;
        
    }        
}
