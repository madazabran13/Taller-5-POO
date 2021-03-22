/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Miguel Andrés
 */
public class Parrafo {
    //atributos
    private String texto;
    
    //metodos
    public Parrafo(){
        texto = " ";
    }
    
    public Parrafo(String text) {
        this.texto = text;
    }

    public int parrafo (int nVocales){
        System.out.printf("El numero de vocales es: %d\n",nVocales);
        return 0;
    }
    
    public int parraf (int nConsonantes){
        System.out.printf("El numero de consonates es: %d\n",nConsonantes);
        return 0;
    }
    
    public int parrafoo(int Simbolos){
        
        return 0;
    }

    
    
}
