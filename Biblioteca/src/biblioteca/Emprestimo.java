/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author thiago
 */
public class Emprestimo {
    private String dataEmprestimo;
    private String horaEmprestimo;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(String dataEmprestimo, String horaEmprestimo, Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }
    
    
    
    public void realizarEmprestimo(){
        if (this.livro.getEmprestimo()){
            System.out.println("Livro já emprestado");
        }
        else{
            this.livro.setEmprestimo(true);
        }
        
    }
    
    public void imprimirEmprestimo(){
        
    }
    
}
