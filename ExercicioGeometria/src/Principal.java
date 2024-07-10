/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago
 */
public class Principal {
    public static void main(String[] args){
        
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero();
        
        circulo.desenhar();
        quadrado.desenhar();
        triangulo.desenhar();
        trianguloEquilatero.desenhar();
    }
}
