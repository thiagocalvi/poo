/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraIMC;
import java.lang.Math;
/**
 *
 * @author thiago
 */
public class CalculadoraIMC {
    private double peso;
    private double altura;
    private double imc;
    
    
    CalculadoraIMC(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public double calcularImc(){
        this.imc = Math.ceil(this.peso/ Math.pow(peso, 2.0));
        return this.imc;
    }
}
