/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;



/**
 *
 * @author thiago
 */
public class Livro {
    private String titulo;
    private String autores;
    private String editora;
    private int edicao;
    private int numeroDePaginas;
    private boolean emprestimo;

    public Livro(String titulo, String autores, String editora, int edicao, int numeroDePaginas) {
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.edicao = edicao;
        this.numeroDePaginas = numeroDePaginas;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public boolean getEmprestimo(){
        return this.emprestimo;
    }
    
    public void setEmprestimo(boolean emprestimo){
        this.emprestimo = emprestimo;
    }
}
