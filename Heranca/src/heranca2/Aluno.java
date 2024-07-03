/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author thiago
 */
public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, String cpf, String dataNasc, String matricula) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    public void Aluno(){
        System.out.print("Nome: " + this.getNome());
        System.out.print("CPF: " + this.getCpf());
        System.out.print("Data nascimento: " + this.getDataNasc());
        System.out.print("Matricula: " + this.getMatricula());
    }
    
}
