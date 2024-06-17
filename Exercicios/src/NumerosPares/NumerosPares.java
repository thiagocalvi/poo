/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosPares;
import java.util.Scanner;
/**
 *
 * @author thiago
 */
public class NumerosPares {
    Scanner leitor = new Scanner(System.in);
    
    int number = 0;
    int i = 1;
    
    public void pares(){
        System.out.print("Informe um numero inteiro: ");
        number = leitor.nextInt();

        for(; i < number; ++i){
            if (i%2 == 0){
                System.out.print("Numero par: " + i + "\n");
            }
    
        }
        
        
        
    }
    
            
    

    
}
