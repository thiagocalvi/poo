/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;
import java.util.Scanner;
/**
 *
 * @author thiago
 */
public class Calculadora {
    Scanner leitor = new Scanner(System.in);
    
    public void somar(){
        System.out.print("Informe os operandos: ");

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int result = num1 + num2;
        System.out.print(num1 + " + " + num2 + " = " + result);

    }
    
    public void subtrair(){
        System.out.print("Informe os operandos: ");

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int result = num1 - num2;
        System.out.print(num1 + " - " + num2 + " = " + result);

    }
    
    public void dividir(){
        System.out.print("Informe os operandos: ");

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int result = num1 / num2;
        System.out.print(num1 + " / " + num2 + " = " + result);

    }
    public void multiplicar(){
        System.out.print("Informe os operandos: ");

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int result = num1 * num2;
        System.out.print(num1 + " * " + num2 + " = " + result);

    }

}
