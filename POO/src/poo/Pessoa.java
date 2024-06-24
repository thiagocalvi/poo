/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author thiago
 */
public class Pessoa {
    private String nome;
    private String corDoCabelo;
    private int idade;
    private Carro carro ;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String corDoCabelo, int idade){
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.idade = idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCorCabelo(String corDeCabelo){
        this.corDoCabelo = corDeCabelo;
    }
    
    public String getCorDeCabelo(){
        return this.corDoCabelo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    public Carro getCarro(){
        return this.carro;
    }
    
    public void ligarCarro(){
        this.carro.ligar();
    }
    
    public void desligarCarro(){
        this.carro.desligar();
    }
    
    public void acelerarCarro(){
        this.carro.acelerar();
    }
    
    public void frearCarro(){
        this.carro.frear();
    }
    
    public void setCambioMarcha(int marcha){
        this.carro.setCambio(marcha);
    }
    
    public void andar(){
        System.out.print("Pessoa anda\n");
    }
    
    public void correr(){
        System.out.print("Pessoa corre\n");
    }
    
    public void dirigirCarro(Carro carro){
        
        System.out.print("Pessoa dirigindo carro\n");
    }
}
