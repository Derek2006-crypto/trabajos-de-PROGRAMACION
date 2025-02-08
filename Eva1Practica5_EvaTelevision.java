/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva.pkg1.practica.pkg5_.eva.television;

/**
 *
 * @author Derek
 */
public class Television {
    private boolean encendido;
    private int volumen;
    private int canal;

    
    public void encenderApagar(){
        if(encendido == true)//Tv encendida
            encendido = false; //apaga la Tv
        else
            encendido = true;
}

public void imprimirDatos(){
    if(encendido == true)
        System.out.println("TV Encendida!");
    else
        System.out.println("Tv Apagada");
    
    System.out.println("Volumen" + volumen);
    }
//Volumen requiere dos metodos; subir y bajar volumen
public void subirVolumen(){
    
}
    volumen += 1;//acumulador volumen = volumen + 1;
     public void bajarVolumen(){
    volumen -= 1;



public class Eva1Practica5_EvaTelevision 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Television tv = new Television();
        tv.imprimirDatos();
        tv.encenderApagar();//Boton de encendido del control
        tv.subirVolumen();
        tv.bajarVolumen();
        tv.imprimirDatos();
    }
    
}
