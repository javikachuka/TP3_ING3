/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemMain;

import Modelo.Cronometro;
import Modelo.Ventilador;

/**
 *
 * @author kachu
 */
public class Main {
    
    public static void main(String[] args) {
        Ventilador v1 = new Ventilador();
        
        Ventilador v2 = new Ventilador() ;
        
        v1.setEncendido(true);
        v1.setVelocidad(3);
        v1.setRadio(10);
        v1.setColor("Amarillo");
        
        v2.setVelocidad(2);
        
        
        System.out.println("Ventilador 1 " + v1.toString());
        
        System.out.println("Ventilador 2 " + v2);
        
        
        /*
        Cronometro c1 = new Cronometro() ;
        
        for(int i = 1 ; i<1000 ; i++){
            c1.comienza();
        }
        
        c1.detiene();
        
        System.out.println("Tiempo trascurrido" + c1.tiempoTrans());
        */
    }
    
}
