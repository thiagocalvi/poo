/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author thiago
 */
public class terrestre extends transporte{
   
    private int numRodas;

    public terrestre(int capacidade, int numRodas){
        super(capacidade);
        this.numRodas = numRodas;
    }
    
    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    
}
