/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;
import java.util.Scanner;
import Calculadora.Calculadora;

/**
 *
 * @author thiago
 */
public class Menu {
    Scanner leitura = new Scanner(System.in);
    Calculadora cal = new Calculadora();
    
    byte opcao = 1;
    
    public void menu(){
        do{
            System.out.println("*****************************");
            System.out.println("0 - Sair");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("? - Opção: ");
            opcao = leitura.nextByte();
            System.out.println("*****************************");

            switch (opcao){
                case 0:
                    System.exit(0);
                case 1:
                    cal.somar();
                    break;
                case 2:
                    cal.subtrair();
                    break;
                case 3:
                    cal.multiplicar();
                    break;
                case 4:
                    cal.dividir();
                    break;
                default:
                    System.out.print("Opcao invalida");
            }    

        } while (opcao != 0 && opcao <= 4);
    
    }
}