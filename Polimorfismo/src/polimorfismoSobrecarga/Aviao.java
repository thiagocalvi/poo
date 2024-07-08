/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismoSobrecarga;

/**
 *
 * @author thiago
 */
public class Aviao {
    public Aviao(){
        
    }
    
    public void ligarMotor(){
        System.out.println("Ligando todos os moteres.");
    }
    
    public void ligarMotor(int motor){
        System.out.println("Ligando o motor " + motor +".");
    }
}
