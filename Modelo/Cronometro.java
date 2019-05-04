/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalTime;

/**
 *
 * @author kachu
 */
public class Cronometro {
    private LocalTime HoraInicio ;
    
    private LocalTime HoraFinal ;
    
    public Cronometro (){
        this.HoraInicio = LocalTime.now();
    }
    
    public void comienza (){
        this.HoraInicio = LocalTime.now() ;
    }
    
    public void detiene (){
        this.HoraFinal = LocalTime.now();
    }
    
    public int tiempoTrans (){
        
        int segIni = HoraInicio.getNano();
        System.out.println(segIni);
        int segFinal = HoraFinal.getNano() ;
        System.out.println(segFinal);
        
        return segFinal - segIni ;
        
        
    }
    
    
}
