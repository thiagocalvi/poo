/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author thiago
 */
public class Funcionario extends Pessoa {
    private String matricula;
    private String dataAdmissao;
    private double salario;

    public Funcionario(String matricula, String dataAdmissao, double salario, String nome, String cpf, String dataNasc) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void Funcionario(){
        System.out.print("Nome: " + this.getNome());
        System.out.print("CPF: " + this.getCpf());
        System.out.print("Data nascimento: " + this.getDataNasc());
        System.out.print("Matricula: " + this.getMatricula());
        System.out.print("Data Admissão: " + this.getDataAdmissao());
        System.out.print("Salario: " + this.getSalario());

    }
    
    
    
}
