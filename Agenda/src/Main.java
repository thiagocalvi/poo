/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago
 */

public class Main {
    
    public static void main(String[] args){
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anota(02,10,2012, "Dias das crianças");
        agenda2.anota(07,15,2012, "Independência do Brasil");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();

    }
}
