package com.tv;

/**
 *
 * @author hanse
 */
public class Prueba {
    public static void main(String[] args) {
        //Creamos un objeto con constructor por default
        Tv tv1 = new Tv();
        //Creacion de objetos con constructor sobrecargado
        Tv tv2 = new Tv("Samsung",32,50,false);
        Tv tv3 = new Tv("TCL",55,100,true);
        //Asigamos valores a los atributos del primer objeto
        tv1.setMarca("");
        tv1.setTamanio(24);
        tv1.setVolumen(99);
        tv1.setEncendido(true);
        
        //Invocacion de los metodos
        tv1.encender();
        tv1.apagar();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        
        tv2.apagar();
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        
        tv3.apagar();
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
    }
}
