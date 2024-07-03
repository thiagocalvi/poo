/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author thiago
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNasc;

    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void Pessoa(){
        System.out.print("Nome: " + this.getNome());
        System.out.print("CPF: " + this.getCpf());
        System.out.print("Data nascimento: " + this.getDataNasc());

    }
    
}
