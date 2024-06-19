/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author thiago
 */
public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private int cambio;
    
    public Carro(){
        
    }
    
    public Carro(String tipo, String cor, String placa, int numPortas){
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    
    public int getNumPortas(){
        return this.numPortas;
    }
    
    public void setCambio(int cambio){
        this.cambio = cambio;
    }
    
    public int getCambio(){
        System.out.print("MARCHA " + this.cambio + "\n");
        return this.cambio;
    }
    
    public void ligar(){
        System.out.print("CARRO LIGADO \n");
    }
    
    public void desligar(){
        System.out.print("CARRO DESLIGADO \n");
    }
    
    public void acelerar(){
        System.out.print("CARRO ACELERANDO \n");
    }
    
    public void frear(){
        System.out.print("CARRO FREANDO \n");
    }
    
    public void manobrar(){
        System.out.print("Manobrando carro");
    }
}
