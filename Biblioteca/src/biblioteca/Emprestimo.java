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

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    public Emprestimo(String dataEmprestimo, String horaEmprestimo, Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }
    
    
    
    public void realizarEmprestimo(){
        this.livro.setEmprestimo(true);
        System.out.println("Livro emprestado");
        
    }
    
    public void devolverLivro(){
        this.livro.setEmprestimo(false);
        System.out.println("Livro devolvido");

    }
    
    public void imprimirEmprestimo(){
        System.out.println("Data: " + this.dataEmprestimo);
        System.out.println("Livro: " + this.livro.getTitulo());
        System.out.println("Usuario: " + this.usuario.getNome());


    }
    
}
