/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vetores;
import java.util.Scanner;
/**
 *
 * @author thiago
 */
public class Vetores {
    private int[] vetor = new int[10];
   
    
    public int getTamVetor(){
        return this.vetor.length;
    }
    
    public void popularVetor(){
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Informe o "+ i +"°" +" numero inteiro");
            this.vetor[i] = entrada.nextInt();
        }

    }
    
    public void mostarVetor(){       
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Numero: "+ this.vetor[i] + " no index "+ i);
            
        }
    }
}
