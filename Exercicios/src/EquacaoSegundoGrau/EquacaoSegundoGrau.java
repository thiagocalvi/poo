/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquacaoSegundoGrau;
import java.lang.Math;

/**
 *
 * @author thiago
 */
public class EquacaoSegundoGrau {
    public double a;
    public double b;
    public double c;
    public double delta;
    
    public EquacaoSegundoGrau(double a, double b, double c){
        if(a < 0){
            System.out.print("Error: 'a' dever ser maior que 0");
        }
        else{
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public void delta(){
        this.delta = (b*b) - 4*(a*c);
    }
    
    public void raizes(){
       double raiz_1 = (-b + Math.sqrt(this.delta))/2*this.a;
       double raiz_2 = (-b - Math.sqrt(this.delta))/2*this.a;
       
       System.out.println("Raiz 1:" + raiz_1 + "\n");
       System.out.println("Raiz 2:" + raiz_2 + "\n");

    }
}
