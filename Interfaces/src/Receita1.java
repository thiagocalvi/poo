/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago
 */
public class Receita1 extends Receita implements Cozido{
    
    public Receita1(String tipo_receita){
        super(tipo_receita);
    }
    
    @Override
    public String getIngredientes(){
        return "Ingredientes";
    }
    
    @Override
    public String getModoDeFazer(){
        return "Modo de Fazer";
    }
    
    @Override
    public void cozinhar(){
        System.out.println("Cozinhando.....");
    }
}
