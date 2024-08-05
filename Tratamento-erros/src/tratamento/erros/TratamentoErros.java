/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamento.erros;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author thiago
 */
public class TratamentoErros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador, denominador;
        float peso, altura;
        Scanner leitura = new Scanner(System.in);
        boolean loop = true;
        boolean loop2 = true;
        
        do{
            try{
                System.out.println("Entre com o numerador");
                numerador = leitura.nextInt();
                System.out.println("Entre com o denominador");
                denominador = leitura.nextInt();
                System.out.println("Resultado: " + numerador/denominador);    
                loop = false;
            }
            catch(InputMismatchException e){
                System.err.println("Exceção: " + e);
                leitura.nextLine();
                System.out.println("Entre com valores inteiros");
            }
            catch(ArithmeticException e){
                System.err.println("Exceção: " + e);
                leitura.nextLine();
                System.out.println("Entre com denominador valido");
            }
            
        }while(loop);
        
        
        do{
            try{
                System.out.println("Entre com a altura");
                altura = leitura.nextFloat();
                System.out.println("Entre com o peso");
                peso = leitura.nextFloat();
                System.out.println("IMC: " + peso/(altura * altura));    
                loop2 = false;
            }
            catch(InputMismatchException e){
                System.err.println("Exceção: " + e);
                leitura.nextLine();
                System.out.println("Entre com valores float");
            }
            catch(ArithmeticException e){
                System.err.println("Exceção: " + e);
                leitura.nextLine();
                System.out.println("Entre com altura valido");
            }
            
        }while(loop);
    }
    
}
