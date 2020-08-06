/*
Diseñe e implemente una clase denominada Almacén_Repuestos que contenga los siguientes
atributos: propietario de tipo String, y cantidad de respuestos de tipo decimal; e implemente 
los metodos get, set y toString; un constructor sobrecargado, y otro constructor 
que permita inicializar las variables de la clase; adicionalmente, implemente dos 
métodos espaciales:
 */
package almacen_repuestosapp;

/**
 *
 * @author DARIO CHISAGUANO AIMACAÑA
 */
// Clase Almacen_Repuestos
class Almacen_Repuestos{
    private String propietario;
    private double cantidad_repuestos;
   
 // Constructores
    public Almacen_Repuestos(String propietario){
   this(propietario, 0); //Sobrecarga 
    }
    
    public Almacen_Repuestos(String propietario, double cantidad_repuestos){
    this.propietario=propietario;
    //si la cantidad de dinero es menor que cero, lo ponemos a cero
    if (cantidad_repuestos < 0){
        this.cantidad_repuestos = 0;
    } else {
        this.cantidad_repuestos = cantidad_repuestos;
    }
}
    
//Metodos
public void setPrpietario(String propietario){
    this.propietario = propietario;
}
public String getPropietario (){
    return propietario;
}
public void setCantidad_Repuestos (double cantidad_repuestos){
    this.cantidad_repuestos = cantidad_repuestos;
}
public double getCantidad_Repuestos (){
    return cantidad_repuestos;
}    

/**
 * Ingresa respuestos al almacen
 * solo si se trata de repuestos automotrices la cantidad_repuestos.
 */
public void Ingrese_Repuestos(double cantidad_repuestos){
    if (cantidad_repuestos > 0){
        this.cantidad_repuestos += cantidad_repuestos;
    }//cantidad_repuestos += cantidad_repuestos
}    

/** 
 * Retire una cantidad_dinero, si se quedara en negativo se 
 * requeriria en cero
 */
public void Retirar_Repuestos(double cantidad_repuestos){
    if(cantidad_repuestos < 0){
        this.cantidad_repuestos = cantidad_repuestos;
    } else {
        this.cantidad_repuestos -= cantidad_repuestos;
    } // cantidad_repuestos -= cantidad_repuestos-cantidad_repuestos
}

/** 
 * devuelve el estado del objeto
 * 
 * @ return
 */

   @Override
    public String toString (){
      return "  El propietario " + propietario + " tiene " + cantidad_repuestos +
            "  repuestos en el almacén  ";
    }
}
//Clase ejecutable

public class Almacen_RepuestosApp {

   public static void main(String[] args) {
        Almacen_Repuestos almacen_1 = new Almacen_Repuestos(" Dario Chisaguano ");
        Almacen_Repuestos almacen_2 = new Almacen_Repuestos(" Juan Lopez  ",300);
     
        
        // Ingreso de repuestos en el almacen
        almacen_1.Ingrese_Repuestos(300);
        almacen_2.Ingrese_Repuestos(400);
        
        //Retiro de dinero de las cuentas
        almacen_1.Retirar_Repuestos(500);
        almacen_2.Retirar_Repuestos(100);
        
        //Presentacion de informacion de las cuentas
        System.out.println(almacen_1); // repuestos
        System.out.println(almacen_2);// repuestos
    }
}


