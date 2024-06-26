/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo;

/**
 *
 * @author thiago
 */
public class Candidato {
    private String nome;
    private int quantidadeVoto = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVoto(){
        return this.quantidadeVoto;
    }
    
    public void acresentarVoto(){
        this.quantidadeVoto += 1;
    }
}
