/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12calculadora;

/**
 *
 * @author Derek
 */
public class EVA1_12CALCULADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(sumar(10,2));
       System.out.println(restar(50,25));
       System.out.println(multiplicar(5,5));
       System.out.println(dividir(10,5));
       System.out.println(potencia(8,3));
       
       
       
            }
    public static int sumar (int valor1,int valor2){
        return valor1 + valor2;
    }
    public static int restar (int valor1,int valor2){
        return valor1 - valor2;
    }
    public static int dividir (int valor1,int valor2){
        return valor1/valor2;
    }
    public static int multiplicar(int valor1,int valor2){
        return valor1 * valor2;
    }
    public static int potencia(int valor1,int valor2){
        int resu = 1;
        for(int i = 0; i < valor2; i++){
            resu *= valor1;
        }
        return resu;
    }
    
}
