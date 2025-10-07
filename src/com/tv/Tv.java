package com.tv;

/**
 *
 * @author hanse
 */
public class Tv {
    private String marca;
    private double tamanio;
    private int volumen;
    private boolean encendido;
    
    //Default Constructor
    public Tv() {
        this.marca = "No especificado";
        this.tamanio = 0;
        this.volumen = 0;
        this.encendido = false;
    }
    //Overload Constructor
    public Tv(String marca, double tamanio, int volumen, boolean encendido) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.volumen = volumen;
        this.encendido = encendido;
    }
    
    //Getters and Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamanio() {
        return tamanio;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    //Methods
    public void encender() {
        if(isEncendido()) System.out.println("La TV ya esta encendida!");
        else {
            setEncendido(true);
            System.out.println("Encendiendo tv...");
        }
    }
    
    public void apagar() {
        if(!isEncendido()) System.out.println("La TV ya esta apagada!");
        else {
            setEncendido(false);
            System.out.println("Apagando tv...");
        }
    }
    
    public void subirVolumen() {
        //Verificamos primero si la tv esta encendida o no para proceder a cambiar el volumen
        if(!isEncendido()) System.out.println("La tv esta apagada. Enciendela para cambiar el volumen.");
        else {
            if(volumen >= 100) System.out.println("El volumen esta al maximo.");
            else {
                setVolumen(getVolumen()+1);
                System.out.println("Subiendo volumen");
            }
        }
    }
    public void bajarVolumen() {
        System.out.println("");
        //Verificamos primero si la tv esta encendida o no para proceder a cambiar el volumen
        if(!isEncendido()) System.out.println("La tv esta apagada. Enciendela para cambiar el volumen.");
        else {
            if(volumen <= 0) System.out.println("El volumen esta al minimo.");
            else {
                setVolumen(getVolumen()-1);
                System.out.println("Bajando volumen");
            }
        }
    }
}
