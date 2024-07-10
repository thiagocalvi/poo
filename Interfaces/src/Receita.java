/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago
 */
public abstract class Receita {
    
    private String tipo_receita;
    
    public Receita(String tipo_receita){
        this.tipo_receita = tipo_receita;
    }
    
    public Receita(){}
    
    public abstract String getIngredientes();
    
    public abstract String getModoDeFazer();
    
}
