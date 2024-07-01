/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author thiago
 */
public class Transporte {
    protected int capacidade;
    
    public Transporte(){
        
    }
    
    public Transporte(int capacidade){
        this.capacidade = capacidade;
    }
        
    public int getCapacidade(){
        return this.capacidade;
    }
    
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
}
