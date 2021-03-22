/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author Miguel Andrés
 */
public class Persona {
    private int dia;
    private int mes;
    private int año;
    
    public Persona(){
        this.dia=0; mes=0; año=0;  
    }
    
    public Persona(int d, int m, int a){
        this.dia=d; mes=m; año=a;
    }
  
    //Dia
    public int getDia() {return dia;
    }
    
    public void setDia(int d) {this.dia = d;
    }

    //Mes
    public int getMes() {return mes;
    }

    public void setMes(int m) {this.mes = m;
    }

    //Año
    public int getAño() {return año;
    }

    public void setAño(int a) {this.año = a;
    }
    
}
