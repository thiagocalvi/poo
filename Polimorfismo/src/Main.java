/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import polimorfismoSobrecarga.Aviao;
import polimorfismoSobreposicao.Aviao2;
import polimorfismoSobreposicao.Carro;
import polimorfismoSobreposicao.Barco;
import polimorfismoDeInclusao.ControleRemoto;

/**
 *
 * @author thiago
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Polimorfismo de Sobrecarga.");
        Aviao aviao1 = new Aviao();
        aviao1.ligarMotor();
        aviao1.ligarMotor(2);
        System.out.println("---------------------------------------");
        
        
        System.out.println("Polimorfismo de Sobreposição.");
        Aviao2 aviao2 = new Aviao2();
        Barco barco = new Barco();
        Carro carro = new Carro();
        
        System.out.println("Avião");
        aviao2.mover();
        System.out.println("Barco");
        barco.mover();
        System.out.println("Carro");
        carro.mover();
        System.out.println("---------------------------------------");
        
        
        System.out.println("Polimorfismo de Inclusão.");
        Carro carro2 = new Carro();
        ControleRemoto controleRemoto = new ControleRemoto(carro2);
        
        System.out.println("Carro");
        controleRemoto.mover();
        System.out.println("----------------");
        
        controleRemoto.setBrinquedo(aviao2);
        System.out.println("Avião");
        controleRemoto.mover();
        System.out.println("----------------");
        
        controleRemoto.setBrinquedo(barco);
        System.out.println("Barco");
        controleRemoto.mover();

        
    }
    
}
