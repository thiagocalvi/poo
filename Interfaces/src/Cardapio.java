/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago
 */
public class Cardapio {

    public static void main(String[] args){
        Receita1 req1 = new Receita1("Doce");
        
        
        System.out.println(req1.getIngredientes());
        
        System.out.println(req1.getModoDeFazer());
        
        req1.cozinhar();
                
    }
}
