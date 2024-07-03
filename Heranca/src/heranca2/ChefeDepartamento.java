/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author thiago
 */
public class ChefeDepartamento extends Funcionario{
    private String departamento;
    private String dataPromocao;
    private double gratificacao;
    
    public ChefeDepartamento(String matricula, String dataAdmissao, double salario, String nome, String cpf, String dataNasc, String departamento, double gratificacao, String dataPromocao){
        super(matricula, dataAdmissao, salario, nome, cpf, dataNasc);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public void ChefeDepartamento(){
        System.out.print("Nome: " + this.getNome());
        System.out.print("CPF: " + this.getCpf());
        System.out.print("Data nascimento: " + this.getDataNasc());
        System.out.print("Matricula: " + this.getMatricula());
        System.out.print("Data Admissão: " + this.getDataAdmissao());
        System.out.print("Salario: " + this.getSalario());
        System.out.print("Departamento: " + this.getDepartamento());
        System.out.print("Data de Admissão: " + this.getDataAdmissao());
        System.out.print("Gratificação: " + this.getGratificacao());
        
    }
}
