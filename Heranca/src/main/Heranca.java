/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import heranca.Automovel;

/**
 *
 * @author thiago
 */
public class Heranca {
    public static void main(String[] args){
        Automovel carro = new Automovel(4, 4, "GGG-4444", 4, "Carro");
        Automovel moto = new Automovel(2, 2, "AAS-7898", 0, "Moto");
        carro.imprimeDadosAutomovel();
        moto.imprimeDadosAutomovel();      
    }
}
