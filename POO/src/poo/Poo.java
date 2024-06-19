/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author thiago
 */
public class Poo {
    public static void main(String[] args){
        Carro meuCarro = new Carro();
        meuCarro.setCor("PRETO");
        meuCarro.setTipo("PASSEIO");
        meuCarro.setPlaca("GGG-1111");
        meuCarro.setNumPortas(4);
        
        Carro meuOutroCarro = new Carro("BRANCO", "PASSEIO", "GGG-0000", 2);
        
        System.out.println("------------------Carro 1------------------");
        System.out.println("Cor:" + meuCarro.getCor());
        System.out.println("Tipo:" + meuCarro.getTipo());
        System.out.println("Placa:" + meuCarro.getPlaca());
        System.out.println("Portas:" + meuCarro.getNumPortas());
        
        System.out.println("------------------Carro 2------------------");
        System.out.println("Cor:" + meuOutroCarro.getCor());
        System.out.println("Tipo:" + meuOutroCarro.getTipo());
        System.out.println("Placa:" + meuOutroCarro.getPlaca());
        System.out.println("Portas:" + meuOutroCarro.getNumPortas());

        
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fulano de tal");
        pessoa1.setIdade(21);
        pessoa1.setCorCabelo("Verde");
        
        Pessoa pessoa2 = new Pessoa("Siclano", "Vermelho", 45);
        
        System.out.println("------------------Pessoa 1------------------");
        System.out.println("Nome:" + pessoa1.getNome());
        System.out.println("Idade:" + pessoa1.getIdade());
        System.out.println("Cor do Cabelo:" + pessoa1.getCorDeCabelo());
        
        System.out.println("------------------Pessoa 2------------------");
        System.out.println("Nome:" + pessoa2.getNome());
        System.out.println("Idade:" + pessoa2.getIdade());
        System.out.println("Cor do Cabelo:" + pessoa2.getCorDeCabelo());


        System.out.println("--------------------------------------------");
        pessoa1.setCarro(meuCarro);
        
        pessoa1.ligarCarro();
        pessoa1.setCambioMarcha(1);
        pessoa1.getCarro().getCambio();
        pessoa1.acelerarCarro();
        
        System.out.println();
        
        pessoa1.setCambioMarcha(2);
        pessoa1.getCarro().getCambio();
        pessoa1.acelerarCarro();
        
        System.out.println();
        
        pessoa1.setCambioMarcha(3);
        pessoa1.getCarro().getCambio();
        pessoa1.acelerarCarro();
        
        System.out.println();
        
        pessoa1.setCambioMarcha(2);
        pessoa1.getCarro().getCambio();
        pessoa1.acelerarCarro();

        System.out.println();
        
        pessoa1.setCambioMarcha(1);
        pessoa1.getCarro().getCambio();
        pessoa1.acelerarCarro();
        
        System.out.println();
        
        pessoa1.setCambioMarcha(0);
        pessoa1.getCarro().getCambio();
        pessoa1.desligarCarro();

        
    }
}
