/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author kachu
 */
public class Ventilador {
    
    private final int LENTO = 1;
    
    private final int MEDIO = 2;
    
    private final int RAPIDO = 3 ;
    
    private int velocidad ;
    
    private boolean encendido ;
    
    private double radio ;
    
    private String color ;
    
    public Ventilador (){
        
        this.velocidad = LENTO ;
        this.encendido = false;
        this.radio = 5;
        this.color = "azul" ;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString (){
        if(isEncendido()){
            return "Velociodad: " + this.velocidad + " Color: " + this.color + " Radio: " + this.radio ;
        } else{
            return "El ventilador esta apagado. Color: " +this.color + " Radio: " + this.radio ;
        }
    }
    
    
}
