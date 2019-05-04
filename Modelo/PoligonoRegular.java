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
public class PoligonoRegular {
    private int n ;
    private double lado ;
    private double x ;
    private double y ;
    
    public PoligonoRegular(){
        this.n = 3 ;
        this.lado = 1 ;
        this.x = 0;
        this.y = 0;
    }
    public PoligonoRegular(int n , double lado){
        this.n = n;
        this.lado = lado;
        this.x = 0;
        this.y = 0; 
    }
    
    public PoligonoRegular(int n , double lado, double x, double y){
        this.n = n;
        this.lado = lado;
        this.x = x;
        this.y = y; 
    }

    public int getN() {
        return n;
    }

    public double getLado() {
        return lado;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimetro(){
        return this.n * this.lado ;
    }
    
    public double getArea(){
        double a = (Math.PI*2)/n ;
        
        return (n*Math.pow(lado, 2))/(4*Math.tan(a/2)) ;
    }
    
    
}
