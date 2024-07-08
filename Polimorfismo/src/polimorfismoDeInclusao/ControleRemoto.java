/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismoDeInclusao;
import polimorfismoSobreposicao.Brinquedo;
/**
 *
 * @author thiago
 */
public class ControleRemoto {
    private Brinquedo brinquedo;
    
    public ControleRemoto(Brinquedo b){
        this.brinquedo = b;
    }
    
    public ControleRemoto(){
        
    }
    
    public void setBrinquedo(Brinquedo b){
        this.brinquedo = b;
    }
    
    public void mover(){
        brinquedo.mover();
    }
}

