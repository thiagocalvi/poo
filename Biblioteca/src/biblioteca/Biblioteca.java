/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author thiago
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario("Fulano", 45, "M", "44559999999");
        Livro livro1 = new Livro("O pequeno principe", "aaaaa", "nova", 4, 150);
        
        Emprestimo emprestimo = new Emprestimo("10/05/2023", "10:35:45", livro1, usuario);
        
        emprestimo.realizarEmprestimo();
    }
    
}
