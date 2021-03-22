
package Ejercicio6;

/**
 *
 * @author Miguel Andrés
 */
public class Direccion {
    private String direccion_domi;
    private String direccion_trabajo;
    
    public Direccion(){
        this.direccion_domi = " ";
        this.direccion_trabajo = " ";
    }
    public Direccion(String dd, String dt){
        this.direccion_domi = dd;
        this.direccion_trabajo = dt;
    }
    
    //Ddomi
    public String getDireccion_domi() {return direccion_domi;
    }

    public void setDireccion_domi(String dd) {this.direccion_domi = dd;
    }

    //Dtrabajo
    public String getDireccion_trabajo() {return direccion_trabajo;
    }

    public void setDireccion_trabajo(String dt) {this.direccion_trabajo = dt;
    }
    
   
}
