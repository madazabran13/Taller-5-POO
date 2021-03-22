/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class PruebaParrafo {
    public static void main(String[] args) {
        Scanner par = new Scanner(System.in);
        int cont1=0,cont2=0, cont3=0;
        System.out.print("Escriba un parrafo: \n");
        String texto = par.nextLine();
        System.out.print("\n");
        Parrafo text = new Parrafo(texto);
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                cont1--;
            }
            cont1++; 
        }
        
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) == 'a') || (texto.charAt(i) == 'e') || (texto.charAt(i) == 'i') || (texto.charAt(i) == 'o') || (texto.charAt(i) == 'u')) {
               cont2++;
            }
        }
           
        text.parrafo(cont2);
        text.parraf( cont1-cont2);
    }

 
}
